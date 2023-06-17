package practica.Observers;

import practica.Enums.Alertas;
import practica.Usuario.Usuario;

public interface ObserverAlerta {
public void onAlert(Alertas alerta, Usuario usuario);
}