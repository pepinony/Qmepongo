package practica.Sugerencia;
import practica.Usuario.*;
import practica.Prendas.Prenda;
import practica.Clima.*;

import java.util.*;
import java.util.stream.Stream;
import com.google.common.collect.Lists;
//import javax.xml.transform.stream.StreamResult;

public class MotorSugerencias{
    private Stream<Criterio> criterios;
    //Correegir herencia
   public List<Sugerencia> generarSugerencias(Usuario usuario){
        List<Prenda> prendasSuperior = this.prendasValidas(usuario).filter(p -> p.isSuperior()).toList();
        List<Prenda> prendasInferior = this.prendasValidas(usuario).filter(p -> p.isInferior()).toList();
        List<Prenda> calzados = this.prendasValidas(usuario).filter(p -> p.isCalzado()).toList();

        List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperior, prendasInferior, calzados);

        return combinaciones.stream().map(c -> new Sugerencia(c.get(0), c.get(1), c.get(2))).toList();
    }
    private Stream<Prenda> prendasValidas(Usuario usuario){
        List<Stream<Prenda>> posibles = criterios.map(p->p.getPrendasValidas(usuario)).toList();
        return Stream.concat(posibles.get(0), posibles.get(1)).distinct();
    }

}


interface Criterio{
    public Stream<Prenda> getPrendasValidas(Usuario usuario);
}
class CriterioClima implements Criterio{
    private ServicioMeteorologico servicioMeteorologico;

    public CriterioClima(ServicioMeteorologico servicio){
        this.servicioMeteorologico = servicio;
    }

    public Stream<Prenda> getPrendasValidas(Usuario usuario){
       return usuario.getPrendas().stream().filter(p -> p.isAptoTemperatura(servicioMeteorologico.getClima())); //Implemtentar isAptoTemperatura
    }

}
class CriterioFormalidad implements Criterio{
   
    public Stream<Prenda> getPrendasValidas(Usuario usuario){
        if(usuario.getEdad()>55) {return usuario.getPrendas().stream().filter(p -> p.isFormal());} else return usuario.getPrendas().stream();
    }
}




