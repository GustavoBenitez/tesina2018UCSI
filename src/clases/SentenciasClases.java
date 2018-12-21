package clases;
public class SentenciasClases {
    public static String LISTAR = "SELECT * FROM clases c, alumnos, gabinetes, horarios, modulos, docentes "
            + "WHERE c.ID_DOCENTE = docentes.ID_DOCENTE AND "
            + "c.ID_ALUMNO = alumnos.ID_ALUMNO AND "
            + "c.ID_GABINETE = gabinetes.ID_GABINETE AND "
            + "c.ID_HORARIO = horarios.ID_HORARIO AND "
            + "c.ID_MODULO = modulos.ID_MODULO "
            + "ORDER BY ID_CLASE ASC";
    public static String ACTUALIZAR = "UPDATE clases SET " 
            + "ID_DOCENTE = ?, "
            + "ID_ALUMNO = ?, " 
            + "ID_GABINETE = ?, "
            + "ID_HORARIO = ?, "
            + "ID_MODULO = ?, "
            + "TEMA = ?, "
            + "ACTIVIDAD = ?, "
            + "FECHA_CLASE = ? "
            + "WHERE ID_CLASE = ?";
    public static String ELIMINAR = "DELETE FROM clases WHERE ID_CLASE = ?";
    private String ID_CLASE;
    private Integer ID_DOCENTE;
    private Integer ID_ALUMNO;
    private Integer ID_GABINETE;
    private Integer ID_HORARIO;
    private Integer ID_MODULO;
    private String TEMA;
    private String ACTIVIDAD;
    private String FECHA_CLASE;

    public String getFECHA_CLASE() {
        return FECHA_CLASE;
    }

    public void setFECHA_CLASE(String FECHA_CLASE) {
        this.FECHA_CLASE = FECHA_CLASE;
    }
    

    public String getID_CLASE() {
        return ID_CLASE;
    }

    public void setID_CLASE(String ID_CLASE) {
        this.ID_CLASE = ID_CLASE;
    }

    public Integer getID_DOCENTE() {
        return ID_DOCENTE;
    }

    public void setID_DOCENTE(Integer ID_DOCENTE) {
        this.ID_DOCENTE = ID_DOCENTE;
    }

    public Integer getID_ALUMNO() {
        return ID_ALUMNO;
    }

    public void setID_ALUMNO(Integer ID_ALUMNO) {
        this.ID_ALUMNO = ID_ALUMNO;
    }

    public Integer getID_GABINETE() {
        return ID_GABINETE;
    }

    public void setID_GABINETE(Integer ID_GABINETE) {
        this.ID_GABINETE = ID_GABINETE;
    }

    public Integer getID_HORARIO() {
        return ID_HORARIO;
    }

    public void setID_HORARIO(Integer ID_HORARIO) {
        this.ID_HORARIO = ID_HORARIO;
    }

    public Integer getID_MODULO() {
        return ID_MODULO;
    }

    public void setID_MODULO(Integer ID_MODULO) {
        this.ID_MODULO = ID_MODULO;
    }

    public String getTEMA() {
        return TEMA;
    }

    public void setTEMA(String TEMA) {
        this.TEMA = TEMA;
    }

    public String getACTIVIDAD() {
        return ACTIVIDAD;
    }

    public void setACTIVIDAD(String ACTIVIDAD) {
        this.ACTIVIDAD = ACTIVIDAD;
    }
    
}
