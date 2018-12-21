package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 * @author Gustavo
 */
public class Conexion {
  public static Connection conection=null;
  public static Connection getConnection(){
       try {
            String url = "jdbc:mysql://localhost:3306/dbtesina?useUnicode=true"
                    + "&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false"
                    + "&serverTimezone=UTC",
                    user = "root", password = "10011";
 
           conection = DriverManager.getConnection(url, user, password);
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Fallo al recibir base de datos");
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "No hay resultado");
        }finally{
            System.out.println("|*CONECTADO A BD*|");
            return conection;
             }
       
       }
}
