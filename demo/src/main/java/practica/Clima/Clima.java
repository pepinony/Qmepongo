package practica.Clima;
import java.util.*;

public class Clima{
    static Clima INSTANCE;
    private List<Map<String, Object>> condicionesClimaticas;

    public void conocerClima(){ //Hacer q lo haga una vez cada 6hs 
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        this.condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");}
    
    public static Clima getInstance(){return Clima.INSTANCE;}
    public Object vaALlover(){return condicionesClimaticas.get(0).get("PrecipitationProbability");}
    public Object temperatura(){return condicionesClimaticas.get(0).get("Temperature");}

 
}
