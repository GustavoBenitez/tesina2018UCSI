
package gabinetes;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import librerias.GenerarNumero;

/**
 *
 * @author Gustavo
 */
public class FuncionesGabinete {
     //Llamado a la conexion de la base de datos
    private static final conexion.Conexion con = new Conexion();
    private static final Connection conexion = Conexion.getConnection();
    private static PreparedStatement ps = null;
    //Funcion que realizar la accion de guardar los datos. 
    public static boolean isRegistrar(SentenciasGabinete s) {
         String sql = SentenciasGabinete.REGISTRAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getCODIGO());
            ps.setString(2, s.getHABILITADO());
            ps.setString(3, s.getENUSO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
         //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Funcion que guarda los datos al ser editados o modificados.
    public static boolean isUpdate(SentenciasGabinete s) {
        String sql = SentenciasGabinete.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getCODIGO());
            ps.setString(2, s.getHABILITADO());
            ps.setString(3, s.getENUSO());
            ps.setString(4, s.getID_GABINETE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDelete(SentenciasGabinete s) {
        String sql = SentenciasGabinete.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_GABINETE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 //Funcion que permite visualizar los datos en la tabla en forma de lista.
     public static void isListar(String buscar){
         DefaultTableModel model = (DefaultTableModel)Gabinetes.tablaGabinete.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasGabinete.LISTAR;
         } else {
             sql = "SELECT * FROM gabinetes WHERE("
                     +"CODIGO LIKE'"+buscar+"%' OR "
                     +"HABILITADO LIKE'"+buscar+"%' OR "
                     +"ENUSO LIKE'"+buscar+"%'"
                     +")";
         }
         String datos[] =new String[4];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("ID_GABINETE");              
                datos[1] = rs.getString("CODIGO");
                datos[2] = rs.getString("HABILITADO");
                datos[3] = rs.getString("ENUSO");
                model.addRow(datos);
            }
           Gabinetes.tablaGabinete.setModel(model);
        } catch (SQLException ex) {
          //  Logger.getLogger(FuncionesDC.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
 //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_GABINETE) FROM gabinetes";
        int IDGABI =0;
          try {
               
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDGABI = rs.getInt(1);
            }
            if(IDGABI == 0){
                IDGABI = 1;
            }else{
                IDGABI++;
            }
            return String.valueOf(IDGABI);
        } catch (SQLException ex) {
              System.err.println("error: "+ex.getMessage());
            return null;
        //    Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public static void codigos() {
        int j;
        String c="";
        String sql="SELECT MAX(CODIGO) FROM gabinetes";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){              
                 c=rs.getString(1);
            }
            if(c==null){
                registroGabinete.txtCodGab.setText("0001");
            } else {
                 j=Integer.parseInt(c);
                 librerias.GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 registroGabinete.txtCodGab.setText(gen.serie());            
            }
        } catch (SQLException ex) {
            System.err.println("error:"+ex.getMessage());
           Logger.getLogger(registroGabinete.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
