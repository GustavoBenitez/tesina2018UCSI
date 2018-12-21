/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insumos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class FuncionesI {
      //Llamado a la conexion de la base de datos
    private static final conexion.Conexion con = new Conexion();
    private static final Connection conexion = Conexion.getConnection();
    private static PreparedStatement ps = null;
    //Fumcion que carga el combobox de tipo de insumos.
    public static void isCargarTipInsumo(){
        String sql = "SELECT TIPO_INSUMO FROM categoria_insumo";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroInsumo.jcbTipoProducto.addItem("Seleccione");
            while(rs.next()){
                registroInsumo.jcbTipoProducto.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
//Fumcion que carga el combobox de proveedores.
    public static void isCargarProveedor(){
        String sql = "SELECT NOM_PRO FROM proveedores";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroInsumo.jcbProveedorPro.addItem("Seleccione");
            while(rs.next()){
                 registroInsumo.jcbProveedorPro.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
  //Fumcion que carga el combobox de tipo de insumos al actualizar.
    public static void isCargarTipInsumoUp(){
        String sql = "SELECT TIPO_INSUMO FROM categoria_insumo";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            updateInsumo.jcbTipoInsumoUp.addItem("Seleccione");
            while(rs.next()){
                 updateInsumo.jcbTipoInsumoUp.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
//Fumcion que carga el combobox de proveedores al actualizar.
    public static void isCargarProveedorUp(){
        String sql = "SELECT NOM_PRO FROM proveedores";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            updateInsumo.jcbProveedorInsumoUp.addItem("Seleccione");
            while(rs.next()){
                 updateInsumo.jcbProveedorInsumoUp.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    //Funcion que realizar la accion de guardar los datos en la tabla insumo. 
    public static boolean isRegistrarInsumo(Sentencias s) {
        String sql = Sentencias.REGISTRAR_INSU;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getFK_CATEINSUMO());
            ps.setInt(2, s.getFK_PROVEEDOR());
            ps.setInt(3, s.getPRECIO_COMPRA());
            ps.setString(4, s.getNOM_INSUMO());
            ps.setInt(5, s.getSTOCK());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            return false;
         //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      //Funcion que guarda los datos al ser editados o modificados de la tabla Insumos.
    public static boolean isUpdateInsumo(Sentencias s) {
        String sql = Sentencias.ACTUALIZAR_INSU;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getFK_CATEINSUMO());
            ps.setInt(2, s.getFK_PROVEEDOR());
            ps.setInt(3, s.getPRECIO_COMPRA());
            ps.setString(4, s.getNOM_INSUMO());
            ps.setInt(5, s.getSTOCK());
            ps.setString(6, s.getID_INSUMO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            return false;
         //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDeleteInsumos(Sentencias s) {
        String sql = Sentencias.ELIMINAR_INSU;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_INSUMO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     //Funcion que permite visualizar los datos en la tabla en forma de lista.
     public static void isListarInsumo(String buscar){
         DefaultTableModel model = (DefaultTableModel)insumos.tablaInsumos.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        String sql  = Sentencias.LISTAR_INSU;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String datos[] =new String[5];
            while(rs.next()){
                datos[0] = rs.getString("ID_INSUMO");              
                datos[1] = rs.getString("categoria_insumo.TIPO_INSUMO");
                datos[2] = rs.getString("proveedores.NOM_PRO")+" "+rs.getString("proveedores.APE_PRO");
                datos[3] = rs.getString("NOM_INSUMO");
                datos[4] = rs.getString("STOCK");
                /*datos[5] = rs.getString("PRECIO_COMPRA");
                datos[6] = rs.getString("INSU_IVA10");
                datos[7] = rs.getString("INSU_IVA5");
                datos[8] = rs.getString("INSU_EXENTO");*/
                model.setColumnIdentifiers(new String[]{"N°", "TIPO", "Proveedor", "Insumo","Stock"});
                model.addRow(datos);
            }
            insumos.tablaInsumos.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
     }
     public static void BuscarDatosInsumos(String valor, String filtro){
        DefaultTableModel model = (DefaultTableModel)insumos.tablaInsumos.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
        }
        String SSQL="";
        if(filtro.equals("Tipo")){
               SSQL="SELECT * FROM insumos_varios i, categoria_insumo, proveedores"
           + " WHERE i.ID_CATEINSUMO = categoria_insumo.ID_CATEINSUMO"
            + " AND i.ID_PROVEEDOR = proveedores.ID_PROVEEDOR AND"
            + " categoria_insumo.TIPO_INSUMO LIKE '"+valor+"%'";
        }else if(filtro.equals("Nombre")){
               SSQL="SELECT * FROM insumos_varios i, categoria_insumo, proveedores"
            + " WHERE i.ID_CATEINSUMO = categoria_insumo.ID_CATEINSUMO"
            + " AND i.ID_PROVEEDOR = proveedores.ID_PROVEEDOR AND"
            + " i.NOM_INSUMO LIKE '"+valor+"%'";
        }
         try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(SSQL);
            String datos[] =new String[4];
            while(rs.next()){
                datos[0] = rs.getString("ID_INSUMO");              
                datos[1] = rs.getString("TIPO_INSUMO");
                datos[2] = rs.getString("NOM_INSUMO");
                datos[3] = rs.getString("STOCK");
                model.setColumnIdentifiers(new String[]{"N°", "TIPO", "Insumo","Stock"});
                model.addRow(datos);
            }
            insumos.tablaInsumos.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
     }
    //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMaxInsumo(){
         String sql = "SELECT MAX(ID_INSUMO) FROM insumos_varios";
         int IDINSU =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDINSU = rs.getInt(1);
            }
            if(IDINSU == 0){
                IDINSU = 1;
            }else{
                IDINSU++;
            }
            return String.valueOf(IDINSU);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
