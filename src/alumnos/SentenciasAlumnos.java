package alumnos;
public class SentenciasAlumnos {
    public static String LISTAR = "SELECT * FROM alumnos, ciudades c WHERE alumnos.ID_CIUDAD = c.ID_CIUDAD";
    public static String REGISTRAR= "INSERT INTO alumnos(ID_ALUMNO, ID_CIUDAD, NOM_ALUM, APE_ALUM, CI_ALUM, DIRECC_ALUM, EMAIL_ALUM, CELU_ALUM)" 
            + "VALUES(?,?,?,?,?,?,?,?)";
    public static String ACTUALIZAR = "UPDATE alumnos SET " 
            + "ID_CIUDAD = ?, "
            + "NOM_ALUM = ?, " 
            + "APE_ALUM = ?, "
            + "CI_ALUM = ?, "
            + "DIRECC_ALUM = ?, "
            + "EMAIL_ALUM = ?, "
            + "CELU_ALUM = ? "
            + "WHERE ID_ALUMNO = ?";
    public static String ELIMINAR = "DELETE FROM alumnos WHERE ID_ALUMNO = ?";
    
   private String  ID_ALUMNO;         
   private Integer ID_CIUDAD;               
   private String  NOM_ALUM;                 
   private String  APE_ALUM; 
   private String  CI_ALUM;
   private String  DIRECC_ALUM;           
   private String  EMAIL_ALUM;          
   private String  CELU_ALUM;    

    public String getID_ALUMNO() {
        return ID_ALUMNO;
    }

    public void setID_ALUMNO(String ID_ALUMNO) {
        this.ID_ALUMNO = ID_ALUMNO;
    }

    public Integer getID_CIUDAD() {
        return ID_CIUDAD;
    }

    public void setID_CIUDAD(Integer ID_CIUDAD) {
        this.ID_CIUDAD = ID_CIUDAD;
    }

    public String getNOM_ALUM() {
        return NOM_ALUM;
    }

    public void setNOM_ALUM(String NOM_ALUM) {
        this.NOM_ALUM = NOM_ALUM;
    }

    public String getAPE_ALUM() {
        return APE_ALUM;
    }

    public void setAPE_ALUM(String APE_ALUM) {
        this.APE_ALUM = APE_ALUM;
    }

    public String getCI_ALUM() {
        return CI_ALUM;
    }

    public void setCI_ALUM(String CI_ALUM) {
        this.CI_ALUM = CI_ALUM;
    }

    public String getDIRECC_ALUM() {
        return DIRECC_ALUM;
    }

    public void setDIRECC_ALUM(String DIRECC_ALUM) {
        this.DIRECC_ALUM = DIRECC_ALUM;
    }

    public String getEMAIL_ALUM() {
        return EMAIL_ALUM;
    }

    public void setEMAIL_ALUM(String EMAIL_ALUM) {
        this.EMAIL_ALUM = EMAIL_ALUM;
    }

    public String getCELU_ALUM() {
        return CELU_ALUM;
    }

    public void setCELU_ALUM(String CELU_ALUM) {
        this.CELU_ALUM = CELU_ALUM;
    }
  

}
