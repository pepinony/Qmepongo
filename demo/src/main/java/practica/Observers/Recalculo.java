package practica.Observers;

import java.util.Optional;
import practica.Enums.Alertas;
import practica.Sugerencia.ProveedorDeMotor;
import practica.Usuario.Usuario;

public class Recalculo implements ObserverAlerta {
public void onAlert(Alertas alerta, Usuario usuario){
    Optional<ProveedorDeMotor> motorAlerta = usuario.motorSegunAlerta(alerta)
    usuario.sugerenciaDiaria(motorAlerta);
};  
}

