package main.java.practica;

public class Prenda{
    private Material mat;
    private Tipo tipo;
    private Color color;
    private Color colorSecundario;
    

    public newPrenda(Material mat, Tipo tipo, Color color, optional<Color> colorSecundario){
        this.mat = mat;
        this.tipo = tipo;
        this.color = color;
        this.colorSecundario = colorSecundario;
        this.todoExiste();
    };

    private void todoExiste(){
        if((mat == null) || (tipo == null) || (color == null)){throw new RuntimeException("Error con la carga de datos");}
    }
    public Categoria categoria() {return this.tipo.categoria();}
}

public enum Material{}
