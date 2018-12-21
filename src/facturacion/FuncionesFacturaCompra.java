package facturacion;

import conexion.Conexion;
import static facturacion.ordenCompra.tablaOc;
import static facturacion.registroFacturaOc.tablaDetalleINsumo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import librerias.GenerarNumero;
import rojerusan.RSNotifyShadowAnimated;

/**
 * @author Gustavo
 */

public class FuncionesFacturaCompra {
    private static  conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
    public static String QueIva="";
    public static void enviarMuchosInsumos(String ordenc) {
        DefaultTableModel model = (DefaultTableModel) registroFacturaOc.tablaDetalleINsumo.getModel();
        String datos[] =new String[7];
        int fila =  tablaOc.getSelectedRow();//Recoge todas las filas Seleccionadas
        String id = "", prov="", sql="";
        int cont = tablaOc.getRowCount(), i=0;
        System.out.println(cont);
        try {
         
                System.out.println("Datos Selecionados: "+fila);
                id = (String) tablaOc.getValueAt(fila, 0);
                prov =  (String) tablaOc.getValueAt(fila, 1);
                sql="SELECT * FROM insumos_varios, detalles_orden_compras, ordenes_compras"
                    + " WHERE insumos_varios.ID_INSUMO = detalles_orden_compras.ID_INSUMO AND "
                    + "detalles_orden_compras.ID_ORDENC = ordenes_compras.ID_ORDENC AND "
                    + "ordenes_compras.ID_ORDENC LIKE '%"+ordenc+"%'";
                Statement st = conexion.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                  if(id.equals( rs.getString("ordenes_compras.ID_ORDENC"))){
                    datos[0] = rs.getString("insumos_varios.ID_INSUMO");              
                    datos[1] = rs.getString("insumos_varios.NOM_INSUMO");
                    datos[2] = rs.getString("detalles_orden_compras.CANTIDAD_DETALLE");
                    datos[3] = rs.getString("insumos_varios.PRECIO_COMPRA");
                    datos[4] = rs.getString("insumos_varios.INSU_IVA10");
                    datos[5] = rs.getString("insumos_varios.INSU_IVA5");
                    datos[6] = rs.getString("insumos_varios.INSU_EXENTO");
                    //model.setColumnIdentifiers(new String[]{"N°", "Insumo", "Cantidad", "Precio","Iva"+QueIva});
                    model.addRow(datos);
                  }
                    
                }
            registroFacturaOc.txtProveedor.setText(prov);
            registroFacturaOc.lblIdOC.setText(id);
            System.out.println("Proveedor Selecionado: "+prov); 
            registroFacturaOc.tablaDetalleINsumo.setModel(model);
        } catch (Exception e) {
            System.err.println("error al enviar cargar orden c en factura compra "+e.getMessage());
        }
    }
    public static void guadarFacturaOrdenC() {
        int fila =  tablaDetalleINsumo.getSelectedRow();
        
        //Primero se guarda la cabecera
        int idcabecera=0;
        
            String sql = "INSERT INTO factura_compra(ID_FACTURACOMPRA, ID_ORDENC, NRO_COMPRA, FECHA_COMPRA, TOT_COMPRA, COM_SUBTOT, COM_TOTIVA) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps;
            try {
                ps = conexion.prepareStatement(sql);
                ps.setString(1, registroFacturaOc.lblIdFacOc.getText());
                ps.setInt(2, Integer.parseInt(registroFacturaOc.lblIdOC.getText()));
                ps.setString(3, registroFacturaOc.txtCodigoFacOc.getText());
                ps.setString(4, registroFacturaOc.dateFechaFOc.getFechaSeleccionada());
                ps.setInt(5, registroFacturaOc.totGral);
                ps.setInt(6, Integer.parseInt(registroFacturaOc.txtTotG.getText()));
                ps.setInt(7, Integer.parseInt(registroFacturaOc.txtTotIva.getText()));
                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    //Se recupera el ultimo id guardado de cabecera
                    String sql2 = "SELECT MAX(ID_FACTURACOMPRA) FROM factura_compra";
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
            for (int i = 0; i < registroFacturaOc.tablaDetalleINsumo.getRowCount(); i++) {
                registroFacturaOc.lblIdDetalleInsu.setText(FuncionesFacturaCompra.extraerIDMaxDetalleInsumo());
                String sql3 = "INSERT INTO detalle_insumo (ID_DETALLEINSUMO, ID_INSUMO, ID_FACTURACOMPRA, CANTIDADINSUMO, PRECIO, COM_IVA10, COM_IVA5, COM_IVA0) VALUES (?,?,?,?,?,?,?,?)";
                ps = conexion.prepareStatement(sql3);
                ps.setInt(1, Integer.parseInt(registroFacturaOc.lblIdDetalleInsu.getText()));
                ps.setInt(2, Integer.parseInt(registroFacturaOc.tablaDetalleINsumo.getValueAt(i, 0).toString()));
                ps.setInt(3, idcabecera);
                ps.setInt(4, Integer.parseInt(registroFacturaOc.tablaDetalleINsumo.getValueAt(i, 2).toString()));
                ps.setInt(5, Integer.parseInt(registroFacturaOc.tablaDetalleINsumo.getValueAt(i, 3).toString()));    
                ps.setInt(6, Integer.parseInt(registroFacturaOc.tablaDetalleINsumo.getValueAt(i, 4).toString())); 
                ps.setInt(7, Integer.parseInt(registroFacturaOc.tablaDetalleINsumo.getValueAt(i, 5).toString())); 
                ps.setInt(8, Integer.parseInt(registroFacturaOc.tablaDetalleINsumo.getValueAt(i, 6).toString())); 
                ps.executeUpdate();
            }
            new rojerusan.RSNotifyShadowAnimated("¡Hecho!", "Se ha Guardado Correctamente", 5, RSNotifyShadowAnimated.PositionNotify.BottomRight, RSNotifyShadowAnimated.AnimationNotify.BottomUp, RSNotifyShadowAnimated.TypeNotify.SUCCESS).setVisible(true);
        } catch (Exception e) {
            System.err.println("ERROR DETALLE:"+e.getMessage());
        }
    }
    public static String extraerIDMaxDetalleInsumo(){
         String sql = "SELECT MAX(ID_DETALLEINSUMO) FROM DETALLE_INSUMO";
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
      public static String extraerIDMaxFacOc(){
         String sql = "SELECT MAX(ID_FACTURACOMPRA) FROM FACTURA_COMPRA";
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
      public static void numeros() {
        int j;
        String c="";
         String sql="SELECT MAX(ID_FACTURACOMPRA) FROM FACTURA_COMPRA";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){              
                 c=rs.getString(1);
            }
            if(c==null){
                registroFacturaOc.txtCodigoFacOc.setText("0001");
            } else {
                 j=Integer.parseInt(c);
                 librerias.GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 registroFacturaOc.txtCodigoFacOc.setText(gen.serie());            
            }

        } catch (SQLException ex) {
            System.err.println("error:"+ex.getMessage());
           Logger.getLogger(registroFacturaOc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      public static void cargarTabla(){
         DefaultTableModel model = (DefaultTableModel)facturaCompra.tablaFacOC.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        String sql="";
            sql  = "SELECT * FROM factura_compra, proveedores, ordenes_compras " 
                    + "WHERE factura_compra.ID_ORDENC = ordenes_compras.ID_ORDENC AND "
                    + "ordenes_compras.ID_PROVEEDOR = proveedores.ID_PROVEEDOR";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos[] =new String[5];
            while(rs.next()){
                datos[0] = rs.getString("factura_compra.ID_FACTURACOMPRA");
                datos[1] = rs.getString("factura_compra.NRO_COMPRA");
                datos[2] = rs.getString("proveedores.NOM_PRO")+" "+rs.getString("proveedores.APE_PRO");
                datos[3] = rs.getString("factura_compra.FECHA_COMPRA");
                datos[4] = rs.getString("factura_compra.TOT_COMPRA");
                model.addRow(datos);
            }
           facturaCompra.tablaFacOC.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
    }
    public static void mostrarDetalle(String cabecera) {
         DefaultTableModel model = (DefaultTableModel)detalleFacturaOc.tablaDetalleInsFac.getModel();
         String idCab = "";
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        String sql="";
            sql  = "SELECT * FROM factura_compra, detalle_insumo, insumos_varios, categoria_insumo " 
                    + "WHERE factura_compra.ID_FACTURACOMPRA = detalle_insumo.ID_FACTURACOMPRA AND "
                    + "detalle_insumo.ID_INSUMO = insumos_varios.ID_INSUMO AND "
                    + "categoria_insumo.ID_CATEINSUMO = insumos_varios.ID_CATEINSUMO AND "
                    + "detalle_insumo.ID_FACTURACOMPRA LIKE '%"+cabecera+"%'";
         try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos[] =new String[5];
            while(rs.next()){
                idCab=rs.getString("detalle_insumo.ID_FACTURACOMPRA");
                if(idCab.equals(cabecera)){
                    datos[0] = rs.getString("detalle_insumo.ID_DETALLEINSUMO");
                    datos[1] = rs.getString("categoria_insumo.TIPO_INSUMO");
                    datos[2] = rs.getString("insumos_varios.NOM_INSUMO");
                    datos[3] = rs.getString("detalle_insumo.CANTIDADINSUMO");
                    datos[4] = rs.getString("detalle_insumo.PRECIO");
                    model.addRow(datos);
                }
               
            }
           detalleFacturaOc.tablaDetalleInsFac.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
    }
}
