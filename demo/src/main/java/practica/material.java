package main.java.practica;

public class Material{
    private Trama trama = Trama.lisa;
    private Tela tela;

    public newMaterial(Tela tela, oprional<Trama> trama){
        this.tela = tela;
        if(trama!=null){this.trama = trama;}
    }

    public Trama queTrama(){return this.trama;}
}

public enum Trama{
    lisa, rayada, lunares, estampados, aCuadros
}
public enum Tela{
    algodon, poliester, lana
}