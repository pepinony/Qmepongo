package practica.Sugerencia;
import practica.Usuario;
import practica.Prendas.Prenda;
import practica.Clima.*;

import java.util.*;
import java.util.stream.Stream;
import com.google.common.collect.Lists;
//import javax.xml.transform.stream.StreamResult;

public abstract class MotorSugerencias{
   public List<Sugerencia> generarSugerencias(Usuario usuario){
        List<Prenda> prendasSuperior = this.getPrendasValidas(usuario).filter(p -> p.isSuperior()).toList();
        List<Prenda> prendasInferior = this.getPrendasValidas(usuario).filter(p -> p.isInferior()).toList();
        List<Prenda> calzados = this.getPrendasValidas(usuario).filter(p -> p.isCalzado()).toList();

        List<List<Prenda>> combinaciones = Lists.cartesianProduct(prendasSuperior, prendasInferior, calzados);

        return combinaciones.stream().map(c -> new Sugerencia(c.get(0), c.get(1), c.get(2))).toList();};
    abstract public Stream<Prenda> getPrendasValidas(Usuario usuario);
}

class MotorSugerenciasFormalidad extends MotorSugerencias{
    @Override
    public Stream<Prenda> getPrendasValidas(Usuario usuario){
        if(usuario.getEdad()>55) {return usuario.getPrendas().stream().filter(p -> p.isFormal());} else return usuario.getPrendas().stream();
    }
}

class MotorSugerenciasClima extends MotorSugerencias{
    @Override
    public Stream<Prenda> getPrendasValidas(Usuario usuario){
       return usuario.getPrendas().stream().filter(p -> p.isAptoTemperatura(Clima.getInstance().temperatura())); //Implemtentar isAptoTemperatura
    }

}


