package main.java.practica;

public class Material{
    private Trama trama = Trama.lisa;

    public newMaterial(oprional<Trama> trama){
        if(trama!=null){this.trama = trama;}
    }

    public Trama queTrama(){return this.trama;}
}

public enum Trama{
    lisa, rayada, lunares, estampados, aCuadros
}