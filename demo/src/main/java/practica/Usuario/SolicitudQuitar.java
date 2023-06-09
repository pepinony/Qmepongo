package practica.Usuario;
import practica.Prendas.*;



public class SolicitudQuitar implements Solicitud {
    private Guardarropa guardarropa;
    private Prenda prenda;

    public SolicitudQuitar(Guardarropa guardarropa, Prenda prenda) {
        this.guardarropa = guardarropa;
        this.prenda = prenda;
    }

    public void deshacer(){
        this.guardarropa.agregarPrenda(prenda);
    }
    public void efectuar(){
        this.guardarropa.sacarPrenda(prenda);
    }
}