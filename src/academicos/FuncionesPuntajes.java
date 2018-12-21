/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package academicos;

import clases.Clases;
import clases.FuncionesClases;
import clases.SentenciasClases;
import clases.puntajesAlumnos;
import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Gustavo
 */
public class FuncionesPuntajes {
     //Llamado a la conexion de la base de datos
    private static final conexion.Conexion con = new Conexion();
    private static final Connection conexion = Conexion.getConnection();
    private static PreparedStatement ps = null;
      public static void isCargarAlumnos(){
        String sql = "SELECT alumnos.NOM_ALUM, alumnos.APE_ALUM FROM clases, alumnos "
                + "WHERE alumnos.ID_ALUMNO = clases.ID_ALUMNO";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                updatePuntajes.jcbAlumno.addItem(rs.getString(1)+" "+rs.getString(2));
                //registroClases.idAlumn.setText(rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
     public static void isAlumnos(){
        String nom="", ape="",nombre="";
        String sql = "SELECT alumnos.NOM_ALUM, alumnos.APE_ALUM, clases.ID_CLASE "
                + "FROM clases, alumnos "
                + "WHERE alumnos.ID_ALUMNO = clases.ID_ALUMNO";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                nom=rs.getString("alumnos.NOM_ALUM");
                ape=rs.getString("alumnos.APE_ALUM");
                nombre=nom+" "+ape;
                if(nombre.equals(updatePuntajes.jcbAlumno.getSelectedItem().toString())){
                  updatePuntajes.idClaseUp.setText(rs.getString("clases.ID_CLASE"));  
                }
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
      public static void isCargarUpTipo(){
        String sql = "SELECT TIPO_PUNTAJE FROM tipos_puntajes";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //updatePuntajes.jcbTipoPuntajeUp.addItem("Seleccione");
            while(rs.next()){
                 updatePuntajes.jcbTipoPuntajeUp.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void isCargar(){
        String sql = "SELECT TIPO_PUNTAJE FROM tipos_puntajes";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //registroPuntajes.jcbTipoPuntaje.addItem("Seleccione");
            while(rs.next()){
                 registroPuntajes.jcbTipoPuntaje.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
     public static boolean isUpdate(SentenciasPuntajes s) {
        String sql = SentenciasPuntajes.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getID_TIPOPUNTAJE());
            ps.setInt(2, s.getID_CLASE());
            ps.setInt(3, s.getPUNTAJE());
            ps.setString(4, s.getOBS());
            ps.setString(5, s.getID_PUNTAJE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDelete(SentenciasPuntajes s) {
        String sql = SentenciasPuntajes.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_PUNTAJE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_PUNTAJE) FROM puntajes";
         int IDPUNTAJES =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDPUNTAJES = rs.getInt(1);
            }
            if(IDPUNTAJES == 0){
                IDPUNTAJES = 1;
            }else{
                IDPUNTAJES++;
            }
            return String.valueOf(IDPUNTAJES);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     } 
        public static void isCargarTabla(String buscar){
        DefaultTableModel model = (DefaultTableModel)Puntajes.tablaPuntajes.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql="";
         if(buscar.equals("")){
            sql = SentenciasPuntajes.LISTAR; 
         }
        try {
            String datos[] =new String[7];
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("puntajes.ID_PUNTAJE");              
                datos[1] = rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM");
                datos[2] = rs.getString("tipos_puntajes.TIPO_PUNTAJE");
                datos[3] = rs.getString("modulos.MODULO");              
                datos[4] = rs.getString("puntajes.PUNTAJE");
                datos[5] = rs.getString("puntajes.TOT_PUNTAJE");
                datos[6] = rs.getString("puntajes.OBS");
                model.addRow(datos);
            }
             Puntajes.tablaPuntajes.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void isBuscarDatos(String buscar, String filtro){
         DefaultTableModel model = (DefaultTableModel)Puntajes.tablaPuntajes.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (filtro.equals("Alumno")){
             sql = SentenciasPuntajes.LISTAR + " AND alumnos.NOM_ALUM LIKE '"+buscar+"%'";
         }else if(filtro.equals("Tipo Puntaje")){
              sql = SentenciasPuntajes.LISTAR + " AND tipos_puntajes.TIPO_PUNTAJE LIKE '"+buscar+"%'";
         }else if(filtro.equals("Modulo")){
              sql = SentenciasPuntajes.LISTAR + " AND modulos.MODULO LIKE '"+buscar+"%'";
         }else if(filtro.equals("Puntaje")){
              sql = SentenciasPuntajes.LISTAR + " AND puntajes.PUNTAJE LIKE '"+buscar+"%'";
         }
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
             String datos[] =new String[7];
            while(rs.next()){
                datos[0] = rs.getString("puntajes.ID_PUNTAJE");              
                datos[1] = rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM");
                datos[2] = rs.getString("tipos_puntajes.TIPO_PUNTAJE");
                datos[3] = rs.getString("modulos.MODULO");              
                datos[4] = rs.getString("PUNTAJE");
                datos[5] = rs.getString("TOT_PUNTAJE");
                datos[6] = rs.getString("OBS");
                model.addRow(datos);
            }
             Puntajes.tablaPuntajes.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void mostrarPuntajeAlumno(String name) {
        DefaultTableModel model = (DefaultTableModel)puntajesAlumnos.tablaPuntajesAlumno.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
        }
        String sql = "SELECT * FROM tipos_puntajes, clases, puntajes, alumnos, modulos "
            + "WHERE tipos_puntajes.ID_TIPOPUNTAJE = puntajes.ID_TIPOPUNTAJE AND "
            + "clases.ID_CLASE = puntajes.ID_CLASE AND "
            + "clases.ID_ALUMNO = alumnos.ID_ALUMNO AND "
            + "clases.ID_MODULO = modulos.ID_MODULO", nom="",ape="",nomape=""; 
        
        try {
            String datos[] =new String[5];
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                nom=rs.getString("alumnos.NOM_ALUM");
                ape=rs.getString("alumnos.APE_ALUM");
                nomape=nom+" "+ape;
                if(nomape.equals(name)){
                    datos[0] = rs.getString("puntajes.ID_PUNTAJE");              
                    datos[1] = rs.getString("tipos_puntajes.TIPO_PUNTAJE");
                    datos[2] = rs.getString("modulos.MODULO");
                    datos[3] = rs.getString("puntajes.PUNTAJE");              
                    datos[4] = rs.getString("puntajes.TOT_PUNTAJE");
                    model.addRow(datos);
                } 
            }
            puntajesAlumnos.tablaPuntajesAlumno.setModel(model);
            puntajesAlumnos.lblNameAlumno.setText("Detalle de Puntajes del Alumno: "+name); 
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
        nomape="";
    }
}
