package practica.Usuario;
import java.util.*;
import practica.Sugerencia.*;
import practica.Prendas.*;
import practica.Clima.ProveedorAccuWeather;
import practica.Clima.ServicioMeteorologico;
import practica.Enums.*;
import practica.Observers.*;

public class Usuario {
    private int edad;
    private Sugerencia sugerenciaDiaria;
    private List<ObserverAlerta> observers;
    private List<Prenda> prendas;
    private List<Guardarropa> guardarropas;
    private ProveedorDeMotor proveedor;


    public Usuario(int edad, ProveedorDeMotor proveedor){
        this.edad = edad;
        this.proveedor = proveedor;
    }

    public List<Sugerencia> sugerir(){
        return this.getMotor().generarSugerencias(this);
    }
    public void crearGuardarropa(List<Prenda> prendas, String nombre, boolean compartido, Optional<Usuario> usuario){
        Guardarropa gr = new Guardarropa(prendas, nombre, compartido);
        this.guardarropas.add(gr);
        if(compartido){usuario.get().recibirGuardarropa(gr);}
    }
    public void recibirGuardarropa(Guardarropa guardarropa){
        this.guardarropas.add(guardarropa);
    }
    public void sugerenciaDiaria(Optional<ProveedorDeMotor> proveedorNuevo){
       if(proveedorNuevo != null){this.proveedor=proveedorNuevo.get();};
       Sugerencia sugDiaria = this.getMotor().sugerirUno(this);
       this.sugerenciaDiaria = sugDiaria;
    }
    public void reaccionarAlerta(Alertas alerta){
        observers.forEach((o)->o.onAlert(alerta, this));
    }
    public void agregarObserverAlerta(ObserverAlerta observer){ observers.add(observer);}
    public void sacarObserverAlerta(ObserverAlerta observer){ observers.remove(observer);}
    public Optional<ProveedorDeMotor> motorSegunAlerta(Alertas alerta){return Optional.of(new ProveedorDeMotor(new MotorSugerencias()));}


    public List<Prenda> getPrendas(){return this.prendas;}
    public int getEdad(){return edad;}
    public Sugerencia getSugerenciaDiaria(){return sugerenciaDiaria;}
    public MotorSugerencias getMotor(){ return this.proveedor.getMotor();}
}
