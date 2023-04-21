package main.java.practica;

public class Prenda{
    public Material mat;
    public Tipo tipo;
    public Color color;
    

    public newPrenda(Material mat, Tipo tipo, Color color){
        this.mat = mat;
        this.tipo = tipo;
        this.color = color;
        this.todoCoincide();
    };

    private void todoCoincide(){
        if((mat == null) || (tipo == null) || (color == null)){throw new RuntimeException("Error con la carga de datos");}
    }
    public Categoria categoria() {return this.tipo.categoria();}
}

public enum Material{}
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
