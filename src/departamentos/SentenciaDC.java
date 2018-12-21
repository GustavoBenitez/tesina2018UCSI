
package departamentos;

/**
 *
 * @author Gustavo
 */
public class SentenciaDC {
    public static String LISTAR = "SELECT * FROM departamentos";
    public static String LISTAR_CIU = "SELECT * FROM ciudades c, departamentos WHERE"
            + " c.ID_DEPARTAMENTO = departamentos.ID_DEPARTAMENTO";
    public static String REGISTRAR= "INSERT INTO departamentos(NOM_DEPARTAMENTO) VALUES(?)";
    public static String ACTUALIZAR = "UPDATE departamentos SET NOM_DEPARTAMENTO = ? WHERE ID_DEPARTAMENTO = ?";
    public static String ACTUALIZAR_CIU = "UPDATE ciudades SET " 
            + "ID_CIUDAD = ?, "
            + "ID_DEPARTAMENTO = ?, "
            + "NOM_CIUDAD = ?,"
            + "WHERE ID_CIUDAD = ?";
    public static String ELIMINAR = "DELETE FROM departamentos WHERE ID_DEPARTAMENTO = ?";
    private String  ID_DEPARTAMENTO;
    private String  NOM_DEPARTAMENTO;
    private Integer NRO_DEPARTAMENTO;

    private String ID_CIUDAD;
    private String NOM_CIUDAD;
    private Integer FK_DEPARTAMENTO;

    public String getID_CIUDAD() {
        return ID_CIUDAD;
    }

    public void setID_CIUDAD(String ID_CIUDAD) {
        this.ID_CIUDAD = ID_CIUDAD;
    }

    public String getNOM_CIUDAD() {
        return NOM_CIUDAD;
    }

    public void setNOM_CIUDAD(String NOM_CIUDAD) {
        this.NOM_CIUDAD = NOM_CIUDAD;
    }

    public Integer getFK_DEPARTAMENTO() {
        return FK_DEPARTAMENTO;
    }

    public void setFK_DEPARTAMENTO(Integer FK_DEPARTAMENTO) {
        this.FK_DEPARTAMENTO = FK_DEPARTAMENTO;
    }
    public String getID_DEPARTAMENTO() {
        return ID_DEPARTAMENTO;
    }

    public void setID_DEPARTAMENTO(String ID_DEPARTAMENTO) {
        this.ID_DEPARTAMENTO = ID_DEPARTAMENTO;
    }

    public String getNOM_DEPARTAMENTO() {
        return NOM_DEPARTAMENTO;
    }

    public void setNOM_DEPARTAMENTO(String NOM_DEPARTAMENTO) {
        this.NOM_DEPARTAMENTO = NOM_DEPARTAMENTO;
    }

    public Integer getNRO_DEPARTAMENTO() {
        return NRO_DEPARTAMENTO;
    }

    public void setNRO_DEPARTAMENTO(Integer NRO_DEPARTAMENTO) {
        this.NRO_DEPARTAMENTO = NRO_DEPARTAMENTO;
    }



   
}
