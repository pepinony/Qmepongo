package practica.Prendas;
import practica.Enums.*;
import java.util.Optional;

public class Material{
    private Trama trama = Trama.lisa;
    private Tela tela;

    public Material(Tela tela, Optional<Trama> trama){
        this.tela = tela;
        if(trama!=null){this.trama = trama.get();}
    }

    public Trama queTrama(){return this.trama;}
    public Tela getTela(){return this.tela;}
}


