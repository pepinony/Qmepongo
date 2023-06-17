package practica.Clima;
import java.util.*;
import practica.Enums.*;

public class ProveedorAccuWeather implements ProveedorClima {
    private List<Map<String, Object>> condicionesClimaticas;
    private Map<String, Alertas> alerta;
    
    @Override
    public Clima getClima(String ciudad) {
        AccuWeatherAPI apiClima = new AccuWeatherAPI();
        this.condicionesClimaticas = apiClima.getWeather("Buenos Aires, Argentina");
        this.alerta = apiClima.getAlertas();
        return new Clima(condicionesClimaticas.get(0).get("PrecipitationProbability"), condicionesClimaticas.get(0).get("Temperature"), alerta.get("CurrentAlert"));
    }
    }