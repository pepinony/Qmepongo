package main.java.practica;

public class Prenda{
    public Categoria cat;
    public Material mat;
    public Tipo tipo;
    public Color colorP;
    public Color colorS = void.class;

    public Prenda(){};

}

public enum Material{}
public enum Categoria{
    parteSuperior, parteInferior, calzado, accesorios
    };
public enum Tipo{
    remera(Categoria.parteSuperior), pantalon(Categoria.parteInferior), pollera(Categoria.parteInferior), camisa_manga_corta(Categoria.parteSuperior), blusa(Categoria.parteSuperior)
    };

public class color{
    private int red;
    private int green;
    private int blue;

    public Color(){};

    public void setColor(int r, int g, int b){
        if (this.nValido(b) && this.nValido(g) && this.nValido(r)){
            red = r;
            green = g;
            blue = b;
        }else{
            throw new RuntimeException("Color invalido, debe ajustarse al estandar RGB");
        }
        
    }
    private bool nValido(int n) {return (255<n)&&(n>0);}
    public String queColor() {return Integer.toHexString(this.r) + Integer.toHexString(this.g) + Integer.toHexString(this.b);}
}

