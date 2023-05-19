package practica.Prendas;
import practica.Enums.*;

public class TipoPrenda{
    private Categoria cat;
    
    public TipoPrenda(Categoria cat){this.cat = cat;}
    
    public Categoria categoria() {return this.cat;}

    //Const
    public final TipoPrenda remera = new TipoPrenda(Categoria.parteSuperior);
    public final TipoPrenda pantalon = new TipoPrenda(Categoria.parteInferior);
    public final TipoPrenda pollera = new TipoPrenda(Categoria.parteInferior);
    public final TipoPrenda camisa_manga_corta = new TipoPrenda(Categoria.parteSuperior);
    public final TipoPrenda blusa = new TipoPrenda(Categoria.parteSuperior);

    };
