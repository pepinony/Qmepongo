package practica.Usuario;
import java.util.*;
import practica.Sugerencia.*;
import practica.Prendas.*;

public class Usuario {
    private int edad;
    private List<Prenda> prendas;
    private List<Guardarropa> guardarropas;
    //private List<Guardarropa> guardarropasCompartido;
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

    public List<Prenda> getPrendas(){return this.prendas;}
    public int getEdad(){return edad;}
    public MotorSugerencias getMotor(){ return this.proveedor.getMotor();}
}

/* 
     public void crearGuardarropa(List<Prenda> prendas, String nombre){
        this.guardarropas.add(new Guardarropa(prendas, nombre));
    }
    public void compartirGuardarropa(Guardarropa guardarropa, Usuario usuario){
        usuario.recibirGuardarropa(guardarropa);
    }
    public void recibirGuardarropa(Guardarropa guardarropa){
        this.guardarropasCompartido.add(guardarropa);
    }

 */