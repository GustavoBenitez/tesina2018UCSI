package academicos;

import alumnos.updateAlumno;
import conexion.Conexion;
import departamentos.Ciudades;
import departamentos.Departamentos;
import departamentos.SentenciaDC;
import departamentos.registroCiudad;
import departamentos.updateCiudad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class FuncionesTipoPuntajes {
   //Llamado a la conexion de la base de datos
    private static final conexion.Conexion con = new Conexion();
    private static final Connection conexion = Conexion.getConnection();
    private static PreparedStatement ps = null;
  //Funcion que realizar la accion de guardar los datos. 
    public static boolean isRegistrar(SentenciasTipoPuntajes s) {
         String sql = SentenciasTipoPuntajes.REGISTRAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getTIPO_PUNTAJE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
         //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Funcion que guarda los datos al ser editados o modificados.
    public static boolean isUpdate(SentenciasTipoPuntajes s) {
        String sql = SentenciasTipoPuntajes.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getTIPO_PUNTAJE());
            ps.setString(2, s.getID_TIPOPUNTAJE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDelete(SentenciasTipoPuntajes s) {
        String sql = SentenciasTipoPuntajes.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_TIPOPUNTAJE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 //Funcion que permite visualizar los datos en la tabla en forma de lista.
     public static void isListar(String buscar){
         DefaultTableModel model = (DefaultTableModel)tipoPuntaje.tablaTipoPuntaje.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasTipoPuntajes.LISTAR;
         } else {
             sql = "SELECT * FROM tipos_puntajes WHERE(TIPO_PUNTAJE LIKE'"+buscar+"%')";
         }
         String datos[] =new String[2];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("ID_TIPOPUNTAJE");              
                datos[1] = rs.getString("TIPO_PUNTAJE");
                model.addRow(datos);
            }
            tipoPuntaje.tablaTipoPuntaje.setModel(model);
        } catch (SQLException ex) {
          //  Logger.getLogger(FuncionesDC.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
 //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_TIPOPUNTAJE) FROM tipos_puntajes";
        int IDTIPPO =0;
          try {    
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDTIPPO = rs.getInt(1);
            }
            if(IDTIPPO == 0){
                IDTIPPO = 1;
            }else{
                IDTIPPO++;
            }
            return String.valueOf(IDTIPPO);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
}
