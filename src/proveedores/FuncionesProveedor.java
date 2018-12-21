
package proveedores;

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
public class FuncionesProveedor {
    private static  conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
    //Fumcion que carga el combobox de ciudades
    public static void isCargar(){
        String sql = "SELECT NOM_CIUDAD FROM ciudades";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroProveedor.jcbCiudadesPro.addItem("Seleccione una Ciudad");
            while(rs.next()){
                registroProveedor.jcbCiudadesPro.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
     public static void isCargarProUp(){
        String sql = "SELECT NOM_CIUDAD FROM ciudades";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            updateProveedor.jcbCiudadesProUp.addItem("Seleccione una Ciudad");
            while(rs.next()){
                updateProveedor.jcbCiudadesProUp.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
   public static boolean isUpdate(SentenciasProveedor s) {
        String sql = SentenciasProveedor.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getID_CIUDAD());
            ps.setString(2, s.getNOM_PRO());
            ps.setString(3, s.getAPE_PRO());
            ps.setString(4, s.getCEDU_PRO());
            ps.setString(5, s.getRUC_PRO());
            ps.setString(6, s.getDREC_PRO());
            ps.setString(7, s.getEMAIL_PRO());
            ps.setString(8, s.getCELU_PRO());
            ps.setString(9, s.getID_PROVEEDOR());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDelete(SentenciasProveedor s) {
        String sql = SentenciasProveedor.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_PROVEEDOR());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void iscargarTabla(String buscar){
        DefaultTableModel model = (DefaultTableModel)Proveedores.tablaProveedor.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasProveedor.LISTAR;
         } else {
             sql = "SELECT * FROM ciudades c, proveedores WHERE NOM_PRO like '" + buscar
                     + "%' and proveedores.ID_CIUDAD = c.ID_CIUDAD";
         }
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[9];
            while(rs.next()){
                filas[0] = rs.getString("ID_PROVEEDOR");
                filas[1] = rs.getString("NOM_CIUDAD");
                filas[2] = rs.getString("NOM_PRO");
                filas[3] = rs.getString("APE_PRO");
                filas[4] = rs.getString("RUC_PRO");
                filas[5] = rs.getString("CEDU_PRO");
                filas[6] = rs.getString("DREC_PRO");
                filas[7] = rs.getString("EMAIL_PRO");
                filas[8] = rs.getString("CELU_PRO");
                model.addRow(filas);
            }
            Proveedores.tablaProveedor.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
    //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_PROVEEDOR) FROM proveedores";
         int IDPRO =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDPRO = rs.getInt(1);
            }
            if(IDPRO == 0){
                IDPRO = 1;
            }else{
                IDPRO++;
            }
            return String.valueOf(IDPRO);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
