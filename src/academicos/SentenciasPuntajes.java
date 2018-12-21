package academicos;
public class SentenciasPuntajes {
    public static String LISTAR = "SELECT * FROM tipos_puntajes, clases, puntajes, alumnos, modulos "
            + "WHERE tipos_puntajes.ID_TIPOPUNTAJE = puntajes.ID_TIPOPUNTAJE AND "
            + "clases.ID_CLASE = puntajes.ID_CLASE AND "
            + "clases.ID_ALUMNO = alumnos.ID_ALUMNO AND "
            + "clases.ID_MODULO = modulos.ID_MODULO";
    public static String ACTUALIZAR = "UPDATE puntajes SET " 
            + "ID_TIPOPUNTAJE = ?, " 
            + "ID_CLASE = ?, " 
            + "PUNTAJE = ?, " 
            + "OBS = ?, "
            + "TOT_PUNTAJE = ? "
            + "WHERE ID_PUNTAJE = ?";
    public static String ELIMINAR = "DELETE FROM puntajes WHERE ID_PUNTAJE = ?"; 
    private String ID_PUNTAJE;
    private Integer ID_TIPOPUNTAJE;
    private Integer ID_CLASE;
    private Integer PUNTAJE;
    private String OBS;
    private Integer TOT_PUNTAJE;

    public Integer getTOT_PUNTAJE() {
        return TOT_PUNTAJE;
    }

    public void setTOT_PUNTAJE(Integer TOT_PUNTAJE) {
        this.TOT_PUNTAJE = TOT_PUNTAJE;
    }
    

    public String getID_PUNTAJE() {
        return ID_PUNTAJE;
    }

    public void setID_PUNTAJE(String ID_PUNTAJE) {
        this.ID_PUNTAJE = ID_PUNTAJE;
    }

    public Integer getID_TIPOPUNTAJE() {
        return ID_TIPOPUNTAJE;
    }

    public void setID_TIPOPUNTAJE(Integer ID_TIPOPUNTAJE) {
        this.ID_TIPOPUNTAJE = ID_TIPOPUNTAJE;
    }

    public Integer getID_CLASE() {
        return ID_CLASE;
    }

    public void setID_CLASE(Integer ID_CLASE) {
        this.ID_CLASE = ID_CLASE;
    }

    public Integer getPUNTAJE() {
        return PUNTAJE;
    }

    public void setPUNTAJE(Integer PUNTAJE) {
        this.PUNTAJE = PUNTAJE;
    }

    public String getOBS() {
        return OBS;
    }

    public void setOBS(String OBS) {
        this.OBS = OBS;
    }
    
}
