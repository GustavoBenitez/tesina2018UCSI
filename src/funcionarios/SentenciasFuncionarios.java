
package funcionarios;

/**
 *
 * @author Gustavo
 */
public class SentenciasFuncionarios {
    public static String LISTAR = "SELECT * FROM funcionarios, ciudades c WHERE funcionarios.ID_CIUDAD = c.ID_CIUDAD";
    //public static String REGISTRAR= "INSERT INTO funcionarios(ID_FUNCIONARIO, ID_CIUDAD, NOM_FUN, APE_FUN, CI_FUN, CELULAR_FUN,DIRECCION_FUN, EMAIL_FUN) " 
    //        + "VALUES(?,?,?,?,?,?,?,?)";
    public static String ACTUALIZAR = "UPDATE funcionarios SET " 
            + "ID_CIUDAD = ?, "
            + "NOM_FUN = ?, " 
            + "APE_FUN = ?, "
            + "CI_FUN = ?, "
            + "CELULAR_FUN = ?, "
            + "DIRECCION_FUN = ?, "
            + "EMAIL_FUN = ? "
            + "WHERE ID_FUNCIONARIO = ?";
    public static String ELIMINAR = "DELETE FROM funcionarios WHERE ID_FUNCIONARIO = ?";
    
   private String  ID_FUNCIONARIO;         
   private Integer ID_CIUDAD;               
   private String  NOM_FUN;                 
   private String  APE_FUN;              
   private String  DIRECCION_FUN;           
   private String  EMAIL_FUN;          
   private String  CELULAR_FUN;    
   private String  CI_FUN;

    public String getID_FUNCIONARIO() {
        return ID_FUNCIONARIO;
    }

    public void setID_FUNCIONARIO(String ID_FUNCIONARIO) {
        this.ID_FUNCIONARIO = ID_FUNCIONARIO;
    }

    public Integer getID_CIUDAD() {
        return ID_CIUDAD;
    }

    public void setID_CIUDAD(Integer ID_CIUDAD) {
        this.ID_CIUDAD = ID_CIUDAD;
    }

    public String getNOM_FUN() {
        return NOM_FUN;
    }

    public void setNOM_FUN(String NOM_FUN) {
        this.NOM_FUN = NOM_FUN;
    }

    public String getAPE_FUN() {
        return APE_FUN;
    }

    public void setAPE_FUN(String APE_FUN) {
        this.APE_FUN = APE_FUN;
    }

    public String getDIRECCION_FUN() {
        return DIRECCION_FUN;
    }

    public void setDIRECCION_FUN(String DIRECCION_FUN) {
        this.DIRECCION_FUN = DIRECCION_FUN;
    }

    public String getEMAIL_FUN() {
        return EMAIL_FUN;
    }

    public void setEMAIL_FUN(String EMAIL_FUN) {
        this.EMAIL_FUN = EMAIL_FUN;
    }

    public String getCELULAR_FUN() {
        return CELULAR_FUN;
    }

    public void setCELULAR_FUN(String CELULAR_FUN) {
        this.CELULAR_FUN = CELULAR_FUN;
    }

    public String getCI_FUN() {
        return CI_FUN;
    }

    public void setCI_FUN(String CI_FUN) {
        this.CI_FUN = CI_FUN;
    }

   
   
}
