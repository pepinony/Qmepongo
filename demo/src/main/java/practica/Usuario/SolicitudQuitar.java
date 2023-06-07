package practica.Usuario;
import practica.Prendas.*;



public class SolicitudQuitar implements Solicitud {
    private Guardarropa guardarropa;
    private Prenda prenda;

    public SolicitudQuitar(Guardarropa guardarropa, Prenda prenda) {
        this.guardarropa = guardarropa;
        this.prenda = prenda;
    }

    public void proponer(){
        this.guardarropa.proponerQuitar(prenda);
    }
}