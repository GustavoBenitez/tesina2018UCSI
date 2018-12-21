package insumos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;
import proveedores.SentenciasProveedor;
import rojerusan.RSNotifyFade;
import rojerusan.RSNotifyShadowAnimated;

public class FuncionesInsumo {
//Llamado a la conexion de la base de datos
    private static final conexion.Conexion con = new Conexion();
    private static final Connection conexion = Conexion.getConnection();
    private static PreparedStatement ps = null;
    
//Funcion que realizar la accion de guardar los datos. 
    public static boolean isRegistrar(SentenciasInsumo s) {
        String sql = SentenciasInsumo.REGISTRAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getTIPO_INSUMO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            return false;
         //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Funcion que guarda los datos al ser editados o modificados.
    public static boolean isUpdate(SentenciasInsumo s) {
        String sql = SentenciasInsumo.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getTIPO_INSUMO());
            ps.setInt(2, s.getID_CATEINSUMO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            return false;
         //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Funcion que borra de la base de datos al usuario selecionado
    public static boolean isDelete(SentenciasInsumo s) {
        String sql = SentenciasInsumo.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getID_CATEINSUMO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Funcion que permite visualizar los datos en la tabla en forma de lista.
    public static void isListar(String buscar){
         DefaultTableModel model = (DefaultTableModel)tipoInsumos.tablaTipoInsumos.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasInsumo.LISTAR;
         } else {
             sql = "SELECT * FROM categoria_insumo WHERE(TIPO_INSUMO LIKE'"+buscar+"%')";
         }
         String datos[] =new String[2];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("ID_CATEINSUMO");              
                datos[1] = rs.getString("TIPO_INSUMO");
                model.addRow(datos);
            }
            tipoInsumos.tablaTipoInsumos.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
          //  Logger.getLogger(FuncionesDC.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
//Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
    public static String extraerIDMaxTip(){
         String sql = "SELECT MAX(ID_CATEINSUMO) FROM categoria_insumo"; 
         int IDTIPOIN =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDTIPOIN = rs.getInt(1);
            }
            if(IDTIPOIN == 0){
                IDTIPOIN = 1;
            }else{
                IDTIPOIN++;
            }
            return String.valueOf(IDTIPOIN);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void cargarListaPRO(){
        DefaultListModel modelLista = new DefaultListModel();
        String sql = SentenciasProveedor.LISTAR;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String filas[] = new String[1];
            while(rs.next()){
                filas[0] = rs.getString("NOM_PRO")+" "+rs.getString("APE_PRO");
                modelLista.addElement(filas[0]);
            }
        insumos.listProveedores.setModel(modelLista);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }    
    }
    public static void filtroInsumoXproveedor(Integer buscar, String proveedor){
         DefaultTableModel model = (DefaultTableModel)insumos.tablaInsumos.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        String sql  = Sentencias.LISTAR_INSU, nom="", ape="",nomcpl="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos[] =new String[4];
            while(rs.next()){
                nom=rs.getString("proveedores.NOM_PRO");
                ape=rs.getString("proveedores.APE_PRO");
                nomcpl=nom+" "+ape;
                if(buscar==rs.getInt("proveedores.ID_PROVEEDOR") && proveedor.equals(nomcpl)){
                    datos[0] = rs.getString("ID_INSUMO");              
                    datos[1] = rs.getString("categoria_insumo.TIPO_INSUMO");
                    datos[2] = rs.getString("NOM_INSUMO");
                    datos[3] = rs.getString("STOCK");  
                    model.setColumnIdentifiers(new String[]{"N°", "TIPO", "Insumo","Stock"});
                    model.addRow(datos);
                    System.out.println("LA funcion filtroInsumoXproveedor esta funcionando");
                }  
            }
            insumos.tablaInsumos.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
     }
    public static void listarPrecios(String buscar){
         DefaultTableModel model = (DefaultTableModel)detallePrecios.tablaDetallePrecios.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        String sql  = Sentencias.LISTAR_INSU, idinsu="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos[] =new String[4];
            while(rs.next()){
                idinsu= rs.getString("ID_INSUMO");
                if(buscar.equals(idinsu)){
                    datos[0] = rs.getString("PRECIO_COMPRA");
                    datos[1] = rs.getString("INSU_IVA10");
                    datos[2] = rs.getString("INSU_IVA5");
                    datos[3] = rs.getString("INSU_EXENTO");
                    model.addRow(datos);
                } 
            }
            detallePrecios.tablaDetallePrecios.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
     }
    public static void cargarDatosUpdate(String buscar){
        String sql  = Sentencias.LISTAR_INSU, idinsu="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                idinsu= rs.getString("ID_INSUMO");
                if(buscar.equals(idinsu)){
                    updateInsumo.jcbTipoInsumoUp.setSelectedItem(rs.getString("categoria_insumo.TIPO_INSUMO"));
                    updateInsumo.jcbProveedorInsumoUp.setSelectedItem(rs.getString("proveedores.NOM_PRO"));
                    updateInsumo.txtPrecioCInsumoUp.setText(rs.getString("PRECIO_COMPRA"));
                    updateInsumo.txtNomInsumoUp.setText(rs.getString("NOM_INSUMO"));
                    updateInsumo.txtStockInsumoU.setText(rs.getString("STOCK"));
                    updateInsumo.lblIdInsumoUp.setText(idinsu);
                } 
            }
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
    }
    public static Integer Stock=0;
    public static void cargarInsumoProBaja(String buscar){
        String sql  = Sentencias.LISTAR_INSU, idinsu="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                idinsu= rs.getString("ID_INSUMO");
                if(buscar.equals(idinsu)){
                    registroInventarioBaja.lblNomInsumo.setText(rs.getString("NOM_INSUMO"));
                    registroInventarioBaja.lblNomProveedor.setText("Proveedor: "+rs.getString("proveedores.NOM_PRO")+" "+rs.getString("proveedores.APE_PRO"));
                    Stock=rs.getInt("STOCK");
                    System.out.println("el STOCK es: "+Stock);
                } 
            }
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
    }
    public static String extraerIDMaxBaja(){
         String sql = "SELECT MAX(ID_BAJAINSUMO) FROM inventario_baja"; 
         int IDBAJA =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDBAJA = rs.getInt(1);
            }
            if(IDBAJA == 0){
                IDBAJA = 1;
            }else{
                IDBAJA++;
            }
            return String.valueOf(IDBAJA);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void guardarBaja(){
        String tabla="INVENTARIO DE BAJA", evento="INSERT", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        String sql = "INSERT INTO inventario_baja(ID_BAJAINSUMO, ID_INSUMO, ID_USUARIO, CANT_USADOS, RESTANTES, MOTIVOS) VALUES (?,?,?,?,?,?)";
        PreparedStatement ps;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(registroInventarioBaja.lblIDBaja.getText()));
            ps.setInt(2, Integer.parseInt(registroInventarioBaja.lblIdInsumo.getText()));
            ps.setInt(3, login.Login.idUsu);
            ps.setInt(4, Integer.parseInt(registroInventarioBaja.txtCantUsus.getText()));
            ps.setInt(5, Integer.parseInt(registroInventarioBaja.txtRestantes.getText()));
            ps.setString(6, registroInventarioBaja.txtMotivos.getText());
            int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    new rojerusan.RSNotifyFade("¡HECHO!", "Se Guardo Correctamente", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                    FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                } 
            } catch (SQLException ex) {
                System.out.println("Error guardar INVEMNTARIo: " + ex.getMessage());
            } 
    }  
    public static void calcularRestantes(){
        String can = registroInventarioBaja.txtCantUsus.getText(), sql  = Sentencias.LISTAR_INSU, idinsu="";
        Integer cant=0, stock=0, resto=0;
        if(can.equals("")==false && can.matches("[0-9]*")){
            cant = Integer.parseInt(can);
            if(cant>Stock){
               new rojerusan.RSNotifyShadowAnimated("Oops!", "La cantidad Ingresada es superior al Stock", 5, RSNotifyShadowAnimated.PositionNotify.BottomRight, RSNotifyShadowAnimated.AnimationNotify.BottomUp, RSNotifyShadowAnimated.TypeNotify.WARNING).setVisible(true);
            }else{ 
              registroInventarioBaja.txtRestantes.setText(Integer.toString(Stock-cant));
            }
            
        } 
    }
}
