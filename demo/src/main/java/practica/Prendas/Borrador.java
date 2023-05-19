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
        this.noNulo(tipoPrenda);
        this.tipoPrenda=tipoPrenda;
    }
    public void setFormalidad(Formalidad formalidad){
        this.noNulo(formalidad);
        this.formalidad=formalidad;
    }
    public void setMaterial(Material mat){
        this.noNulo(mat);
        this.mat=mat;
    }
    public void setColor(Color color, Optional<Color> colorSecundario){
        this.noNulo(colorSecundario);
        this.color=color;
        if(colorSecundario != null){this.colorSecundario = colorSecundario;}
    }
    private void noNulo(Object atributo){if(atributo == null){throw new RuntimeException("El dato no puede ser nulo");}}
}