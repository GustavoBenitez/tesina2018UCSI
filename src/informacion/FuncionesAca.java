package informacion;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import principal.FuncionesPrincipal;
import principal.nuevoPrincipal;
import rojerusan.RSNotifyFade;

public class FuncionesAca {
    //Llamado a la conexion de la base de datos
    private static conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
 //Funcion que realizar la accion de guardar los datos. 
    public static boolean isRegistrar(SentenciasAca s) {
         String sql = SentenciasAca.REGISTRAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_CURSO());
            ps.setString(2, s.getNOM_CURSO());
            ps.setInt(3, s.getDURACION());
            ps.setInt(4, s.getCUOTA());
            ps.setDouble(5, s.getPRECIO_CUOTA());
            ps.setInt(6, s.getPRECIO_TOT());
            ps.setDouble(7, s.getCUR_IVA10());
            ps.setDouble(8, s.getCUR_IVA5());
            ps.setDouble(9, s.getCUR_IVA0());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
         //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Funcion que guarda los datos al ser editados o modificados.
    public static boolean isUpdate(SentenciasAca s) {
        String sql = SentenciasAca.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getNOM_CURSO());
            ps.setInt(2, s.getDURACION());
            ps.setInt(3, s.getCUOTA());
            ps.setDouble(4, s.getPRECIO_CUOTA());
            ps.setInt(5, s.getPRECIO_TOT());
            ps.setDouble(6, s.getCUR_IVA10());
            ps.setDouble(7, s.getCUR_IVA5());
            ps.setDouble(8, s.getCUR_IVA0());
            ps.setString(9, s.getID_CURSO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDelete(SentenciasAca s) {
        String sql = SentenciasAca.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_CURSO());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDeleteIns(SentenciasAca s) {
        String sql = SentenciasAca.ELIMINAR_INS;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_INSCRIPCION());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 //Funcion que permite visualizar los datos en la tabla en forma de lista.
     public static void isListar(String buscar){
         DefaultTableModel model = (DefaultTableModel)Cursos.tablaCurso.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasAca.LISTAR;
         } else {
             sql = "SELECT * FROM cursos WHERE("
                     +"NOM_CURSO LIKE'"+buscar+"%'"
                     +")";
         }
         String datos[] =new String[9];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("ID_CURSO");              
                datos[1] = rs.getString("NOM_CURSO");
                datos[2] = rs.getString("DURACION");
                datos[3] = rs.getString("CUOTA");
                datos[4] = rs.getString("PRECIO_CUOTA");
                datos[5] = rs.getString("PRECIO_TOT");
                datos[6] = rs.getString("CUR_IVA10");
                datos[7] = rs.getString("CUR_IVA5");
                datos[8] = rs.getString("CUR_IVA0");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }

 //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_CURSO) FROM cursos";
        int id =0;
          try {
               
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               id= rs.getInt(1);
            }
            if(id == 0){
                id = 1;
            }else{
                id++;
            }
            return String.valueOf(id);
        } catch (SQLException ex) {
              System.err.println("error: "+ex.getMessage());
            return null;
        //    Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
       public static String extraerIDMaxModulo(){
         String sql = "SELECT MAX(ID_MODULO) FROM modulos";
        int idmod =0;
          try {
               
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               idmod= rs.getInt(1);
            }
            if(idmod == 0){
                idmod = 1;
            }else{
                idmod++;
            }
            return String.valueOf(idmod);
        } catch (SQLException ex) {
              System.err.println("error: "+ex.getMessage());
            return null;
        //    Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void isListarModulo(String buscar){
         DefaultTableModel model = (DefaultTableModel)Modulos.tablaModulo.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasAca.LISTAR_CURSO;
         } else {
             sql = "SELECT *  FROM cursos c, modulos WHERE c.ID_CURSO = modulos.ID_CURSO AND "
                     + "MODULO LIKE '"+buscar+"%' OR "
                     + "c.NOM_CURSO LIKE '"+buscar+"%'";
         }
         String datos[] =new String[3];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("ID_MODULO");              
                datos[1] = rs.getString("c.NOM_CURSO");
                datos[2] = rs.getString("MODULO");
                model.addRow(datos);
            }
        } catch (SQLException ex) {System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void guardarModulo(){
        String sql="INSERT INTO modulos (ID_MODULO, ID_CURSO, MODULO) VALUES (?,?,?)";
        String nomModulo = registoModulo.txtNomModulo.getText();
        Integer idCurso=Integer.parseInt(registoModulo.lblIdCursoMOd.getText());
        Integer idModulo=Integer.parseInt(registoModulo.lblIdMod.getText());
        String tabla="MODULO", evento="INSERT", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1,idModulo);
            ps.setInt(2,idCurso);
            ps.setString(3,nomModulo);
            int n = ps.executeUpdate();
            if(n>0){
                FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                new rojerusan.RSNotifyFade("¡HECHO!", "Se guardo correctamente", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
            }  
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(registoModulo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void isCargarCurso(){
        String sql = "SELECT NOM_CURSO FROM cursos";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroInscrip.jcbCursoINs.addItem("Seleccione");
            while(rs.next()){
                registroInscrip.jcbCursoINs.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
   public static String extraerIDMaxIns(){
         String sql = "SELECT MAX(ID_INSCRIPCION) FROM inscripciones";
        int idIns =0;
          try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               idIns= rs.getInt(1);
            }
            if(idIns == 0){
                idIns = 1;
            }else{
                idIns++;
            }
            return String.valueOf(idIns);
        } catch (SQLException ex) {
              System.err.println("error: "+ex.getMessage());
            return null;
        //    Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
   public static void isListarIns(String buscar){
         DefaultTableModel model = (DefaultTableModel)Inscripcion.tablaIns.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasAca.LISTAR_INS;
         } else {
            sql = "SELECT *  FROM inscripciones, alumnos, cursos "
            + "WHERE inscripciones.FK_CURSO = cursos.ID_CURSO AND inscripciones.FK_ALUMNO = alumnos.ID_ALUMNO AND "
            + "fecha_inscripcion LIKE '"+buscar+"%' OR "
            + "cursos.NOM_CURSO LIKE '"+buscar+"%' OR"
            + "alumnos.NOM_ALUM LIKE '"+buscar+"%'";
         }
         String datos[] =new String[6];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){   
                datos[0] = rs.getString("ID_INSCRIPCION");              
                datos[1] = rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM");
                datos[2] = rs.getString("cursos.NOM_CURSO");
                datos[3] = rs.getString("fecha_inscripcion");
                datos[4] = rs.getString("PRECIO_CUO");
                datos[5] = rs.getString("CANT_CUOTA");
                model.addRow(datos);
            }
             Inscripcion.tablaIns.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error en listar inscripcion "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
   public static void isPrecio(String name) {
        String nombre="";
        String sql = "SELECT * FROM cursos";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                nombre=rs.getString("NOM_CURSO");
                if(nombre.equals(name)){
                 registroInscrip.txtPrecioCuo.setText(rs.getString("PRECIO_CUOTA"));
                 registroInscrip.txtCantidadCuota.setText(rs.getString("CUOTA"));
                }
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
