/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import conexion.Conexion;
import docentes.Docentes;
import docentes.SentenciasDocentes;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import static principal.nuevoPrincipal.panelEscritorio;
import rojerusan.RSNotifyAnimated;

/**
 *
 * @author Gustavo
 */
public class FuncionesPrincipal {
     private static  conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
    //Funcion centrar Ventanas
    public static void CentrarVentanaInterna(JInternalFrame internalFrame){ //pasamos como parametros un objeto JinternalFrames
        int x=  (panelEscritorio.getWidth()/2)- internalFrame.getWidth()/2;
        int y=  (panelEscritorio.getHeight()/2)- internalFrame.getHeight()/2;
        internalFrame.setLocation(x, y);
        boolean mostrar = true;
        for (int a = 0; a < panelEscritorio.getComponentCount(); a++) {
            if (internalFrame.getClass().isInstance(panelEscritorio.getComponent(a))) {
                mostrar = false;
        }
        }
        if (mostrar == true) {
            panelEscritorio.add(internalFrame);
            internalFrame.show();
        }else{
            JOptionPane.showMessageDialog(null, "LA VENTANA SALIDA YA ESTÁ ABIERTA");
        }   
    }
    public static void Cerrar(){
      menu1 aca = new menu1(new JFrame(), true);
      menu2 aca1 = new menu2(new JFrame(), true);
      menu3 aca2 = new menu3(new JFrame(), true);
      menu4 aca3 = new menu4(new JFrame(), true);
      aca.dispose();
      aca1.dispose();
      aca2.dispose();
      aca3.dispose();
    }
    public static void cargarLista(){
        DefaultListModel modelLista = new DefaultListModel();
        String sql = SentenciasDocentes.LISTAR;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String filas[] = new String[1];
            while(rs.next()){
                filas[0] = rs.getString("NOM_DOCENT")+" "+rs.getString("APE_DOCENT");
                modelLista.addElement(filas[0]);
            }
        clases.Clases.jlistDocentes.setModel(modelLista);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }    
    }
    public static String horaaudi="";
    public static void auditorias(Integer idUsuario, String hora, String event, String tabla, String fecha){
        System.out.println("Entro al metodo auditoria");
          try {
            String sql = "INSERT INTO auditorias(ID_USUARIO, HORA_AUDI, EVENTO, TABLA, FECHA_AUDI)"
                    + " VALUES ('"+idUsuario+"', '"+hora+"', '"+event+"', '"+tabla+"', '"+fecha+"')";
            PreparedStatement ps = conexion.prepareStatement(sql);
            int resultado = ps.executeUpdate();
            if(resultado > 0){
                new rojerusan.RSNotifyAnimated("Hecha la Auditoria", "En la Tabla: "+tabla+", el evento fue: "+event, 3, RSNotifyAnimated.PositionNotify.BottomLeft, RSNotifyAnimated.AnimationNotify.LeftRight, RSNotifyAnimated.TypeNotify.INFORMATION).setVisible(true);
            }else{
                new rojerusan.RSNotifyAnimated("Error", "No se Realizo la auditoria", 3, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, RSNotifyAnimated.TypeNotify.INFORMATION).setVisible(true);
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
}
