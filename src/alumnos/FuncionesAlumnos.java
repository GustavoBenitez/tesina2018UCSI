package alumnos;

import com.sun.jndi.ldap.pool.Pool;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
public class FuncionesAlumnos {
    private static  conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
    //Fumcion que carga el combobox de ciudades en el registro de alumnos
    public static void isCargar(){
        String sql = "SELECT NOM_CIUDAD FROM ciudades";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroAlumnos.jcbCiudadesAlum.addItem("Seleccione una Ciudad");
            while(rs.next()){
                registroAlumnos.jcbCiudadesAlum.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
     public static void isCargarAlumUp(){
        String sql = "SELECT NOM_CIUDAD FROM ciudades";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            updateAlumno.jcbCiudadesAlumUp.addItem("Seleccione una Ciudad");
            while(rs.next()){
                updateAlumno.jcbCiudadesAlumUp.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
     //Funcion que realizar la accion de guardar los datos.   
    public static boolean isRegistrar(SentenciasAlumnos s) {
            String sql = SentenciasAlumnos.REGISTRAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getID_CIUDAD());
            ps.setString(2, s.getNOM_ALUM());
            ps.setString(3, s.getAPE_ALUM());
            ps.setString(4, s.getCI_ALUM());
            ps.setString(5, s.getDIRECC_ALUM());
            ps.setString(6, s.getEMAIL_ALUM());
            ps.setString(7, s.getCELU_ALUM());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
         //Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   public static boolean isUpdate(SentenciasAlumnos s) {
        String sql = SentenciasAlumnos.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getID_CIUDAD());
            ps.setString(2, s.getNOM_ALUM());
            ps.setString(3, s.getAPE_ALUM());
            ps.setString(4, s.getCI_ALUM());
            ps.setString(5, s.getDIRECC_ALUM());
            ps.setString(6, s.getEMAIL_ALUM());
            ps.setString(7, s.getCELU_ALUM());
            ps.setString(8, s.getID_ALUMNO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDelete(SentenciasAlumnos s) {
        String sql = SentenciasAlumnos.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_ALUMNO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void iscargarTabla(String buscar){
        DefaultTableModel model = (DefaultTableModel)Alumnos.tablaAlumno.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
        }
        String sql = "";
        if (buscar.equals("")){
             sql = SentenciasAlumnos.LISTAR;
         } 
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[8];
            while(rs.next()){
                filas[0] = rs.getString("ID_ALUMNO");
                filas[1] = rs.getString("NOM_CIUDAD");
                filas[2] = rs.getString("NOM_ALUM");
                filas[3] = rs.getString("APE_ALUM");
                filas[4] = rs.getString("CI_ALUM");
                filas[5] = rs.getString("DIRECC_ALUM");
                filas[6] = rs.getString("EMAIL_ALUM");
                filas[7] = rs.getString("CELU_ALUM");
                model.addRow(filas);
            }
            Alumnos.tablaAlumno.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
    //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_ALUMNO) FROM alumnos";
         int IDALUM =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDALUM = rs.getInt(1);
            }
            if(IDALUM == 0){
                IDALUM = 1;
            }else{
                IDALUM++;
            }
            return String.valueOf(IDALUM);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     
    public static void BuscarDatos(String valor, String filtro){
        DefaultTableModel model = (DefaultTableModel)Alumnos.tablaAlumno.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
        }
        String SSQL="";
        if(filtro.equals("Nombre")){
            SSQL="SELECT * FROM ciudades c, alumnos WHERE alumnos.ID_CIUDAD = c.ID_CIUDAD AND "
                  +"NOM_ALUM LIKE '%"+valor+"%'";
        }else if(filtro.equals("Apellido")){
               SSQL="SELECT * FROM ciudades c, alumnos WHERE alumnos.ID_CIUDAD = c.ID_CIUDAD AND "
                       + " APE_ALUM LIKE '%"+valor+"%'";
        }else if(filtro.equals("Cedula")){
               SSQL="SELECT * FROM ciudades c, alumnos WHERE alumnos.ID_CIUDAD = c.ID_CIUDAD AND "
                       + " CI_ALUM LIKE '"+valor+"%'";
        }else if(filtro.equals("Ciudad")){
               SSQL="SELECT * FROM ciudades c, alumnos WHERE alumnos.ID_CIUDAD = c.ID_CIUDAD AND "
               + "c.NOM_CIUDAD LIKE '%"+valor+"%'";
        }
        try {
           Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(SSQL);
           String[] filas = new String[8];
            while(rs.next()){
                filas[0] = rs.getString("ID_ALUMNO");
                filas[1] = rs.getString("NOM_CIUDAD");
                filas[2] = rs.getString("NOM_ALUM");
                filas[3] = rs.getString("APE_ALUM");
                filas[4] = rs.getString("CI_ALUM");
                filas[5] = rs.getString("DIRECC_ALUM");
                filas[6] = rs.getString("EMAIL_ALUM");
                filas[7] = rs.getString("CELU_ALUM");
                model.addRow(filas);
            }
            Alumnos.tablaAlumno.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
        
     }
}
