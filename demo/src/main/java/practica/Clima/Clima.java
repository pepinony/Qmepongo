package practica.Clima;

import practica.Enums.Alertas;

public class Clima {
    private Object probabilidadLluvia;
    private Object temperatura;
    private Alertas alerta;

    public Clima(Object probabilidadLluvia, Object temperatura, Alertas alerta){
        this.probabilidadLluvia= probabilidadLluvia;
        this.temperatura = temperatura;
        this.alerta = alerta;
    };

    public Object getProbabilidadLluvia() {
        return probabilidadLluvia;
    }
    public Object getTemperatura() {
        return temperatura;
    }   
    public Alertas getAlerta() {
        return alerta;
    }
}
