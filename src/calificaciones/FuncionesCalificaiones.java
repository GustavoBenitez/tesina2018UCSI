
package calificaciones;

import academicos.SentenciasPuntajes;
import clases.FuncionesClases;
import clases.puntajesAlumnos;
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

/**
 *
 * @author Gustavo
 */
public class FuncionesCalificaiones {
     private static final conexion.Conexion con = new Conexion();
    private static final Connection conexion = Conexion.getConnection();
    private static PreparedStatement ps = null;
    public static void isModulo(String modulo) {
        String sql1="SELECT * FROM modulos, cursos WHERE modulos.ID_CURSO = cursos.ID_CURSO", modu="";
        try {
            Statement st1 = conexion.createStatement();
            ResultSet rs1 = st1.executeQuery(sql1);
                while(rs1.next()){
                    modu=rs1.getString("modulos.MODULO");
                    if(modu.equals(modulo)){
                       registroCalificacion.txtCursoCali.setText(rs1.getString("cursos.NOM_CURSO")); 
                       registroCalificacion.txtModuloCali.setText(modu);
                       registroCalificacion.idMod.setText(rs1.getString("modulos.ID_MODULO"));
                    } 
                }
        } catch (Exception ex) {
             System.out.println("error: " + ex.getMessage());
        }
    }
    public static void cargarPuntajes(String[] tipoPunt, String[] punt, int contador){
         DefaultTableModel model = (DefaultTableModel) registroCalificacion.tablaPuntajeSuma.getModel();
         String[] filas = new String[2];
         int c=contador;
        try {
            while(c>0){
                filas[0] = tipoPunt[c];
                filas[1] = punt[c];
                c--;   
                model.addRow(filas);
            }
            registroCalificacion.tablaPuntajeSuma.setModel(model);
        } catch (Exception e) {
            System.err.println("error al cargar puntos:"+e.getMessage());
        }    
    }
    public static String extraerIDMax(){
         String sql = "SELECT MAX(id_nota) FROM calificaciones";
        int idCLA =0;
          try {
               
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               idCLA= rs.getInt(1);
            }
            if(idCLA == 0){
                idCLA = 1;
            }else{
                idCLA++;
            }
            return String.valueOf(idCLA);
        } catch (SQLException ex) {
              System.err.println("error: "+ex.getMessage());
            return null;
        //    Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void guardarCalificacion() {
        String tabla="CALIFICACIONES", evento="INSERT", hora=nuevoPrincipal.lblHora.getText(), fecha=nuevoPrincipal.lblFechaAc.getText();
        String nom="", ape="",nombre="", name="";
        Integer idAlum = 0;
        name=registroCalificacion.lblNameAlumno.getText();
        String sql = "SELECT alumnos.NOM_ALUM, alumnos.APE_ALUM, alumnos.ID_ALUMNO FROM alumnos";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                nom=rs.getString("alumnos.NOM_ALUM");
                ape=rs.getString("alumnos.APE_ALUM");
                nombre=nom+" "+ape;
                if(nombre.equals(name)){
                    idAlum = rs.getInt("alumnos.ID_ALUMNO");
                }
            }
            System.out.println("alumno seleccionado00000: "+idAlum);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        String InsertarSQL="INSERT INTO calificaciones (id_nota, id_alumno, nota_final) VALUES (?,?,?)";
        String idNota =registroCalificacion.lblIDNOta.getText();
        Integer nota = Integer.parseInt(registroCalificacion.txtNota.getText());
        Integer idMOd=Integer.parseInt(registroCalificacion.idMod.getText());
        
        try {
            ps = conexion.prepareStatement(InsertarSQL);
            ps.setString(1,idNota);
            ps.setInt(2,idAlum);
            ps.setInt(3,nota);
            int n = ps.executeUpdate();
            if(n>0){
                FuncionesPrincipal.auditorias(login.Login.idUsu, hora, evento, tabla, fecha);
                new rojerusan.RSNotifyFade("¡HECHO!", "Se Guardo Correctamente", 3, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
            }  
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(registroCalificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        try {
             String sqlHas = "INSERT INTO calificaciones_has_modulos(ID_MODULO, id_nota)"
                + " VALUES ('"+idMOd+"', '"+idNota+"')";
           ps = conexion.prepareStatement(sqlHas);
            int resultado = ps.executeUpdate();
                if(resultado > 0){
                    System.out.println("Se Guardo el has");
                }else{
                     JOptionPane.showMessageDialog(null,"error al guardar el has");
                }
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(registroCalificacion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void mostrarPuntajeAlumno(String name) {
        DefaultTableModel model = (DefaultTableModel)registroCalificacion.tablaPuntajeSuma.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
        }
        String sql = "SELECT * FROM tipos_puntajes, clases, puntajes, alumnos, modulos "
            + "WHERE tipos_puntajes.ID_TIPOPUNTAJE = puntajes.ID_TIPOPUNTAJE AND "
            + "clases.ID_CLASE = puntajes.ID_CLASE AND "
            + "clases.ID_ALUMNO = alumnos.ID_ALUMNO AND "
            + "clases.ID_MODULO = modulos.ID_MODULO", nom="",ape="",nomape="", modu=""; 
        try {
            String datos[] =new String[2];
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                nom=rs.getString("alumnos.NOM_ALUM");
                ape=rs.getString("alumnos.APE_ALUM");
                nomape=nom+" "+ape;
                modu=rs.getString("modulos.MODULO");
                if(nomape.equals(name)){
                    datos[0] = rs.getString("tipos_puntajes.TIPO_PUNTAJE");              
                    datos[1] = rs.getString("puntajes.PUNTAJE");
                    model.addRow(datos);
                }             
            }
            registroCalificacion.lblNameAlumno.setText("Registrdo de Calificación de: "+name);
            registroCalificacion.tablaPuntajeSuma.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
