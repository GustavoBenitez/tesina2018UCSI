package informacion;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import principal.nuevoPrincipal;
import rojerusan.RSNotifyShadowAnimated;

public class FuncionesAudi {
    //Llamado a la conexion de la base de datos
    private static conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
    public static void isListarAuditoria(){
        DefaultTableModel model = (DefaultTableModel)Auditoria.tablaAuditoria.getModel();
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        String sql = "SELECT * FROM usuarios, auditorias WHERE usuarios.ID_USUARIO = auditorias.ID_USUARIO "
                + "ORDER BY ID_AUDITORIA";
        String datos[] =new String[3];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(nuevoPrincipal.lblFechaAc.getText().equals(rs.getString("FECHA_AUDI"))){
                    Auditoria.lblFechaAudi.setText("Fecha de Auditoria: "+rs.getString("FECHA_AUDI"));
                    datos[0] = rs.getString("ID_AUDITORIA");              
                    datos[1] = rs.getString("EVENTO");
                    datos[2] = rs.getString("TABLA");  
                    model.addRow(datos);
                }/*datos[2] = rs.getString("HORA_AUDI");
                 datos[1] = rs.getString("FECHA_AUDI");
                datos[4] = rs.getString("EVENTO");
                datos[5] = rs.getString("TABLA");*/  
            }
            Auditoria.tablaAuditoria.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void buscarAuditoria(String buscar){
        DefaultTableModel model = (DefaultTableModel)Auditoria.tablaAuditoria.getModel();
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        String sql = "SELECT * FROM auditorias WHERE EVENTO LIKE '%"+buscar+"%' OR TABLA LIKE '%"+buscar+"%'";
        String datos[] =new String[3];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("ID_AUDITORIA");              
                datos[1] = rs.getString("EVENTO");
                datos[2] = rs.getString("TABLA");  
                model.addRow(datos);
            }
            Auditoria.tablaAuditoria.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void isListarAuditoriaxFecha(String fecha){
        DefaultTableModel model = (DefaultTableModel)Auditoria.tablaAuditoria.getModel();
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        String sql = "SELECT * FROM usuarios, auditorias WHERE usuarios.ID_USUARIO = auditorias.ID_USUARIO "
                + "ORDER BY ID_AUDITORIA";
        String datos[] =new String[3];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(fecha.equals(rs.getString("FECHA_AUDI"))){
                    Auditoria.lblFechaAudi.setText("Fecha de Auditoria: "+rs.getString("FECHA_AUDI"));
                    datos[0] = rs.getString("ID_AUDITORIA");              
                    datos[1] = rs.getString("EVENTO");
                    datos[2] = rs.getString("TABLA");
                    model.addRow(datos);
                }/*else{
                   new rojerusan.RSNotifyShadowAnimated("Oops!", "No hay Auditoria en la fecha "+fecha, 5, RSNotifyShadowAnimated.PositionNotify.BottomRight, RSNotifyShadowAnimated.AnimationNotify.BottomUp, RSNotifyShadowAnimated.TypeNotify.INFORMATION).setVisible(true);
                } */   
            }
            Auditoria.tablaAuditoria.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void mostrarQuienHizoenlaHora(String idAudi ){
        String sql = "SELECT * FROM usuarios, auditorias WHERE usuarios.ID_USUARIO = auditorias.ID_USUARIO "
                + "ORDER BY ID_AUDITORIA";
        String usu="", hora="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(idAudi.equals(rs.getString("ID_AUDITORIA"))){
                   usu = rs.getString("usuarios.USUARIO"); 
                   hora = rs.getString("HORA_AUDI");
                   new rojerusan.RSNotifyShadowAnimated("Auditoria.", "Realizada por: "+usu+" a las "+hora, 7, RSNotifyShadowAnimated.PositionNotify.BottomRight, RSNotifyShadowAnimated.AnimationNotify.BottomUp, RSNotifyShadowAnimated.TypeNotify.INFORMATION).setVisible(true);  
                } 
            }
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
