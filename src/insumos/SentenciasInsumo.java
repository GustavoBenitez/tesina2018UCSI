package insumos;

public class SentenciasInsumo {
//<------------------------Sentencias de Tipo Insumos------------------------------------------>//
    public static String LISTAR = "SELECT * FROM categoria_insumo ";
    public static String REGISTRAR= "INSERT INTO categoria_insumo(TIPO_INSUMO) VALUES(?)";
    public static String ACTUALIZAR = "UPDATE categoria_insumo SET " 
            + "TIPO_INSUMO = ? "
            + "WHERE ID_CATEINSUMO = ?";
    public static String ELIMINAR = "DELETE FROM categoria_insumo WHERE ID_CATEINSUMO = ?";
    private Integer ID_CATEINSUMO;
    private String TIPO_INSUMO;

    public Integer getID_CATEINSUMO() {
        return ID_CATEINSUMO;
    }

    public void setID_CATEINSUMO(Integer ID_CATEINSUMO) {
        this.ID_CATEINSUMO = ID_CATEINSUMO;
    }
    
    public String getTIPO_INSUMO() {
        return TIPO_INSUMO;
    }

    public void setTIPO_INSUMO(String TIPO_INSUMO) {
        this.TIPO_INSUMO = TIPO_INSUMO;
    }
}
