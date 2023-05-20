package practica.Clima;

public class Clima {
    private Object probabilidadLluvia;
    private Object temperatura;

    public Clima(Object probabilidadLluvia, Object temperatura){
        this.probabilidadLluvia= probabilidadLluvia;
        this.temperatura = temperatura;
    };

    public Object getProbabilidadLluvia() {
        return probabilidadLluvia;
    }
    public Object getTemperatura() {
        return temperatura;
    }
}
