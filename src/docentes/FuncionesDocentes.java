
package docentes;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.print.Doc;
import javax.swing.table.DefaultTableModel;
public class FuncionesDocentes {
    private static  conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
     //Fumcion que carga el combobox de ciudades
    public static void cargarCiudadDoc(){
        String sql = "SELECT NOM_CIUDAD FROM ciudades";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroDocente.jcbCiudadesDoc.addItem("Seleccione una Ciudad");
            while(rs.next()){
                registroDocente.jcbCiudadesDoc.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void cargarCursos(){
        String sql = "SELECT NOM_CURSO FROM cursos";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroDocentesCurso.jcbCursos.addItem("Seleccione");
            while(rs.next()){
                registroDocentesCurso.jcbCursos.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
     public static void cargarCiudadDocUp(){
        String sql = "SELECT NOM_CIUDAD FROM ciudades";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            updateDocentes.jcbCiudadDocUp.addItem("Seleccione una Ciudad");
            while(rs.next()){
                updateDocentes.jcbCiudadDocUp.addItem(rs.getString(1));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
   public static boolean isUpdate(SentenciasDocentes s) {
        String sql = SentenciasDocentes.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getID_CIUDAD());
            ps.setString(2, s.getNOM_DOCENT());
            ps.setString(3, s.getAPE_DOCENT());
            ps.setString(4, s.getCI_DOCENT());
            ps.setString(5, s.getEMAIL_DOCENTE());
            ps.setString(6, s.getDIREC_DOCENT());
            ps.setString(7, s.getCELU_DOCENT());
            ps.setString(8, s.getID_DOCENTE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  //Funcion que borra de la base de datos al usuario selecionado
     public static boolean isDelete(SentenciasDocentes s) {
        String sql = SentenciasDocentes.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_DOCENTE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
//Funcion que cargar los datos a la tabla
    public static void iscargarTabla(String buscar){
        DefaultTableModel model = (DefaultTableModel)Docentes.tablaDocente.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasDocentes.LISTAR;
        } 
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[8];
            while(rs.next()){
                filas[0] = rs.getString("ID_DOCENTE");
                filas[1] = rs.getString("ciudades.NOM_CIUDAD");
                filas[2] = rs.getString("NOM_DOCENT");
                filas[3] = rs.getString("APE_DOCENT");
                filas[4] = rs.getString("CI_DOCENT");
                filas[5] = rs.getString("DIREC_DOCENT");
                filas[6] = rs.getString("EMAIL_DOCENTE");
                filas[7] = rs.getString("CELU_DOCENT");
                model.addRow(filas);
            }
            Docentes.tablaDocente.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
    //Funcion que cargar los datos a la tabla
    public static void buscarCursoDOc(String buscar){
        DefaultTableModel model = (DefaultTableModel)listDocentesCursos.tablaListDocentes.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        String sql = SentenciasDocentes.LISTAR_CURSO_DOCENTE + " AND cursos.NOM_CURSO LIKE '"+buscar+"%'";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[3];
            while(rs.next()){
                filas[0] = rs.getString("PK_LISTDOCENTES");
                filas[1] = rs.getString("docentes.NOM_DOCENT")+" "+rs.getString("docentes.APE_DOCENT");
                filas[2] = rs.getString("cursos.NOM_CURSO");
                model.addRow(filas);
            }
           listDocentesCursos.tablaListDocentes.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
     public static void filtrarCursosdeDOcentes(String docente, String idDocente){
        DefaultTableModel model = (DefaultTableModel)listDocentesCursos.tablaListDocentes.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
        String sql = SentenciasDocentes.LISTAR_CURSO_DOCENTE, nom="", ape="", nomcpl="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[3];
            while(rs.next()){
                nom=rs.getString("docentes.NOM_DOCENT");
                ape=rs.getString("docentes.APE_DOCENT");
                nomcpl=nom+" "+ape;
                if(docente.equals(nomcpl) && idDocente.equals(rs.getString("docentes.ID_DOCENTE"))){
                    filas[0] = rs.getString("PK_LISTDOCENTES");
                    filas[1] = nomcpl;
                    filas[2] = rs.getString("cursos.NOM_CURSO");
                    model.addRow(filas);
                    System.out.println("docentes.FuncionesDocentes.filtrarCursosdeDOcentes() ha funcionado");
                }
            }
           listDocentesCursos.tablaListDocentes.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
    //Funcion que cargar los datos a la tabla
    public static void isBuscarDatos(String buscar, String filtro){
        DefaultTableModel model = (DefaultTableModel)Docentes.tablaDocente.getModel();
        while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (filtro.equals("Nombre")){
             sql = "SELECT * FROM docentes d, ciudades "
                    + "WHERE d.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND NOM_DOCENT LIKE '"+buscar+"%'";
         }else if(filtro.equals("Apellido")){
              sql = "SELECT * FROM docentes d, ciudades "
                    + "WHERE d.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND APE_DOCENT LIKE '"+buscar+"%'";
         }else if(filtro.equals("Apellido")){
              sql = "SELECT * FROM docentes d, ciudades "
                    + "WHERE d.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND APE_DOCENT LIKE '"+buscar+"%'";
         }else if(filtro.equals("Cedula")){
              sql = "SELECT * FROM docentes d, ciudades "
                    + "WHERE d.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND CI_DOCENT LIKE '"+buscar+"%'";
         }else if(filtro.equals("Ciudad")){
              sql = "SELECT * FROM docentes d, ciudades "
                    + "WHERE d.ID_CIUDAD = ciudades.ID_CIUDAD "
                    + "AND ciudades.NOM_CIUDAD LIKE '"+buscar+"%'";
         }
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String[] filas = new String[8];
            while(rs.next()){
                filas[0] = rs.getString("ID_DOCENTE");
                filas[1] = rs.getString("ciudades.NOM_CIUDAD");
                filas[2] = rs.getString("NOM_DOCENT");
                filas[3] = rs.getString("APE_DOCENT");
                filas[4] = rs.getString("CI_DOCENT");
                filas[5] = rs.getString("DIREC_DOCENT");
                filas[6] = rs.getString("EMAIL_DOCENTE");
                filas[7] = rs.getString("CELU_DOCENT");
                model.addRow(filas);
            }
            Docentes.tablaDocente.setModel(model);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }   
    }
    //Funcion que extrae el mayor id para luego sunarle uno para hacer la siguiente asignacion.
     public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_DOCENTE) FROM docentes";
         int IDDOC =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDDOC = rs.getInt(1);
            }
            if(IDDOC == 0){
                IDDOC = 1;
            }else{
                IDDOC++;
            }
            return String.valueOf(IDDOC);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public static String extraerIDMaxLisDoc(){
         String sql = "SELECT MAX(PK_LISTDOCENTES) FROM lista_docentes_cursos";
         int IDDOC =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDDOC = rs.getInt(1);
            }
            if(IDDOC == 0){
                IDDOC = 1;
            }else{
                IDDOC++;
            }
            return String.valueOf(IDDOC);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
