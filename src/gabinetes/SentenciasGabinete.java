package gabinetes;
public class SentenciasGabinete {
    public static String LISTAR = "SELECT * FROM gabinetes";
    public static String REGISTRAR= "INSERT INTO gabinetes(" 
             + "CODIGO,"
             + "HABILITADO, "
             + "ENUSO) "
             + "VALUES(?,?,?)";
    public static String ACTUALIZAR = "UPDATE gabinetes SET "
            // + "ID_GABINETE = ?, "
            + "CODIGO = ?, "
            + "HABILITADO = ?, " 
            + "ENUSO = ? " 
            + "WHERE ID_GABINETE = ?";
     public static String ELIMINAR = "DELETE FROM gabinetes WHERE ID_GABINETE = ?";
    private String ID_GABINETE;
    private String CODIGO;
    private String  HABILITADO;
    private String ENUSO;

    public String getENUSO() {
        return ENUSO;
    }

    public void setENUSO(String ENUSO) {
        this.ENUSO = ENUSO;
    }
    

    public String getID_GABINETE() {
        return ID_GABINETE;
    }

    public void setID_GABINETE(String ID_GABINETE) {
        this.ID_GABINETE = ID_GABINETE;
    }

    public String getCODIGO() {
        return CODIGO;
    }

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getHABILITADO() {
        return HABILITADO;
    }

    public void setHABILITADO(String HABILITADO) {
        this.HABILITADO = HABILITADO;
    }

   
    
}
