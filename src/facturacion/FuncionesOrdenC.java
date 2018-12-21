package facturacion;

import alertas.principal.SuccessAlert;
import conexion.Conexion;
import static facturacion.registroOrdenc.jcbProveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import facturacion.registroOrdenc;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import librerias.GenerarNumero;

public class FuncionesOrdenC {
     private static  conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
        public static void isCargarProveedor(){
        String sql = "SELECT NOM_PRO, APE_PRO FROM proveedores";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                 registroOrdenc.jcbProveedor.addItem(rs.getString(1)+" "+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void mostrarInsumos(Integer prove){
        System.out.println("este el id del proveedor que se envio: "+prove);
        Integer id2=0,idPro=0;
        try {
            String sqlPro = "SELECT * FROM proveedores";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sqlPro);
            while(rs.next()){
                id2=rs.getInt("proveedores.ID_PROVEEDOR");
                if(id2==jcbProveedor.getSelectedIndex()){
                    idPro=id2;
                } 
            }
            System.out.println("el id del proveedor es: "+idPro);
        } catch (Exception ex) {
            System.err.println("errror al buscar provee"+ex.getMessage());
        }
       
        DefaultTableModel model = (DefaultTableModel)detalleInsumos.tablaDetalleInsumo.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        Integer idProCom=0;
        String sql="";
            sql  = "SELECT ID_INSUMO, categoria_insumo.TIPO_INSUMO, proveedores.APE_PRO, proveedores.NOM_PRO, NOM_INSUMO"
            + " FROM insumos_varios, categoria_insumo, proveedores"
            + " WHERE insumos_varios.ID_CATEINSUMO = categoria_insumo.ID_CATEINSUMO AND "
            + "insumos_varios.ID_PROVEEDOR = proveedores.ID_PROVEEDOR AND "
            + "insumos_varios.ID_PROVEEDOR LIKE '%"+idPro+"%'";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos[] =new String[4];
            while(rs.next()){

                    datos[0] = rs.getString("insumos_varios.ID_INSUMO");              
                    datos[1] = rs.getString("proveedores.NOM_PRO")+" "+rs.getString("proveedores.APE_PRO");
                    datos[2] = rs.getString("categoria_insumo.TIPO_INSUMO");
                    datos[3] = rs.getString("insumos_varios.NOM_INSUMO");
                    model.addRow(datos);
            }
            detalleInsumos.tablaDetalleInsumo.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
    }
     //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMaxDetalleOc(){
         String sql = "SELECT MAX(ID_DETALLEOC) FROM detalles_orden_compras";
         int IDFUN =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDFUN = rs.getInt(1);
            }
            if(IDFUN == 0){
                IDFUN = 1;
            }else{
                IDFUN++;
            }
            return String.valueOf(IDFUN);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
      public static String extraerIDMaxOc(){
         String sql = "SELECT MAX(ID_ORDENC) FROM ordenes_compras";
         int IDFUN =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDFUN = rs.getInt(1);
            }
            if(IDFUN == 0){
                IDFUN = 1;
            }else{
                IDFUN++;
            }
            return String.valueOf(IDFUN);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void guadarOrdenC() {
        //Primero se guarda la cabecera
        int idcabecera=0;
            String sql = "INSERT INTO ordenes_compras(ID_ORDENC, ID_PROVEEDOR, FECHA_OC) VALUES (?,?,?)";
            PreparedStatement ps;
            try {
                ps = conexion.prepareStatement(sql);
                ps.setString(1, registroOrdenc.lblIdOC.getText());
                ps.setInt(2, registroOrdenc.jcbProveedor.getSelectedIndex());
                ps.setString(3, registroOrdenc.dateFecha.getFechaSeleccionada());
                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    //Se recupera el ultimo id guardado de cabecera
                    String sql2 = "SELECT MAX(ID_ORDENC) FROM ordenes_compras";
                    ps = conexion.prepareStatement(sql2);
                    ResultSet rs = ps.executeQuery();
                    rs.first();
                    //Una vez lista la consulta se procede a guardar detalle
                    idcabecera = rs.getInt(1);
                } 
            } catch (SQLException ex) {
                System.out.println("Error guardar: " + ex.getMessage());
            } 
        try {
              //Para lo cual se recorre la tabla con los productos
            for (int i = 0; i < registroOrdenc.tablaDetalleOc.getRowCount(); i++) {
                registroOrdenc.lblIdDetalle.setText(FuncionesOrdenC.extraerIDMaxDetalleOc());
                String sql3 = "INSERT INTO detalles_orden_compras (ID_DETALLEOC, ID_INSUMO, ID_ORDENC, CANTIDAD_DETALLE) VALUES (?,?,?,?)";
                ps = conexion.prepareStatement(sql3);
                ps.setInt(1, Integer.parseInt(registroOrdenc.lblIdDetalle.getText()));
                ps.setInt(2, Integer.parseInt(registroOrdenc.tablaDetalleOc.getValueAt(i, 0).toString()));
                ps.setInt(3, idcabecera);
                ps.setInt(4, Integer.parseInt(registroOrdenc.tablaDetalleOc.getValueAt(i, 2).toString()));
                ps.executeUpdate();
            }
                    SuccessAlert sa = new SuccessAlert(new JFrame(), true);
                    SuccessAlert.titulo.setText("¡HECHO!");
                    SuccessAlert.msj.setText("SE HA GUARDADO");
                    SuccessAlert.msj1.setText("");
                    sa.setVisible(true);
        } catch (Exception e) {
            System.err.println("ERROR DETALLE:"+e.getMessage());
        }
    }
    public static void cargarTabla(){
         DefaultTableModel model = (DefaultTableModel)ordenCompra.tablaOc.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        String sql="";
            sql  = "SELECT * FROM ordenes_compras, proveedores " 
                    + "WHERE ordenes_compras.ID_PROVEEDOR = proveedores.ID_PROVEEDOR ORDER BY ordenes_compras.ID_ORDENC ASC";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos[] =new String[3];
            while(rs.next()){
                datos[0] = rs.getString("ordenes_compras.ID_ORDENC");              
                datos[1] = rs.getString("proveedores.NOM_PRO")+" "+rs.getString("proveedores.APE_PRO");
                datos[2] = rs.getString("ordenes_compras.FECHA_OC");
                model.addRow(datos);
            }
           ordenCompra.tablaOc.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
    }
     public static void ocultar() {
        registroOrdenc.lblIdDetalle.setVisible(false);
        registroOrdenc.lblIdInsu.setVisible(false);
        registroOrdenc.lblIdOC.setVisible(false);
        registroOrdenc.lblIdProv.setVisible(false);
    }
     public static void mostrarDetalleOC(String cabecera) {
         DefaultTableModel model = (DefaultTableModel)detalleOrdenCompra.tablaDetalleOrdenCompra.getModel();
         String idCab = "";
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        String sql="";
            sql  = sql  = "SELECT * FROM insumos_varios, categoria_insumo, ordenes_compras, detalles_orden_compras"
            + " WHERE insumos_varios.ID_CATEINSUMO = categoria_insumo.ID_CATEINSUMO AND "
            + "insumos_varios.ID_INSUMO = detalles_orden_compras.ID_INSUMO AND "
            + "ordenes_compras.ID_ORDENC = detalles_orden_compras.ID_ORDENC AND "
            + "detalles_orden_compras.ID_ORDENC LIKE '%"+cabecera+"%' "
            + "ORDER BY detalles_orden_compras.ID_DETALLEOC";
         try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos[] =new String[4];
            while(rs.next()){
                idCab=rs.getString("detalles_orden_compras.ID_ORDENC");
                if(idCab.equals(cabecera)){
                    datos[0] = rs.getString("insumos_varios.ID_INSUMO");
                    datos[1] = rs.getString("categoria_insumo.TIPO_INSUMO");
                    datos[2] = rs.getString("insumos_varios.NOM_INSUMO");
                    datos[3] = rs.getString("detalles_orden_compras.CANTIDAD_DETALLE");
                    model.addRow(datos);
                }
            }
           detalleOrdenCompra.tablaDetalleOrdenCompra.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
    }
}
