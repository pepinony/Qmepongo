package practica;
import java.util.*;
import practica.Sugerencia.*;
import practica.Prendas.*;

public class Usuario {
    private int edad;
    private List<Prenda> prendas;
    private ProveedorDeMotor proveedor;

    public Usuario(int edad, ProveedorDeMotor proveedor){
        this.edad = edad;
        this.proveedor = proveedor;
    }

    public List<Sugerencia> sugerir(){
        return this.getMotor().generarSugerencias(this);
    }
    public List<Prenda> getPrendas(){return this.prendas;}
    public int getEdad(){return edad;}
    public MotorSugerencias getMotor(){ return this.proveedor.getMotor();}
}
