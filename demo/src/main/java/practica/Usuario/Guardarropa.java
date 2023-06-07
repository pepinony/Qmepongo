package practica.Usuario;
import java.util.*;
import practica.Sugerencia.*;
import practica.Prendas.*;

public class Guardarropa {
    private String nombre;
    private boolean compartido;
    private List<Solicitud> solicitudesAgregar;
    private List<Solicitud> solicitudesQuitar;
    
    private List<Prenda> prendas;
    
    public Guardarropa(List<Prenda> prendas, String nombre, boolean compartido){
        this.nombre = nombre;
        this.prendas = prendas;
        this.compartido = compartido;
    }
    
    public boolean isCompartido() {return compartido;}
    public List<Solicitud> getSolicitudesQuitar() {return solicitudesQuitar;}
    public List<Solicitud> getSolicitudesAgregar() {return solicitudesAgregar;}
    public List<Prenda> getPrendas() {return prendas;}
    public String getNombre() {return nombre;}
    
    public void proponerAgregar(Prenda prenda) {
        this.solicitudesAgregar.add(new SolicitudAgregar(this, prenda));}
    public void proponerQuitar(Prenda prenda) {
        this.solicitudesQuitar.add(new SolicitudQuitar(this, prenda));}

}
