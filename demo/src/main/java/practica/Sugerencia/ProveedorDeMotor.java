package practica.Sugerencia;

public class ProveedorDeMotor{
    static ProveedorDeMotor INSTANCE;
    private MotorSugerencias motor;

    static ProveedorDeMotor getInstance(){
        return ProveedorDeMotor.INSTANCE;
    }


    public MotorSugerencias getMotor(){
        return motor;
    }
    public void setMotor(MotorSugerencias motor){
        this.motor = motor;
    }
}