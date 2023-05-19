package practica.Sugerencia;
import practica.Prendas.Prenda;

public class Sugerencia{
    private Prenda superior;
    private Prenda inferior;
    private Prenda calzado;

    public Sugerencia(Prenda superior, Prenda inferior, Prenda calzado){
        this.superior = superior;
        this.inferior = inferior;
        this.calzado = calzado;
    }
    public Prenda getSuperior(){return this.superior;}
    public Prenda getInferior(){return this.inferior;}
    public Prenda getCalzado(){return this.calzado;}
}