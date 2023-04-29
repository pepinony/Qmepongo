package main.java.practica;

public class Prenda{
    private Tipo tipo;
    private colorerial mat;
    private Color color;
    private Color colorSecundario;
    private bool todoExiste = (mat == null) || (tipo == null) || (color == null);
    

    public newPrenda(Tipo tipo, Color color, optional<Color> colorSecundario, Material mat){
        this.set(tipo, new setTipo());
        this.setColor(color, colorSecundario);
        this.setMaterial(mat);
    };
    public Categoria categoria() {return this.tipo.categoria();}
}

public class Borrador{
    private Tipo tipo;
    private colorerial mat = null;
    private Color color = null;
    private Color colorSecundario = null;
    private bool todoExiste = (mat == null) || (tipo == null) || (color == null);

    public newBorrador(Tipo tipo){this.setTipo(tipo);}
    public Prenda guardarPrenda(){if(this.todoExiste){newPrenda(tipo, color, colorSecundario, mat);}}
    public void setTipo(Tipo tipo){
        this.set(tipo, new setTipo());
    }
    public void setMaterial(Material mat){
        this.set(mat, new setMaterial());
    }
    public void setColor(Color color, optional<Color> colorSecundario){
        this.set(color, new setColor());
        if(colorSecundario != null){this.colorSecundario = color;}
    }
    private set(Object atributo, setter type){if(atributo != null){type.call(this, atributo);}else{throw new RuntimeException("El dato no puede ser nulo");}}
}

interface setter{
    public void call(Object parametro, Object atributo);
}

class setTipo implements setter{
    public void call(Object parametro, Object atributo){
        parametro.tipo = atributo;
    }
}
class setColor implements setter{
    public void call(Object parametro, Object atributo){
        parametro.tipo = atributo;
    }
}
class setMaterial implements setter{
    public void call(Object parametro, Object atributo){
        parametro.tipo = atributo;
    }
}