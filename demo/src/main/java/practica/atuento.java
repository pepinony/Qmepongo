package main.java.practica;

public class Atuento {
    private Prenda superior;
    private Prenda inferior;
    private Prenda calzado;
    private Set<Prenda> accesorios;

    public newAtuendo(Prenda superior, Prenda inferior, Prenda calzado, Set<Prenda> accesorios){
        this.superior = superior;
        this.inferior = inferior;
        this.calzado = calzado;
        this.accesorios = accesorios;
    };

    //public void agregarPrenda(Prenda){}
}

public class Uniforme{
    private Prenda superior;
    private Prenda inferior;
    private Prenda calzado;
    
    public newUniforme(Prenda superior, Prenda inferior, Prenda calzado){
        this.superior = superior;
        this.inferior = inferior;
        this.calzado = calzado; 
    }

    public void sugerir(){} //Revolea uniformes ya armados 
}