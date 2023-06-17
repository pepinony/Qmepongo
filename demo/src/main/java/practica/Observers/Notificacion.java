package practica.Observers;

import practica.Enums.Alertas;
import practica.Usuario.Usuario;

public class Notificacion implements ObserverAlerta {
    public void onAlert(Alertas alerta, Usuario usuario){
        alerta.getMensaje();
    }
}
