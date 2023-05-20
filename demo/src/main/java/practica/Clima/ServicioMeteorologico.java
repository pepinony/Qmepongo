package practica.Clima;
import java.util.*;

//import org.checkerframework.checker.units.qual.Temperature;
//import practica.Sugerencia.ProveedorDeMotor;

public class ServicioMeteorologico{
    private ProveedorClima proveedor;
    private String ciudad;

    private Clima condicionesClimaticas;

    public ServicioMeteorologico(ProveedorClima proveedor, String ciudad) {
        this.proveedor = proveedor;
        this.ciudad = ciudad;
      }

    public void conocerClima(){ //Hacer q lo haga una vez cada 6hs 
        this.condicionesClimaticas = proveedor.getClima(ciudad);}
    
    public Object getTemperaura(){return condicionesClimaticas.getTemperatura();}
    public Clima getClima(){return condicionesClimaticas;}
}

interface ProveedorClima{
    public Clima getClima(String ciudad);
}

class ProveedorAccuWeather implements ProveedorClima {
    private List<Map<String, Object>> condicionesClimaticas;
    
    @Override
    public Clima getClima(String ciudad) {
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        this.condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
        return new Clima(condicionesClimaticas.get(0).get("PrecipitationProbability"), condicionesClimaticas.get(0).get("Temperature"));
    }
    }
class OtroProveedor implements ProveedorClima{
    @Override 
    public Clima getClima(String ciudad){return new Clima(null, null);}
}