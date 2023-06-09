package practica.Usuario;
import java.util.*;
import practica.Prendas.*;

public class Guardarropa {
    private String nombre;
    private boolean compartido;
    private List<Solicitud> solicitudesPendientes;
    private List<Solicitud> solicitudesAprobadas;
    
    private List<Prenda> prendas;
    
    public Guardarropa(List<Prenda> prendas, String nombre, boolean compartido){
        this.nombre = nombre;
        this.prendas = prendas;
        this.compartido = compartido;
    }
    
    public boolean isCompartido() {return compartido;}
    public List<Prenda> getPrendas() {return prendas;}
    public String getNombre() {return nombre;}
    public List<Solicitud> getSolicitudesPendientes(){return solicitudesPendientes;}
    public void sacarPendiente(Solicitud solicitud){solicitudesPendientes.remove(solicitud);}
    public void agregarAprobada(Solicitud solicitud){solicitudesAprobadas.add(solicitud);}
    public void sacarAprobada(Solicitud solicitud){solicitudesAprobadas.remove(solicitud);}
    public void agregarPrenda(Prenda prenda){prendas.add(prenda);}
    public void sacarPrenda(Prenda prenda){prendas.remove(prenda);}

    

    public void proponerAgregar(Prenda prenda) {
        this.solicitudesPendientes.add(new SolicitudAgregar(this, prenda));}
    public void proponerQuitar(Prenda prenda) {
        this.solicitudesPendientes.add(new SolicitudQuitar(this, prenda));}
    public void rechazarSolicitud(Solicitud solicitud){this.sacarPendiente(solicitud);}
    public void aprobarSolicitud(Solicitud solicitud){
        solicitud.efectuar();
        this.rechazarSolicitud(solicitud);
        this.agregarAprobada(solicitud);}
    public void deshacerAprobada(Solicitud solicitud){
        solicitud.deshacer();
        this.sacarAprobada(solicitud);
    }
}
