package main.java.practica;

public class Color{
    private int red;
    private int green;
    private int blue;

    public Color(){};

    public newColor(int r, int g, int b){
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

/**Rever
public class ColorMinoritario extends Color{
    private int redS;
    private int greenS;
    private int blueS;

    public ColorMinoritario(){};

    @Override
    private void asignar(int r, int g, int b){this.redS=r;this.greenS=g;this.blueS=b;}
}**/
