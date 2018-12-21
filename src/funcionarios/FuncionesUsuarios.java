package funcionarios;
import conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import login.Login;
import org.apache.commons.codec.digest.DigestUtils;
import principal.nuevoPrincipal;

/**
 * @author Gustavo
 */
public class FuncionesUsuarios {
    private static conexion.Conexion con = new Conexion();
    private static java.sql.Connection conexion = con.getConnection();
    PreparedStatement ps;
    //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_USUARIO) FROM usuarios";
         int IDUSUARIO=0;
          try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDUSUARIO = rs.getInt(1);
            }
            if(IDUSUARIO == 0){
                IDUSUARIO = 1;
            }else{
                IDUSUARIO++;
            }
            return String.valueOf(IDUSUARIO);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public static void buscarDatosTabla(String buscar, String filtro){
        DefaultTableModel model = (DefaultTableModel)Usuarios.tablaUsu.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = "SELECT * FROM usuarios, funcionarios WHERE usuarios.ID_FUNCIONARIO = funcionarios.ID_FUNCIONARIO";
         } else if(filtro.equals("Usuario")){
             sql = "SELECT * FROM usuarios, funcionarios WHERE usuarios.ID_FUNCIONARIO = funcionarios.ID_FUNCIONARIO "
             + "AND USUARIO LIKE '"+buscar+"%'";
         }else if(filtro.equals("Funcionario")){
             sql = "SELECT * FROM usuarios, funcionarios WHERE usuarios.ID_FUNCIONARIO = funcionarios.ID_FUNCIONARIO "
             + "AND NOM_FUN LIKE '"+buscar+"%'";
         }
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[4];
            while(rs.next()){
                filas[0] = rs.getString("ID_USUARIO");
                filas[1] = rs.getString("NOM_FUN")+" "+rs.getString("APE_FUN");
                filas[2] = rs.getString("USUARIO");
                filas[3] = rs.getString("PASSW");
                
                model.addRow(filas);
            }
            Usuarios.tablaUsu.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
     public static void iscargarTabla(String buscar){
        DefaultTableModel model = (DefaultTableModel)Usuarios.tablaUsu.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = "SELECT * FROM usuarios, funcionarios WHERE usuarios.ID_FUNCIONARIO = funcionarios.ID_FUNCIONARIO";
         } 
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[4];
            while(rs.next()){
                filas[0] = rs.getString("ID_USUARIO");
                filas[1] = rs.getString("NOM_FUN")+" "+rs.getString("APE_FUN");
                filas[2] = rs.getString("USUARIO");
                filas[3] = rs.getString("PASSW");
                
                model.addRow(filas);
            }
            Usuarios.tablaUsu.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
//Funcion que verifica el usuario con la cantraseña encriptada para asi iniciar sesion.
       public static void verificarUsuario(String usuario, String pas, JFrame local) {
        String user = "", pass = "";
        int idUsuario=0;
        try {
            String sql = "SELECT * FROM usuarios WHERE USUARIO = '"+usuario+"'";
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                idUsuario=rs.getInt("ID_USUARIO");
                user = rs.getString("USUARIO");
                pass = rs.getString("PASSW");
            }
            if(pass.equals(pas)){
                Login.info.setText("¡ USUARIO O CONTRASEÑA INCORRECTOS !");
                Login.txtUsuarioInicio.requestFocus();
            }else {
                 String PASSWORD = DigestUtils.md5Hex(pas);
                 if (user.equals(usuario) && pass.equals(PASSWORD)) {
                    local.dispose();
                    new nuevoPrincipal().setVisible(true);
                    nuevoPrincipal.lblLoginUsuario.setText("User: @"+user);
                    Login.usu=user;
                    Login.idUsu=idUsuario;
                } else{
                    Login.info.setText("¡ USUARIO O CONTRASEÑA INCORRECTOS !");
                    Login.txtUsuarioInicio.requestFocus();
                }
            }
            String sql2 = "update usuarios set ACTIVO = 'ON' where ID_USUARIO = '"+idUsuario+"'";
            PreparedStatement ps = conexion.prepareStatement(sql2);
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                System.out.println("Se actualizo el usuario a on");
            }else{
                System.out.println("Error al actualizar el usuario a on");
            }  
        } catch (SQLException ex) {
            Logger.getLogger(login.Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
