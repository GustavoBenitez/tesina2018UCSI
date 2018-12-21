package funcionarios;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
public class FuncionesFuncionarios {
    private static  conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
    //Fumcion que carga el combobox de ciudades
    public static void isCargar(){
        String sql = "SELECT NOM_CIUDAD FROM ciudades";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroFuncionario.jcbCiudades.addItem("Seleccione una Ciudad");
            while(rs.next()){
                registroFuncionario.jcbCiudades.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
     public static void isCargarFunUp(){
        String sql = "SELECT NOM_CIUDAD FROM ciudades";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            updateFuncionario.jcbCiudadesFunUp.addItem("Seleccione una Ciudad");
            while(rs.next()){
                updateFuncionario.jcbCiudadesFunUp.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
   public static boolean isUpdate(SentenciasFuncionarios s) {
        String sql = SentenciasFuncionarios.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getID_CIUDAD());
            ps.setString(2, s.getNOM_FUN());
            ps.setString(3, s.getAPE_FUN());
            ps.setString(4, s.getCI_FUN());
            ps.setString(5, s.getDIRECCION_FUN());
            ps.setString(6, s.getEMAIL_FUN());
            ps.setString(7, s.getCELULAR_FUN());
            ps.setString(8, s.getID_FUNCIONARIO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDelete(SentenciasFuncionarios s) {
        String sql = SentenciasFuncionarios.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_FUNCIONARIO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Funcion que carga la tabla de funciunarios.
    public static void iscargarTabla(String buscar){
        DefaultTableModel model = (DefaultTableModel)Funcionarios.tablaFun.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasFuncionarios.LISTAR;
         } else {
             sql = "SELECT * FROM ciudades c, funcionarios WHERE NOM_FUN like '%" + buscar
                     + "%' and funcionarios.ID_CIUDAD = c.ID_CIUDAD";
         }
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[8];
            while(rs.next()){
                filas[0] = rs.getString("ID_FUNCIONARIO");
                filas[1] = rs.getString("NOM_FUN");
                filas[2] = rs.getString("APE_FUN");
                filas[3] = rs.getString("NOM_CIUDAD");
                filas[4] = rs.getString("CI_FUN");
                filas[5] = rs.getString("DIRECCION_FUN");
                filas[6] = rs.getString("EMAIL_FUN");
                filas[7] = rs.getString("CELULAR_FUN");
                
                
                model.addRow(filas);
            }
            Funcionarios.tablaFun.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
    //Funcion que carga la tabla de funciunarios.
    public static void isBuscarDatos(String buscar, String filtro ){
        DefaultTableModel model = (DefaultTableModel)Funcionarios.tablaFun.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
          if (filtro.equals("Nombre")){
             sql = "SELECT * FROM funcionarios f, ciudades "
                    + "WHERE f.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND NOM_FUN LIKE '"+buscar+"%'";
         }else if(filtro.equals("Apellido")){
              sql = "SELECT * FROM funcionarios f, ciudades "
                    + "WHERE f.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND APE_FUN LIKE '"+buscar+"%'";
         }else if(filtro.equals("Apellido")){
              sql = "SELECT * FROM funcionarios f, ciudades "
                    + "WHERE f.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND APE_DOCENT LIKE '"+buscar+"%'";
         }else if(filtro.equals("Cedula")){
              sql ="SELECT * FROM funcionarios f, ciudades "
                    + "WHERE f.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND CI_FUN LIKE '"+buscar+"%'";
         }else if(filtro.equals("Ciudad")){
              sql ="SELECT * FROM funcionarios f, ciudades "
                    + "WHERE f.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND ciudades.NOM_CIUDAD LIKE '"+buscar+"%'";
         }
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[8];
            while(rs.next()){
                filas[0] = rs.getString("ID_FUNCIONARIO");
                filas[1] = rs.getString("NOM_FUN");
                filas[2] = rs.getString("APE_FUN");
                filas[3] = rs.getString("NOM_CIUDAD");
                filas[4] = rs.getString("CI_FUN");
                filas[5] = rs.getString("DIRECCION_FUN");
                filas[6] = rs.getString("EMAIL_FUN");
                filas[7] = rs.getString("CELULAR_FUN");
                
                
                model.addRow(filas);
            }
            Funcionarios.tablaFun.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
    //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_FUNCIONARIO) FROM funcionarios";
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
}
