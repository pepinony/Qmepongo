package practica.Usuario;
import practica.Prendas.*;



public class SolicitudAgregar implements Solicitud {
    private Guardarropa guardarropa;
    private Prenda prenda;

    public SolicitudAgregar(Guardarropa guardarropa, Prenda prenda) {
        this.guardarropa = guardarropa;
        this.prenda = prenda;
    }

    public void proponer(){
        this.guardarropa.proponerAgregar(prenda);
    }
}

interface Solicitud {
    public void proponer();
}