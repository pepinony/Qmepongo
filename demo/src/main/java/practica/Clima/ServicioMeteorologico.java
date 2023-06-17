package practica.Clima;
import java.util.*;
import practica.Enums.*;
import practica.Usuario.RepoUsuarios;

//import org.checkerframework.checker.units.qual.Temperature;
//import practica.Sugerencia.ProveedorDeMotor;

public class ServicioMeteorologico{
    private ProveedorClima proveedor;
    private String ciudad;
    private List<Alertas> alertas;
    private Clima condicionesClimaticas;

    public ServicioMeteorologico(ProveedorClima proveedor, String ciudad) {
        this.proveedor = proveedor;
        this.ciudad = ciudad;
      }

    public void conocerClima(){ //Hacer q lo haga una vez cada 6hs 
        this.condicionesClimaticas = proveedor.getClima(ciudad);
    }
    public void actualizarAlertas(){
        alertas.add(condicionesClimaticas.getAlerta());
        RepoUsuarios.getInstance().reaccionarAlerta(condicionesClimaticas.getAlerta());
    }
    public Object getTemperaura(){return condicionesClimaticas.getTemperatura();}
    public Clima getClima(){return condicionesClimaticas;}
}

interface ProveedorClima{
    public Clima getClima(String ciudad);
}


class OtroProveedor implements ProveedorClima{
    @Override 
    public Clima getClima(String ciudad){return new Clima(null, null, Alertas.Lluvia);}
}