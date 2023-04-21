package main.java.practica;

public class Prenda{
    public Categoria cat;
    public Material mat;
    public Tipo tipo;
    public Color color;
    

    public Prenda(){};

    private void todoCoincide(){
        if((cat == tipo.categoria()) && (tipo != void.class) && (color != void.class)){}
        else{throw new RuntimeException("Error con los tipos de datos");}
    }
}

public enum Material{}
public enum Categoria{
    parteSuperior, parteInferior, calzado, accesorios
    };
public enum Tipo{
    remera(Categoria.parteSuperior), pantalon(Categoria.parteInferior), pollera(Categoria.parteInferior), camisa_manga_corta(Categoria.parteSuperior), blusa(Categoria.parteSuperior);
    private Tipo cat;

    private Tipo(Categoria cat){this.cat = cat;}
    public Categoria categoria() { return this.cat;}
    };

public class Color{
    private int red;
    private int green;
    private int blue;

    public Color(){};

    public void setColor(int r, int g, int b){
        if (this.nValido(b) && this.nValido(g) && this.nValido(r)){
            this.asignar(r, g, b);
        }else{
            throw new RuntimeException("Color invalido, debe ajustarse al estandar RGB");
        }
        
    }
    private bool nValido(int n) {return (255<n)&&(n>0);}
    private void asignar(int r, int g, int b){this.red=r;this.green=g;this.blue=b;}
    public String queColorPrincipal() {return Integer.toHexString(this.r) + Integer.toHexString(this.g) + Integer.toHexString(this.b);}
}

public class ColorSecundario extends Color{
    private int redS;
    private int greenS;
    private int blueS;

    public ColorSecundario(){};

    @Override
    private void asignar(int r, int g, int b){this.redS=r;this.greenS=g;this.blueS=b;}
}
