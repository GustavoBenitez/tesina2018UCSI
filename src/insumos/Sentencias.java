/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insumos;

/**
 *
 * @author Gustavo
 */
public class Sentencias {
    //<------------------------Sentencias de Insumos------------------------------------------>//  
    public static String LISTAR_INSU = "SELECT * FROM insumos_varios i, categoria_insumo, proveedores"
            + " WHERE i.ID_CATEINSUMO = categoria_insumo.ID_CATEINSUMO"
            + " AND i.ID_PROVEEDOR = proveedores.ID_PROVEEDOR ORDER BY i.ID_INSUMO ASC";
    public static String REGISTRAR_INSU= "INSERT INTO insumos_varios(ID_INSUMO,ID_CATEINSUMO, ID_PROVEEDOR, PRECIO_COMPRA, NOM_INSUMO, STOCK) "
            + "VALUES(?,?,?,?,?,?)";
    public static String ACTUALIZAR_INSU = "UPDATE insumos_varios SET " 
            + "ID_CATEINSUMO = ?, "
            + "ID_PROVEEDOR = ?, "
            + "PRECIO_COMPRA = ?, "
            + "NOM_INSUMO = ?, "
            + "STOCK = ? "
            + "WHERE ID_INSUMO = ?";
    public static String ELIMINAR_INSU = "DELETE FROM insumos_varios WHERE ID_INSUMO = ?";
    private String ID_INSUMO;
    private Integer FK_CATEINSUMO;
    private Integer FK_PROVEEDOR;
    private Integer PRECIO_COMPRA;
    private String NOM_INSUMO;
    private Integer STOCK;

    public String getID_INSUMO() {
        return ID_INSUMO;
    }

    public void setID_INSUMO(String ID_INSUMO) {
        this.ID_INSUMO = ID_INSUMO;
    }


    public int getFK_CATEINSUMO() {
        return FK_CATEINSUMO;
    }

    public void setFK_CATEINSUMO(int FK_CATEINSUMO) {
        this.FK_CATEINSUMO = FK_CATEINSUMO;
    }

    public int getFK_PROVEEDOR() {
        return FK_PROVEEDOR;
    }

    public void setFK_PROVEEDOR(int FK_PROVEEDOR) {
        this.FK_PROVEEDOR = FK_PROVEEDOR;
    }

    public Integer getPRECIO_COMPRA() {
        return PRECIO_COMPRA;
    }

    public void setPRECIO_COMPRA(Integer PRECIO_COMPRA) {
        this.PRECIO_COMPRA = PRECIO_COMPRA;
    }

    public String getNOM_INSUMO() {
        return NOM_INSUMO;
    }

    public void setNOM_INSUMO(String NOM_INSUMO) {
        this.NOM_INSUMO = NOM_INSUMO;
    }

    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }
    

}
