package docentes;
public class SentenciasDocentes {
    public static String LISTAR = "SELECT * FROM docentes d, ciudades"
             + " WHERE d.ID_CIUDAD = ciudades.ID_CIUDAD ";
     public static String LISTAR_CURSO_DOCENTE = "SELECT * FROM lista_docentes_cursos li, cursos, docentes"
             + " WHERE docentes.ID_DOCENTE = li.ID_DOCENTE AND cursos.ID_CURSO = li.ID_CURSO";
    public static String ACTUALIZAR = "UPDATE docentes SET " 
            + "ID_CIUDAD = ?, "
            + "NOM_DOCENT = ?, " 
            + "APE_DOCENT = ?, "
            + "CI_DOCENT = ?, "
            + "EMAIL_DOCENTE = ?, "
            + "DIREC_DOCENT = ?, "
            + "CELU_DOCENT = ? "
            + "WHERE ID_DOCENTE = ?";
    public static String ELIMINAR = "DELETE FROM docentes WHERE ID_DOCENTE = ?";
    private String ID_DOCENTE;
    private Integer ID_CIUDAD;
    private String  NOM_DOCENT;
    private String APE_DOCENT;
    private String CI_DOCENT;
    private String EMAIL_DOCENTE;
    private String DIREC_DOCENT;
    private String CELU_DOCENT;         

    public String getID_DOCENTE() {
        return ID_DOCENTE;
    }

    public void setID_DOCENTE(String ID_DOCENTE) {
        this.ID_DOCENTE = ID_DOCENTE;
    }

    public Integer getID_CIUDAD() {
        return ID_CIUDAD;
    }

    public void setID_CIUDAD(Integer ID_CIUDAD) {
        this.ID_CIUDAD = ID_CIUDAD;
    }

    public String getNOM_DOCENT() {
        return NOM_DOCENT;
    }

    public void setNOM_DOCENT(String NOM_DOCENT) {
        this.NOM_DOCENT = NOM_DOCENT;
    }

    public String getAPE_DOCENT() {
        return APE_DOCENT;
    }

    public void setAPE_DOCENT(String APE_DOCENT) {
        this.APE_DOCENT = APE_DOCENT;
    }

    public String getCI_DOCENT() {
        return CI_DOCENT;
    }

    public void setCI_DOCENT(String CI_DOCENT) {
        this.CI_DOCENT = CI_DOCENT;
    }

    public String getEMAIL_DOCENTE() {
        return EMAIL_DOCENTE;
    }

    public void setEMAIL_DOCENTE(String EMAIL_DOCENTE) {
        this.EMAIL_DOCENTE = EMAIL_DOCENTE;
    }

    public String getDIREC_DOCENT() {
        return DIREC_DOCENT;
    }

    public void setDIREC_DOCENT(String DIREC_DOCENT) {
        this.DIREC_DOCENT = DIREC_DOCENT;
    }

    public String getCELU_DOCENT() {
        return CELU_DOCENT;
    }

    public void setCELU_DOCENT(String CELU_DOCENT) {
        this.CELU_DOCENT = CELU_DOCENT;
    }
}
