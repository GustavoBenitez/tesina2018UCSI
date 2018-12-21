package academicos;
public class SentenciasTipoPuntajes {
    public static String LISTAR = "SELECT * FROM tipos_puntajes";
    public static String REGISTRAR= "INSERT INTO tipos_puntajes(TIPO_PUNTAJE) VALUES(?)";
    public static String ACTUALIZAR = "UPDATE tipos_puntajes SET " 
            + "TIPO_PUNTAJE = ? " 
            + "WHERE ID_TIPOPUNTAJE = ?";
    public static String ELIMINAR = "DELETE FROM tipos_puntajes WHERE ID_TIPOPUNTAJE = ?";
    private String TIPO_PUNTAJE;
    private String ID_TIPOPUNTAJE;

    public String getTIPO_PUNTAJE() {
        return TIPO_PUNTAJE;
    }

    public void setTIPO_PUNTAJE(String TIPO_PUNTAJE) {
        this.TIPO_PUNTAJE = TIPO_PUNTAJE;
    }

    public String getID_TIPOPUNTAJE() {
        return ID_TIPOPUNTAJE;
    }

    public void setID_TIPOPUNTAJE(String ID_TIPOPUNTAJE) {
        this.ID_TIPOPUNTAJE = ID_TIPOPUNTAJE;
    } 
}
