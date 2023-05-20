package practica.Prendas;
import practica.Enums.*;
import practica.Clima.*;
import java.util.Optional;

public class Prenda{
    private TipoPrenda tipoPrenda;
    private Formalidad formalidad;
    private Material mat;
    private Color color;
    private Color colorSecundario;
    

    public Prenda(TipoPrenda tipoPrenda, Color color, Optional<Color> colorSecundario2, Material mat, Formalidad formalidad){
        this.tipoPrenda=tipoPrenda;
        this.color=color;
        if(colorSecundario2!=null){this.colorSecundario=colorSecundario2.get();}
        this.mat=mat;
        this.formalidad=formalidad;
    };
    public Categoria categoria() {return this.tipoPrenda.categoria();}
    public boolean isFormal(){return this.formalidad==Formalidad.formal;}
    public boolean isSuperior(){return this.categoria() == Categoria.parteSuperior;}
    public boolean isInferior(){return this.categoria() == Categoria.parteInferior;}
    public boolean isCalzado(){return this.categoria() == Categoria.calzado;}
    public Material getMaterial(){return this.mat;}
    public Color getColor(){return this.color;}
    public Color getColorSecundario(){ return this.colorSecundario;}
    public boolean isAptoTemperatura(Clima clima){return true;} //hacerlo bien
}