package practica.Enums;

public enum Alertas {
    Tormenta, Granizo, Lluvia, Huracan, Tornado;
    public String getMensaje(){
        switch(this){
            case Tormenta: return "Lleva paraguas";
            case Granizo: return "No salgas con el auto";
            default: return " ";
        }
    }
}
