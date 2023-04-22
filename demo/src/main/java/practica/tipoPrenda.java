package main.java.practica;

public enum Categoria{
    parteSuperior, parteInferior, calzado, accesorios
    };
public class Tipo{
    private Categoria cat;
    
    private Tipo(Categoria cat){this.cat = cat;}

    public Categoria categoria() {return this.cat;}

    //Const
    public final Tipo remera = new Tipo(parteSuperior);
    public final Tipo pantalon = new Tipo(parteInferior);
    public final Tipo pollera = new Tipo(parteInferior);
    public final Tipo camisa_manga_corta = new Tipo(parteSuperior);
    public final Tipo blusa = new Tipo(parteSuperior);

    };
