package practica.Prendas;
import practica.Enums.*;
import java.util.Optional;

public class Borrador{
    private TipoPrenda tipoPrenda;
    private Formalidad formalidad;
    private Material mat = null;
    private Color color = null;
    private Optional<Color> colorSecundario = null;
    private boolean todoExiste = (mat == null) || (tipoPrenda == null) || (color == null);

    public Borrador(TipoPrenda tipoPrenda){this.setTipo(tipoPrenda);}
    public Prenda guardarPrenda(){
        if(this.todoExiste){return new Prenda(tipoPrenda, color, colorSecundario, mat, formalidad);}
            else{throw new RuntimeException("Faltan Datos");}
        }

    public void setTipo(TipoPrenda tipoPrenda){
        this.set(tipoPrenda, new setTipo());
    }
    public void setFormalidad(Formalidad formalidad){
        this.set(formalidad, new setFormalidad());
    }
    public void setMaterial(Material mat){
        this.set(mat, new setMaterial());
    }
    public void setColor(Color color, Optional<Color> colorSecundario){
        this.set(color, new setColor());
        if(colorSecundario != null){this.colorSecundario = colorSecundario;}
    }
    private void set(Object atributo, setter type){if(atributo != null){type.call(this, atributo);}else{throw new RuntimeException("El dato no puede ser nulo");}}
}

interface setter{
    public void call(Object parametro, Object atributo);
}

class setTipo implements setter{
    public void call(Object parametro, Object atributo){
        parametro.tipoPrenda = atributo;
    }
}
class setColor implements setter{
    public void call(Object parametro, Object atributo){
        parametro.color = atributo;
    }
}
class setMaterial implements setter{
    public void call(Object parametro, Object atributo){
        parametro.mat = atributo;
    }
}
class setFormalidad implements setter{
    public void call(Object parametro, Object atributo){
        parametro.formalidad = atributo;
}}