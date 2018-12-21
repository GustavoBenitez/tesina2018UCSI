package funcionarios;
/**
 *
 * @author Gustavo
 */
public class SentenciasUsuarios {
        private Integer ID_USUARIO;
        private String USUARIO;
        private String PASSW;
        private String IP_PERFIL;
        private String IP_FUNCIONARIO;

    public String getIP_PERFIL() {
        return IP_PERFIL;
    }

    public void setIP_PERFIL(String IP_PERFIL) {
        this.IP_PERFIL = IP_PERFIL;
    }

    public String getIP_FUNCIONARIO() {
        return IP_FUNCIONARIO;
    }

    public void setIP_FUNCIONARIO(String IP_FUNCIONARIO) {
        this.IP_FUNCIONARIO = IP_FUNCIONARIO;
    }

    public Integer getID_USUARIO() {
        return ID_USUARIO;
    }

    public void setID_USUARIO(Integer ID_USUARIO) {
        this.ID_USUARIO = ID_USUARIO;
    }

    
     public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getPASSW() {
        return PASSW;
    }

    public void setPASSW(String PASSW) {
        this.PASSW = PASSW;
    }
}

