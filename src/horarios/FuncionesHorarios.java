package horarios;

import conexion.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSNotifyFade;

/**
 *
 * @author Gustavo
 */
public class FuncionesHorarios {
    //Llamado a la conexion de la base de datos
    private static final conexion.Conexion con = new Conexion();
    private static final Connection conexion = Conexion.getConnection();
    private static PreparedStatement ps = null;
   //Funcion que realizar la accion de guardar los datos. 
     public static void extraerHoraTermino(String termino){
        System.out.println("Entro Al metodo");
        System.out.println(termino);
        String sql ="SELECT gabinetes.ID_GABINETE, ENUSO, HORA_TERMINO, NOM_ALUM, APE_ALUM FROM clases, gabinetes, horarios, alumnos "
                + "WHERE clases.ID_GABINETE = gabinetes.ID_GABINETE AND "
                + "clases.ID_HORARIO = horarios.ID_HORARIO AND "
                + "clases.ID_ALUMNO = alumnos.ID_ALUMNO AND "
                + " ENUSO = 'SI' AND "
                + " HORA_TERMINO < '"+termino+"'";
        String idGab="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString(1));
                System.out.println(rs.getString(4)+" "+ rs.getString(5));
                idGab=rs.getString(1);
            }
          
        } catch (SQLException ex) {  
            System.err.println("error:"+ex.getMessage());
          //  Logger.getLogger(FuncionesDC.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            String sqlGab ="update gabinetes set ENUSO = 'NO' where ID_GABINETE = '"+idGab+"'";
             ps = conexion.prepareStatement(sqlGab);
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                new rojerusan.RSNotifyFade("¡Culmino la Clase!", "Se Realizo la Actualizacion", 7, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
                /*JOptionPane.showMessageDialog(null, "Culmino la ClaseSe Realizo la Actualizacion");
                System.out.println("se realizo la actualizacion");  */
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }  
         idGab="";
        
    }
    public static boolean isRegistrar(SentenciasHorarios s) {
         String sql = SentenciasHorarios.REGISTRAR;
        try {
            ps = conexion.prepareStatement(sql);
           ps.setString(1, s.getHORA_INICIO());
            ps.setString(2, s.getHORA_TERMINO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {  System.err.println("error:"+ex.getMessage());
            return false;
         //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Funcion que guarda los datos al ser editados o modificados.
    public static boolean isUpdate(SentenciasHorarios s) {
        String sql = SentenciasHorarios.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getHORA_INICIO());
            ps.setString(2, s.getHORA_TERMINO());
            ps.setString(3, s.getID_HORARIO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {  System.err.println("error:"+ex.getMessage());
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
  //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDelete(SentenciasHorarios s) {
        String sql = SentenciasHorarios.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_HORARIO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {  System.err.println("error:"+ex.getMessage());
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 //Funcion que permite visualizar los datos en la tabla en forma de lista.
     public static void isListar(String buscar){
         DefaultTableModel model = (DefaultTableModel)Horarios.tablaHorario.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasHorarios.LISTAR;
         } else {
             sql = "SELECT * FROM horarios WHERE("
                     +"HORA_INICIO LIKE'"+buscar+"%' OR "
                     +"FECHA_DIA LIKE'"+buscar+"%'"
                     +")";
         }
         String datos[] =new String[3];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("ID_HORARIO");              
                datos[1] = rs.getString("HORA_INICIO");
                datos[2] = rs.getString("HORA_TERMINO");
                model.addRow(datos);
            }
            Horarios.tablaHorario.setModel(model);
        } catch (SQLException ex) {  System.err.println("error:"+ex.getMessage());
          //  Logger.getLogger(FuncionesDC.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    
 //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_HORARIO) FROM horarios";
        int IDHORA =0;
          try {
               
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDHORA = rs.getInt(1);
            }
            if(IDHORA == 0){
                IDHORA = 1;
            }else{
                IDHORA++;
            }
            return String.valueOf(IDHORA);
        } catch (SQLException ex) {
              System.err.println("error:"+ex.getMessage());
            return null;
        //    Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
     } 
}
