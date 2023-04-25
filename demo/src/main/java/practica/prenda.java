package main.java.practica;

public class Prenda{
    private Tipo tipo;
    private colorerial mat = null;
    private Color color = null;
    private Color colorSecundario = null;
    private bool borrador = true;
    private bool todoExiste = (mat == null) || (tipo == null) || (color == null);
    

    public newPrenda(Tipo tipo){
        this.set(tipo, new setTipo());
    };

    public void segundaEspecificacion( Color color, optional<Color> colorSecundario, Material mat){ //Ver nombre del method
        this.setColor(color, colorSecundario);
        this.setMaterial(mat);
    }
    public void setMaterial(Material mat){
        this.set(mat, new setMaterial());
        this.borrador();
    }
    public void setColor(Color color, optional<Color> colorSecundario){
        this.set(color, new setColor());
        if(colorSecundario != null){this.colorSecundario = color;}
        this.borrador();
    }

    private set(Object atributo, setter type){if(atributo != null){type.call(this, atributo);}else{throw new RuntimeException("El dato no puede ser nulo");}}
    private void borrador(){this.borrador = this.todoExiste;}
    public Categoria categoria() {return this.tipo.categoria();}
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