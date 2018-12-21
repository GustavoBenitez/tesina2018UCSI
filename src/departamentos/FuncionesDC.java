package departamentos;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FuncionesDC {
    //Llamado a la conexion de la base de datos
    private static final conexion.Conexion con = new Conexion();
    private static final Connection conexion = Conexion.getConnection();
    private static PreparedStatement ps = null;
    public static void isCargar(){
        String sql = "SELECT NOM_DEPARTAMENTO FROM departamentos";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroCiudad.jcbDepartamentos.addItem("Seleccione Departamento");
            while(rs.next()){
                registroCiudad.jcbDepartamentos.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void isCargarUpDepar(){
        String sql = "SELECT NOM_DEPARTAMENTO FROM departamentos";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            updateCiudad.jcbDepartUp.addItem("Seleccione Departamento");
            while(rs.next()){
                updateCiudad.jcbDepartUp.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
  //Funcion que realizar la accion de guardar los datos. 
    public static boolean isRegistrar(SentenciaDC s) {
         String sql = SentenciaDC.REGISTRAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getNRO_DEPARTAMENTO());
            ps.setString(2, s.getNOM_DEPARTAMENTO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("error en funcion registro departamentos:"+ex.getMessage());
            return false;
         //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Funcion que guarda los datos al ser editados o modificados.
    public static boolean isUpdate(SentenciaDC s) {
        String sql = SentenciaDC.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getNOM_DEPARTAMENTO());
            ps.setString(2, s.getID_DEPARTAMENTO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.err.println("error en funcion UPDATE departamentos:"+ex.getMessage());
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static boolean isUpdateCiu(SentenciaDC s) {
        String sql = SentenciaDC.ACTUALIZAR_CIU;
        try {
            ps = conexion.prepareStatement(sql);
           
            ps.setInt(1, s.getFK_DEPARTAMENTO());
            ps.setString(2, s.getNOM_CIUDAD());
            ps.setString(3, s.getID_CIUDAD());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  //Funcion que borra de la base de datos al usuario selecionado
     public static int eliminar(int id) {
        int rsu = 0;
        String sql = SentenciaDC.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            rsu = ps.executeUpdate();
        } catch (SQLException ex) {
            System.err.println("error:"+ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println(sql);
        return rsu;
    }
 //Funcion que permite visualizar los datos en la tabla en forma de lista.
     public static void isListarDepartamento(String buscar){
         DefaultTableModel model = (DefaultTableModel)Departamentos.tablaDepar.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciaDC.LISTAR;
         } else {
             sql = "SELECT * FROM departamentos WHERE(NOM_DEPARTAMENTO LIKE'"+buscar+"%')";
         }
        
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
             String datos[] =new String[2];
            while(rs.next()){
                datos[0] = rs.getString("ID_DEPARTAMENTO");              
                datos[1] = rs.getString("NOM_DEPARTAMENTO");
                model.addRow(datos);
            }
            Departamentos.tablaDepar.setModel(model);
        } catch (SQLException ex) {
          //  Logger.getLogger(FuncionesDC.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public static void iscargarTablaCiu(String buscar){
        DefaultTableModel model = (DefaultTableModel)Ciudades.tablaCiu.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciaDC.LISTAR_CIU;
         } 
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[3];
            while(rs.next()){
                filas[0] = rs.getString("ID_CIUDAD");
                filas[1] = rs.getString("NOM_CIUDAD");
                filas[2] = rs.getString("NOM_DEPARTAMENTO");
                model.addRow(filas);
            }
            Ciudades.tablaCiu.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        } 
     }
     public static void isBuscatDatos(String buscar, String filtro){
        DefaultTableModel model = (DefaultTableModel)Ciudades.tablaCiu.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if(filtro.equals("Ciudad")){
            sql= "SELECT * FROM  departamentos, ciudades c WHERE c.ID_DEPARTAMENTO = departamentos.ID_DEPARTAMENTO "
                     + "AND NOM_CIUDAD LIKE '"+ buscar +"%'";
         }else if(filtro.equals("Departamento")){
              sql= "SELECT * FROM  departamentos, ciudades c WHERE c.ID_DEPARTAMENTO = departamentos.ID_DEPARTAMENTO "
                     + "AND departamentos.NOM_DEPARTAMENTO LIKE '"+ buscar +"%'";
         }
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[3];
            while(rs.next()){
                filas[0] = rs.getString("ID_CIUDAD");
                filas[1] = rs.getString("NOM_CIUDAD");
                filas[2] = rs.getString("NOM_DEPARTAMENTO");
                model.addRow(filas);
            }
            Ciudades.tablaCiu.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        } 
     }
 //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_DEPARTAMENTO) FROM departamentos";
        int IDDEPARTAMENTO =0;
          try {
               
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDDEPARTAMENTO = rs.getInt(1);
            }
            if(IDDEPARTAMENTO == 0){
                IDDEPARTAMENTO = 1;
            }else{
                IDDEPARTAMENTO++;
            }
            return String.valueOf(IDDEPARTAMENTO);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMaxCiu(){
         String sql = "SELECT MAX(ID_CIUDAD) FROM ciudades";
         int IDCIUDAD =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDCIUDAD = rs.getInt(1);
            }
            if(IDCIUDAD == 0){
                IDCIUDAD = 1;
            }else{
                IDCIUDAD++;
            }
            return String.valueOf(IDCIUDAD);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
