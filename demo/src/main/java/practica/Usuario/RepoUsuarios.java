package practica.Usuario;
import java.util.List;
import java.util.Optional;

import practica.Enums.*;
import practica.Sugerencia.MotorSugerencias;
import practica.Sugerencia.ProveedorDeMotor;

public class RepoUsuarios {
  static RepoUsuarios INSTANCE;
  private List<Usuario> usuarios;


    public RepoUsuarios(List<Usuario> usuarios){
        this.usuarios = usuarios;
    }

    public static RepoUsuarios getInstance(){return RepoUsuarios.INSTANCE;}
    public void generarSugerenciaDiaria(){
      usuarios.forEach((u)->u.sugerenciaDiaria(null));
    }
    public void reaccionarAlerta(Alertas alerta){
         usuarios.forEach((usuario) -> usuario.reaccionarAlerta(alerta));
    }
    
}
