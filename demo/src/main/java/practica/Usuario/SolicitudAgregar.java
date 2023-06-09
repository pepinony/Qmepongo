package practica.Usuario;
import practica.Prendas.*;



public class SolicitudAgregar implements Solicitud {
    private Guardarropa guardarropa;
    private Prenda prenda;

    public SolicitudAgregar(Guardarropa guardarropa, Prenda prenda) {
        this.guardarropa = guardarropa;
        this.prenda = prenda;
    }

    public void deshacer(){
        this.guardarropa.sacarPrenda(prenda);
    }
    public void efectuar(){
        this.guardarropa.agregarPrenda(prenda);
    }
}

interface Solicitud {
    public void efectuar();
    public void deshacer();
}