package clases;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import clases.registroClases;
import docentes.SentenciasDocentes;
import gabinetes.SentenciasGabinete;
import informacion.FuncionesAca;
import informacion.SentenciasAca;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import principal.nuevoPrincipal;
import clases.Clases;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

/**
 *
 * @author Gustavo
 */
public class FuncionesClases {
    private static  conexion.Conexion con = new Conexion();
    private static Connection conexion = con.getConnection();
    private static PreparedStatement ps = null;
//--------------------Fumciones que cargan los combobox------------------------------------>
    public static void isCargarDocentes(){
        String sql = "SELECT NOM_DOCENT, APE_DOCENT FROM docentes";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
          //  registroClases.jcbDocentes.addItem("Seleccione");
            while(rs.next()){
                registroClases.jcbDocentes.addItem(rs.getString(1)+" "+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("error:45 " + ex.getMessage());
        }
    }
    public static void isCargarDocentesUp(){
        String sql = "SELECT NOM_DOCENT, APE_DOCENT FROM docentes";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
          //  registroClases.jcbDocentes.addItem("Seleccione");
            while(rs.next()){
                updateClase.jcbDocentesUp.addItem(rs.getString("NOM_DOCENT")+" "+rs.getString("APE_DOCENT"));
            }
        } catch (SQLException ex) {
            System.out.println("error: 65" + ex.getMessage());
        }
    }
    public static void isCargarGabinete(){
        String sql = "SELECT * FROM gabinetes", si="", uso="", cod="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
                               //  ResultSet rs1 = st.executeQuery(SQLGAB);
            while(rs.next()){
                si=rs.getString("gabinetes.HABILITADO");
                uso=rs.getString("gabinetes.ENUSO");
                cod=rs.getString("gabinetes.CODIGO");
                if(si.equals("SI") && uso.equals("NO")){
                    registroClases.jcbGabinetes.addItem(rs.getString("gabinetes.CODIGO"));   
                } 
            }
        } catch (SQLException ex) {
            System.out.println("error:23 " + ex.getMessage());
        }
    }
    public static boolean isUpdate(SentenciasGabinete s) {
        String sql = SentenciasGabinete.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getCODIGO());
            ps.setString(2, s.getHABILITADO());
            ps.setString(3, s.getENUSO());
            ps.setString(4, s.getID_GABINETE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            System.out.println("error158785"+ex.getMessage());
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void isCargarGabineteUp(){
        String sql = "SELECT * FROM gabinetes", si="", uso="", cod="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                si=rs.getString("gabinetes.HABILITADO");
                uso=rs.getString("gabinetes.ENUSO");
                cod=rs.getString("gabinetes.CODIGO");
                if(si.equals("SI") && uso.equals("NO")){
                    updateClase.jcbGabinetesUp.addItem(rs.getString("gabinetes.CODIGO"));   
                }
            }
        } catch (SQLException ex) {
            System.out.println("error:78 " + ex.getMessage());
        }
    }
    public static void isCargarHorario(){
        String sql = "SELECT HORA_INICIO, HORA_TERMINO FROM horarios";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registroClases.jcbHorario.addItem(rs.getString(1)+" a "+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void isCargarHorarioUp(){
        String sql = "SELECT HORA_INICIO, HORA_TERMINO FROM horarios";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                updateClase.jcbHorarioUp.addItem(rs.getString(1)+" a "+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void cargarModuloId(String modulo){
        String sql = SentenciasAca.LISTAR_CURSO;
        String nom="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                nom=rs.getString("modulos.MODULO");
                if(nom.equals(modulo)){
                    registroClases.idMODULO.setText(rs.getString("ID_MODULO"));
                    registroClases.idCURSO.setText(rs.getString("modulos.ID_CURSO"));
                    registroClases.IDCURSO=rs.getInt("modulos.ID_CURSO");
                }  
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void isCargarAlumnos(){
        String sql = "SELECT alumnos.NOM_ALUM, alumnos.APE_ALUM, inscripciones.FK_ALUMNO FROM inscripciones, alumnos, cursos "
                + "WHERE alumnos.ID_ALUMNO = inscripciones.FK_ALUMNO AND inscripciones.FK_CURSO = cursos.ID_CURSO";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                registroClases.jcbAlumnos.addItem(rs.getString(1)+" "+rs.getString(2));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void isCargarAlumnosUp(){
        String sql = "SELECT alumnos.NOM_ALUM, alumnos.APE_ALUM, inscripciones.FK_ALUMNO FROM inscripciones, alumnos, cursos "
                + "WHERE alumnos.ID_ALUMNO = inscripciones.FK_ALUMNO AND inscripciones.FK_CURSO = cursos.ID_CURSO";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                updateClase.jcbAlumnosUp.addItem(rs.getString(1)+" "+rs.getString(2));
                //registroClases.idAlumn.setText(rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void isFiltrarCursoYModulos(){        
        Integer idCurDoc = registroClases.IDCURSO, curso=0;
         String sql = "SELECT * FROM inscripciones, alumnos, cursos "
                + "WHERE alumnos.ID_ALUMNO = inscripciones.FK_ALUMNO AND "
                + "inscripciones.FK_CURSO = cursos.ID_CURSO";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroClases.jcbAlumnos.removeAllItems();
            registroClases.jcbAlumnos.addItem("Seleccione");
            while(rs.next()){
                curso=rs.getInt("inscripciones.FK_CURSO");
                if(idCurDoc==curso){ 
                  registroClases.jcbAlumnos.addItem(rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM"));  
                }    
            }
        } catch (SQLException ex) {
            System.out.println("errorfiltroCurso: " + ex.getMessage());
        }
        String sql2=  SentenciasDocentes.LISTAR_CURSO_DOCENTE;
        try {
            Statement st2 = conexion.createStatement();
            ResultSet rs2 = st2.executeQuery(sql2);
            registroClases.jcbDocentes.removeAllItems();
            registroClases.jcbDocentes.addItem("Seleccione");
            while(rs2.next()){  
                if(idCurDoc==rs2.getInt("li.ID_CURSO")){
                    registroClases.jcbDocentes.addItem(rs2.getString("docentes.NOM_DOCENT")+" "+rs2.getString("docentes.APE_DOCENT"));
                }
            }
        } catch (Exception e) {
             System.out.println("error151515: " + e.getMessage());
        }
    }
    public static void isAlumnos(){
        String nom="", ape="",nombre="";
        String sql = "SELECT * FROM inscripciones, alumnos, cursos "
                + "WHERE alumnos.ID_ALUMNO = inscripciones.FK_ALUMNO AND "
                + "inscripciones.FK_CURSO = cursos.ID_CURSO";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //registroClases.jcbAlumnos.addItem("Seleccione");
            while(rs.next()){
                nom=rs.getString("alumnos.NOM_ALUM");
                ape=rs.getString("alumnos.APE_ALUM");
                nombre=nom+" "+ape;
                if(registroClases.jcbAlumnos.getSelectedIndex()>0){
                    if(nombre.equals(registroClases.jcbAlumnos.getSelectedItem().toString())){
                        registroClases.idAlumn.setText(rs.getString("inscripciones.FK_ALUMNO"));  
                    } 
                }  
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static void isAlumnosUp(){
        String nom="", ape="",nombre="";
        String sql = "SELECT * FROM inscripciones, alumnos, cursos "
                + "WHERE alumnos.ID_ALUMNO = inscripciones.FK_ALUMNO AND "
                + "inscripciones.FK_CURSO = cursos.ID_CURSO";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                nom=rs.getString("alumnos.NOM_ALUM");
                ape=rs.getString("alumnos.APE_ALUM");
                nombre=nom+" "+ape;
                if(nombre.equals(updateClase.jcbAlumnosUp.getSelectedItem().toString())){
                  updateClase.idAlumnUp.setText(rs.getString("inscripciones.FK_ALUMNO"));  
                }
            }
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
        String sqlMod ="";
    }
    public static void isDocente() {
        String nom="", ape="",nombre="";
        String sql = SentenciasDocentes.LISTAR;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            //registroClases.jcbDocentes.addItem("Seleccione");
            while(rs.next()){
                nom=rs.getString("d.NOM_DOCENT");
                ape=rs.getString("d.APE_DOCENT");
                nombre=nom+" "+ape;
                 if(registroClases.jcbDocentes.getSelectedIndex()>0){
                     if(nombre.equals(registroClases.jcbDocentes.getSelectedItem().toString())){
                         registroClases.idDocente.setText(rs.getString("d.ID_DOCENTE"));
                     }
                }   
            }
        } catch (SQLException ex) {
            System.out.println("error1515185: " + ex.getMessage());
        }
    }
    public static void isGabinete(){
        String sql = "SELECT * FROM gabinetes", cod="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                cod=rs.getString("CODIGO");
                if(cod.equals(registroClases.jcbGabinetes.getSelectedItem().toString())){
                    registroClases.idGabinete.setText(rs.getString("ID_GABINETE"));   
                } 
            }
        } catch (SQLException ex) {
            System.out.println("error:23 " + ex.getMessage());
        }
    }
//--------------------Fin de Funciones ComboBox------------------------------------>
    public static String extraerIDMax(){
         String sql = "SELECT MAX(ID_CLASE) FROM clases";
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
    public static void isCargarTablaTodo(){
         DefaultTableModel model = (DefaultTableModel)Clases.tablaClase.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         Integer c=0, id=0;
         String sql = SentenciasClases.LISTAR;
         String datos[] =new String[5];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                    datos[0] = rs.getString("ID_CLASE");              
                    datos[1] = rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM");
                    datos[2] = rs.getString("modulos.MODULO");             
                    datos[3] = rs.getString("TEMA");
                    datos[4] = rs.getString("ACTIVIDAD");
                    model.addRow(datos);   
            }
            Clases.tablaClase.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error:1 "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void isCargarTablaFiltro(){
         DefaultTableModel model = (DefaultTableModel)Clases.tablaClase.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String fechaActual="";
         fechaActual = nuevoPrincipal.lblFechaAc.getText();
         String sql = "SELECT * FROM clases c, alumnos, gabinetes, horarios, modulos, docentes "
            + "WHERE c.ID_DOCENTE = docentes.ID_DOCENTE AND "
            + "c.ID_ALUMNO = alumnos.ID_ALUMNO AND "
            + "c.ID_GABINETE = gabinetes.ID_GABINETE AND "
            + "c.ID_HORARIO = horarios.ID_HORARIO AND "
            + "c.ID_MODULO = modulos.ID_MODULO";
         String datos[] =new String[5];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(fechaActual.equals(rs.getString("FECHA_CLASE"))){
                    datos[0] = rs.getString("ID_CLASE");              
                    datos[1] = rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM");
                    datos[2] = rs.getString("modulos.MODULO");             
                    datos[3] = rs.getString("TEMA");
                    datos[4] = rs.getString("ACTIVIDAD");
                    model.addRow(datos);
                }
            }
            Clases.tablaClase.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error:1 "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void isBuscarDatos(String buscar, String filtro){
         DefaultTableModel model = (DefaultTableModel)Clases.tablaClase.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String id="";
         String sql = "";
         if(filtro.equals("Alumno")){
              sql = SentenciasClases.LISTAR + " AND alumnos.NOM_ALUM LIKE '"+buscar+"%'";
         }else if(filtro.equals("Modulo")){
              sql = SentenciasClases.LISTAR + " AND modulos.MODULO LIKE '"+buscar+"%'";
         }
          String datos[] =new String[5];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                datos[0] = rs.getString("ID_CLASE");              
                datos[1] = rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM");
                datos[2] = rs.getString("modulos.MODULO");             
                datos[3] = rs.getString("TEMA");
                datos[4] = rs.getString("ACTIVIDAD");
                    model.addRow(datos); 
            }
            Clases.tablaClase.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static Integer idDOCENTES=0;
    public static void filtroDocente(Integer idDOCT) {
       Integer idDoc=0;
       DefaultTableModel model = (DefaultTableModel)Clases.tablaClase.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = SentenciasClases.LISTAR;
         String datos[] =new String[5];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                idDoc=rs.getInt("c.ID_DOCENTE");
                if(idDOCT == idDoc){
                    idDOCENTES=idDOCT;
                    datos[0] = rs.getString("ID_CLASE");              
                    datos[1] = rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM");
                    datos[2] = rs.getString("modulos.MODULO");             
                    datos[3] = rs.getString("TEMA");
                    datos[4] = rs.getString("ACTIVIDAD");
                    model.addRow(datos);
                }
            }
            Clases.tablaClase.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error:1 "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static boolean isUpdate(SentenciasClases s) {
        String sql = SentenciasClases.ACTUALIZAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setInt(1, s.getID_DOCENTE());
            ps.setInt(2, s.getID_ALUMNO());
            ps.setInt(3, s.getID_GABINETE());
            ps.setInt(4, s.getID_HORARIO());
            ps.setInt(5, s.getID_MODULO());
            ps.setString(6, s.getTEMA());
            ps.setString(7, s.getACTIVIDAD());
            ps.setString(8, s.getID_CLASE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  //Funcion que borra de la base de datos al usuario selecionado
    public static boolean isDelete(SentenciasClases s) {
        String sql = SentenciasClases.ELIMINAR;
        try {
            ps = conexion.prepareStatement(sql);
            ps.setString(1, s.getID_CLASE());
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            return false;
        //Logger.getLogger(FuncionesUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void mostrarDetalleClase(String nom) {
        DefaultTableModel model = (DefaultTableModel)detalleClase.tablaDetalleClase.getModel();
        String name="",ape="",nombre="";
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = SentenciasClases.LISTAR;
         String datos[] =new String[3];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                name = rs.getString("alumnos.NOM_ALUM");
                ape = rs.getString("alumnos.APE_ALUM");
                nombre=name+" "+ape;
               if(nom.equals(nombre)){
                    datos[0] = rs.getString("gabinetes.CODIGO");              
                    datos[1] = rs.getString("horarios.HORA_INICIO")+" "+rs.getString("horarios.HORA_TERMINO");
                    datos[2] = rs.getString("c.FECHA_CLASE");             
                    model.addRow(datos);
                }
            }
            detalleClase.tablaDetalleClase.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error:1 "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void isListarCurso(){
         DefaultTableModel model = (DefaultTableModel)listModulos.listCursosFiltro.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql  = "SELECT *  FROM cursos";
         String datos[] =new String[1];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){           
                datos[0] = rs.getString("NOM_CURSO");
                model.addRow(datos);
            }
            listModulos.listCursosFiltro.setModel(model);
        } catch (SQLException ex) {System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void isListarModulo(String buscar){
         DefaultTableModel model = (DefaultTableModel)listModulos.listsModulosFiltro.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
             sql = SentenciasAca.LISTAR_CURSO;
         } else {
             sql = "SELECT *  FROM cursos c, modulos WHERE c.ID_CURSO = modulos.ID_CURSO AND "
                     + "c.NOM_CURSO LIKE '"+buscar+"%'";
         }
         String datos[] =new String[1];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){           
                datos[0] = rs.getString("MODULO");
                model.addRow(datos);
            }
            listModulos.listsModulosFiltro.setModel(model);
        } catch (SQLException ex) {System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static String idCurso="";
    public static void cargarCursosdeDocentes(Integer iddoc){
        String sql = "";
        sql = SentenciasDocentes.LISTAR_CURSO_DOCENTE;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            filtroDocentesModulo.jcbFiltroModulo.removeAllItems();
            filtroDocentesModulo.jcbFiltroModulo.addItem("Selecione Modulo");
            while(rs.next()){           
               if(iddoc==rs.getInt("li.ID_DOCENTE")){
                   filtroDocentesModulo.lblTituloDocente.setText(rs.getString("docentes.NOM_DOCENT")+" "+rs.getString("docentes.APE_DOCENT"));
                   filtroDocentesModulo.jcbFiltroModulo.addItem(rs.getString("cursos.NOM_CURSO"));
               }
            }
        } catch (SQLException ex) {
            System.err.println("error: "+ex.getMessage());
        }
     }
    public static void listarModuloDeDocentesSelec(String nom_curso){
         DefaultTableModel model = (DefaultTableModel)filtroDocentesModulo.tablaModulodeDocente.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = SentenciasAca.LISTAR_CURSO, idcurso="";
         String datos[] =new String[1];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){  
                if(nom_curso.equals(rs.getString("c.NOM_CURSO"))){
                    idCurso=rs.getString("c.ID_CURSO");
                    System.out.println("SI funciono el metodo");
                    if(idCurso.equals(rs.getString("modulos.ID_CURSO"))){
                        datos[0] = rs.getString("modulos.MODULO");
                        model.addRow(datos);
                    }
                }
            }
            System.out.println("");
            filtroDocentesModulo.tablaModulodeDocente.setModel(model);
        } catch (SQLException ex) {System.err.println("error: "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void filtrarModulo(String modulo) {
       String sql2 = SentenciasAca.LISTAR_CURSO, idModulo="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql2);
            while(rs.next()){           
                if(modulo.equals(rs.getString("modulos.MODULO"))){
                    idModulo=rs.getString("modulos.ID_MODULO");
                }
            }
        } catch (SQLException ex) {
            System.err.println("error15454: "+ex.getMessage());
        }
       DefaultTableModel model = (DefaultTableModel)Clases.tablaClase.getModel();
       while(model.getRowCount() > 0){
            model.removeRow(0);
       }
       String sql = SentenciasClases.LISTAR;
       String datos[] =new String[5];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                if(idModulo.equals(rs.getString("c.ID_MODULO"))){
                    datos[0] = rs.getString("ID_CLASE");              
                    datos[1] = rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM");
                    datos[2] = rs.getString("modulos.MODULO");             
                    datos[3] = rs.getString("TEMA");
                    datos[4] = rs.getString("ACTIVIDAD");
                    model.addRow(datos);
                }
            }
            Clases.tablaClase.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error:1 "+ex.getMessage());
            Logger.getLogger(FuncionesClases.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
