/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proveedores;

/**
 *
 * @author Gustavo
 */
public class SentenciasProveedor {
      public static String LISTAR = "SELECT * FROM proveedores, ciudades c WHERE proveedores.ID_CIUDAD = c.ID_CIUDAD";
    //public static String REGISTRAR= "INSERT INTO funcionarios(ID_FUNCIONARIO, ID_CIUDAD, NOM_FUN, APE_FUN, CI_FUN, CELULAR_FUN,DIRECCION_FUN, EMAIL_FUN) " 
    //        + "VALUES(?,?,?,?,?,?,?,?)";
    public static String ACTUALIZAR = "UPDATE proveedores SET " 
            + "ID_CIUDAD = ?, "
            + "NOM_PRO = ?, " 
            + "APE_PRO = ?, "
            + "DREC_PRO = ?, "
            + "CEDU_PRO = ?, "
            + "CELU_PRO = ?, "
            + "RUC_PRO = ?, "
            + "EMAIL_PRO = ? "
            + "WHERE ID_PROVEEDOR = ?";
    public static String ELIMINAR = "DELETE FROM proveedores WHERE ID_PROVEEDOR = ?";
    private int ID_CIUDAD;
    private String NOM_PRO;
    private String APE_PRO;
    private String DREC_PRO;
    private String CEDU_PRO;
    private String CELU_PRO;
    private String RUC_PRO;
    private String EMAIL_PRO;
    private String ID_PROVEEDOR;
    
    public int getID_CIUDAD() {
        return ID_CIUDAD;
    }

    public void setID_CIUDAD(int ID_CIUDAD) {
        this.ID_CIUDAD = ID_CIUDAD;
    }

    public String getNOM_PRO() {
        return NOM_PRO;
    }

    public void setNOM_PRO(String NOM_PRO) {
        this.NOM_PRO = NOM_PRO;
    }

    public String getAPE_PRO() {
        return APE_PRO;
    }

    public void setAPE_PRO(String APE_PRO) {
        this.APE_PRO = APE_PRO;
    }

    public String getDREC_PRO() {
        return DREC_PRO;
    }

    public void setDREC_PRO(String DREC_PRO) {
        this.DREC_PRO = DREC_PRO;
    }

    public String getCEDU_PRO() {
        return CEDU_PRO;
    }

    public void setCEDU_PRO(String CEDU_PRO) {
        this.CEDU_PRO = CEDU_PRO;
    }

    public String getCELU_PRO() {
        return CELU_PRO;
    }

    public void setCELU_PRO(String CELU_PRO) {
        this.CELU_PRO = CELU_PRO;
    }

    public String getRUC_PRO() {
        return RUC_PRO;
    }

    public void setRUC_PRO(String RUC_PRO) {
        this.RUC_PRO = RUC_PRO;
    }

    public String getEMAIL_PRO() {
        return EMAIL_PRO;
    }

    public void setEMAIL_PRO(String EMAIL_PRO) {
        this.EMAIL_PRO = EMAIL_PRO;
    }

    public String getID_PROVEEDOR() {
        return ID_PROVEEDOR;
    }

    public void setID_PROVEEDOR(String ID_PROVEEDOR) {
        this.ID_PROVEEDOR = ID_PROVEEDOR;
    }
     
            
}
