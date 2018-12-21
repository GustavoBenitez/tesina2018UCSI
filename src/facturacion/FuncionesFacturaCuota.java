package facturacion;

import conexion.Conexion;
import static facturacion.agregarCuotasAlumnos.tablaCuotasAlumnos;
import static facturacion.registroFacturaCuota.tablaFacCuotaDetalle;
import informacion.FuncionesAca;
import informacion.SentenciasAca;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import librerias.GenerarNumero;
import rojerusan.RSNotifyAnimated;
import rojerusan.RSNotifyShadowAnimated;

/**
 *
 * @author Gustavo
 */
public class FuncionesFacturaCuota {
    private static conexion.Conexion con = new Conexion();
    private static java.sql.Connection conexion = con.getConnection();
    PreparedStatement ps;
    public static String extraerIDMaxFacCuota(){
         String sql = "SELECT MAX(ID_CABECERA) FROM factura_cabecera";
         int IDFUN =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDFUN = rs.getInt(1);
            }
            if(IDFUN == 0){
                IDFUN = 1;
            }else{
                IDFUN++;
            }
            return String.valueOf(IDFUN);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static String extraerIDMaxDetalleCuota(){
         String sql = "SELECT MAX(ID_DETALLE_CABECERA) FROM detalle_cabecera";
         int IDFUN =0;
          try {  
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
               IDFUN = rs.getInt(1);
            }
            if(IDFUN == 0){
                IDFUN = 1;
            }else{
                IDFUN++;
            }
            return String.valueOf(IDFUN);
        } catch (SQLException ex) {
            return null;
        //    Logger.getLogger(Funciones.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void numeros() {
        int j;
        String c="";
         String sql="SELECT MAX(ID_CABECERA) FROM FACTURA_CABECERA";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){              
                 c=rs.getString(1);
            }
            if(c==null){
                registroFacturaCuota.txtCodigoFacCuo.setText("0001");
            } else {
                 j=Integer.parseInt(c);
                 librerias.GenerarNumero gen= new GenerarNumero();
                 gen.generar(j);
                 registroFacturaCuota.txtCodigoFacCuo.setText(gen.serie());            
            }

        } catch (SQLException ex) {
            System.err.println("error:"+ex.getMessage());
           Logger.getLogger(registroFacturaOc.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static String idInscrip="";
    public static void isCargarCurso(){
        String sql = SentenciasAca.LISTAR_INS;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            registroFacturaCuota.jcbCursoFac.removeAllItems();
             registroFacturaCuota.jcbCursoFac.addItem("Seleccione:");
            while(rs.next()){
                if(detalleInscrip.idIns.equals(rs.getString("inscripciones.FK_ALUMNO"))){
                    registroFacturaCuota.jcbCursoFac.addItem(rs.getString("cursos.NOM_CURSO"));
                    idInscrip=rs.getString("inscripciones.ID_INSCRIPCION");
                }  
            }
            System.out.println("****************************El id de Inscripcion es: "+idInscrip);
        } catch (SQLException ex) {
            System.out.println("error cargar curso: " + ex.getMessage());
        }
    }
    public static void isCargarCursoId(){
        String sql = SentenciasAca.LISTAR, nom="";
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                nom=rs.getString("NOM_CURSO");
                if(nom.equals(registroFacturaCuota.jcbCursoFac.getSelectedItem().toString())){
                    registroFacturaCuota.idCursoCuo.setText(rs.getString("ID_CURSO"));
                }  
            }
            System.out.println("****************************El id de Inscripcion es: "+idInscrip);
        } catch (SQLException ex) {
            System.out.println("error cargar id curso: " + ex.getMessage());
        }
    }
    public static void isListarIns(String buscar){
         DefaultTableModel model = (DefaultTableModel)detalleInscrip.tablaDetalleInsAlumno.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "";
         if (buscar.equals("")){
            sql = "SELECT * FROM inscripciones, alumnos, cursos "
            + "WHERE inscripciones.FK_CURSO = cursos.ID_CURSO AND inscripciones.FK_ALUMNO = alumnos.ID_ALUMNO "
            + "ORDER BY inscripciones.FK_ALUMNO DESC";
         } else {
            sql = "SELECT *  FROM inscripciones, alumnos, cursos "
            + "WHERE inscripciones.FK_CURSO = cursos.ID_CURSO AND inscripciones.FK_ALUMNO = alumnos.ID_ALUMNO AND "
            + "fecha_inscripcion LIKE '"+buscar+"%' OR "
            + "cursos.NOM_CURSO LIKE '"+buscar+"%' OR "
            + "alumnos.NOM_ALUM LIKE '"+buscar+"%'";
         }
         String datos[] =new String[4];
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){   
                
                datos[0] = rs.getString("inscripciones.FK_ALUMNO");              
                datos[1] = rs.getString("alumnos.NOM_ALUM")+" "+rs.getString("alumnos.APE_ALUM");
                datos[2] = rs.getString("cursos.NOM_CURSO");
                datos[3] = rs.getString("fecha_inscripcion");
                model.addRow(datos);
            }
           detalleInscrip.tablaDetalleInsAlumno.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error en listar inscripcion "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static void isListarCuotaIns(){
         DefaultTableModel model = (DefaultTableModel)agregarCuotasAlumnos.tablaCuotasAlumnos.getModel();
         while(model.getRowCount() > 0){
             model.removeRow(0);
         }
         String sql = "SELECT * FROM inscripciones, alumnos, cursos "
            + "WHERE inscripciones.FK_CURSO = cursos.ID_CURSO AND inscripciones.FK_ALUMNO = alumnos.ID_ALUMNO "
            + "ORDER BY inscripciones.FK_ALUMNO DESC", idCuo="";
         String datos[] =new String[2];
         Integer cant=0, tot=0, resto=0;
        try {
            Statement st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){   
                if(detalleInscrip.idIns.equals(rs.getString("inscripciones.FK_ALUMNO"))){
                    tot=rs.getInt("cursos.CUOTA");
                    cant=rs.getInt("inscripciones.CANT_CUOTA");
                    resto=tot-cant;
                    if(cant==0){
                       new rojerusan.RSNotifyAnimated("YA!", "El Alumno Culmino sus Pagos", 5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp, RSNotifyAnimated.TypeNotify.INFORMATION).setVisible(true);
                    }else{
                        if(resto==0){
                            for (int i = 1; i <= cant; i++) {
                                idCuo= String.valueOf(i);
                                datos[0] = idCuo;              
                                datos[1] = rs.getString("inscripciones.PRECIO_CUO");
                                model.addRow(datos);
                            }
                        }else{
                            for (int i = resto+1; i <= tot; i++) {
                                idCuo= String.valueOf(i);
                                datos[0] = idCuo;              
                                datos[1] = rs.getString("inscripciones.PRECIO_CUO");
                                model.addRow(datos);
                            }  
                        }
                    }  
                }
            }
           agregarCuotasAlumnos.tablaCuotasAlumnos.setModel(model);
        } catch (SQLException ex) {
            System.err.println("error en listar cuotas de inscripcion "+ex.getMessage());
            Logger.getLogger(FuncionesAca.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
    public static String queIva="";
    public static void cargarIvaCurso(){
       DefaultTableModel model = (DefaultTableModel) registroFacturaCuota.tablaFacCuotaDetalle.getModel();
       String datos[] = new String[3];
       String sql = SentenciasAca.LISTAR_INS,idcur="",iva10="",iva5="",iva0="";
       int fila= tablaCuotasAlumnos.getSelectedRow();
        try {
            if(fila==-1){
                new rojerusan.RSNotifyShadowAnimated("Oops!", "Falta Seleccionar el Curso", 5, RSNotifyShadowAnimated.PositionNotify.BottomRight, RSNotifyShadowAnimated.AnimationNotify.BottomUp, RSNotifyShadowAnimated.TypeNotify.WARNING).setVisible(true);
            }else {
                Statement st = conexion.createStatement();
                ResultSet rs = st.executeQuery(sql);
                datos[0]= tablaCuotasAlumnos.getValueAt(fila, 0).toString();
                datos[1]= tablaCuotasAlumnos.getValueAt(fila, 1).toString();
                idcur=registroFacturaCuota.idCursoCuo.getText();
                while(rs.next()){
                    if(detalleInscrip.idIns.equals(rs.getString("inscripciones.FK_ALUMNO"))){
                        if(idcur.equals(rs.getString("inscripciones.FK_CURSO"))){
                          iva10=rs.getString("cursos.CUR_IVA10");
                          iva5=rs.getString("cursos.CUR_IVA5");
                          iva0=rs.getString("cursos.CUR_IVA0");
                          if(!iva10.equals("0")){
                              datos[2]=iva10;
                              queIva="10%";
                              break;
                          }else if(!iva5.equals("0")){
                              datos[2]=iva5;
                              queIva="5%";
                              break;
                          }else{
                              datos[2]=iva0;
                              queIva="0%";
                          }
                        }   
                    }  
                }
                model.setColumnIdentifiers(new String[]{"Cuotas", "Precio", "Iva"+queIva});
                model.addRow(datos);
                tablaFacCuotaDetalle.setModel(model);
            }  
            System.out.println("****VIVE: "+idInscrip);
        } catch (SQLException ex) {
            System.out.println("error: " + ex.getMessage());
        }
    }
    public static Integer total=0, totIva=0,sumaPre=0;
    public static void calcularTodo(){ 
        int fila = tablaFacCuotaDetalle.getRowCount();
        if(fila>0){
            for (int i = 0; i < tablaFacCuotaDetalle.getRowCount(); i++) {
                sumaPre += Integer.parseInt(tablaFacCuotaDetalle.getValueAt(i, 1).toString());
                totIva += Integer.parseInt(tablaFacCuotaDetalle.getValueAt(i, 2).toString());
            }
            total=sumaPre+totIva;
            if(queIva.equals("10%")){
                registroFacturaCuota.txtIva10.setText(String.valueOf(totIva));
                registroFacturaCuota.txtIva5.setText(String.valueOf(0));
                registroFacturaCuota.txtExenta.setText(String.valueOf(0));
            }else if(queIva.equals("5%")){
                registroFacturaCuota.txtIva10.setText(String.valueOf(0));
                registroFacturaCuota.txtIva5.setText(String.valueOf(totIva));
                registroFacturaCuota.txtExenta.setText(String.valueOf(0));
            }else{
                registroFacturaCuota.txtIva10.setText(String.valueOf(0));
                registroFacturaCuota.txtIva5.setText(String.valueOf(0));
                registroFacturaCuota.txtExenta.setText(String.valueOf(0));
            }
            registroFacturaCuota.txtTot.setText(String.valueOf(total));
        }
        total=0;
        totIva=0;
        sumaPre=0;
    }
    public static void LimpiarTodo(){
        DefaultTableModel tb = (DefaultTableModel)registroFacturaCuota.tablaFacCuotaDetalle.getModel();
        tb.setRowCount(0);
        registroFacturaCuota.txtAlumnoFac.setText("");
        registroFacturaCuota.txtExenta.setText("");
        registroFacturaCuota.txtTot.setText("");
        registroFacturaCuota.txtIva5.setText("");
        registroFacturaCuota.txtIva10.setText("");
        registroFacturaCuota.jcbTipoFac.setSelectedItem("Seleccione:");
        registroFacturaCuota.jcbCursoFac.removeAllItems();
        registroFacturaCuota.jcbCursoFac.addItem("Seleccione:");
        numeros();
     }
    public static void guadarFacturaCuota() {
        //Primero se guarda la cabecera
        int idcabecera=0, iva0=0;
            String sql = "INSERT INTO factura_cabecera(ID_CABECERA, ID_INSCRIPCION, ID_CURSO, ID_USUARIO, FECHA_FAC, NRO_FAC, TIPO_FAC, TOT_IVA5, TOT_IVA10, TOT_EXENTA, TOTAL_GRAL, SUBTOT) VALUES (?,?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps;
            try {
                ps = conexion.prepareStatement(sql);
                ps.setInt(1, Integer.parseInt(registroFacturaCuota.idFacCuo.getText()));
                ps.setInt(2, Integer.parseInt(idInscrip));
                ps.setInt(3, Integer.parseInt(registroFacturaCuota.idCursoCuo.getText()));
                ps.setInt(4, login.Login.idUsu);
                System.out.println("usuario id"+login.Login.idUsu);
                ps.setString(5, registroFacturaCuota.txtFechaFACtuaCuo.getTextoFecha());
                ps.setString(6, registroFacturaCuota.txtCodigoFacCuo.getText());
                ps.setString(7, registroFacturaCuota.jcbTipoFac.getSelectedItem().toString());
                ps.setInt(8, Integer.parseInt(registroFacturaCuota.txtIva5.getText()));
                ps.setInt(9, Integer.parseInt(registroFacturaCuota.txtIva10.getText()));
                ps.setInt(10, Integer.parseInt(registroFacturaCuota.txtExenta.getText()));
                ps.setInt(11, Integer.parseInt(registroFacturaCuota.txtTot.getText()));
                ps.setInt(12, sumaPre);
                int resultado = ps.executeUpdate();
                if (resultado > 0) {
                    //Se recupera el ultimo id guardado de cabecera
                    String sql2 = "SELECT MAX(ID_CABECERA) FROM factura_cabecera";
                    ps = conexion.prepareStatement(sql2);
                    ResultSet rs = ps.executeQuery();
                    rs.first();
                    //Una vez lista la consulta se procede a guardar detalle
                    idcabecera = rs.getInt(1);
                } 
            } catch (SQLException ex) {
                System.out.println("Error guardar factura cabecera de cuota: " + ex.getMessage());
            } 
        try {
              //Para lo cual se recorre la tabla con los productos
            for (int i = 0; i < registroFacturaCuota.tablaFacCuotaDetalle.getRowCount(); i++) {
                registroFacturaCuota.idDetalleCuota.setText(FuncionesFacturaCuota.extraerIDMaxDetalleCuota());
                String sql3 = "INSERT INTO  detalle_cabecera(ID_DETALLE_CABECERA, FK_INSCRIPCION, FK_CABECERA, NUMERO_CUOTA, PAGO, DET_IVA10, DET_IVA5, DET_IVA0) VALUES (?,?,?,?,?,?,?,?)";
                ps = conexion.prepareStatement(sql3);
                ps.setInt(1, Integer.parseInt(registroFacturaCuota.idDetalleCuota.getText()));
                ps.setInt(2, Integer.parseInt(idInscrip));
                ps.setInt(3, idcabecera);
                ps.setInt(4, Integer.parseInt(registroFacturaCuota.tablaFacCuotaDetalle.getValueAt(i, 0).toString()));
                System.out.println("numero cuota"+registroFacturaCuota.tablaFacCuotaDetalle.getValueAt(i, 0).toString());
                ps.setInt(5, Integer.parseInt(registroFacturaCuota.tablaFacCuotaDetalle.getValueAt(i, 1).toString())); 
                System.out.println("precio cuota"+registroFacturaCuota.tablaFacCuotaDetalle.getValueAt(i, 1).toString());
                if(queIva.equals("10%")){
                    ps.setInt(6, Integer.parseInt(registroFacturaCuota.tablaFacCuotaDetalle.getValueAt(i, 2).toString())); 
                    System.out.println("iva "+registroFacturaCuota.tablaFacCuotaDetalle.getValueAt(i, 2).toString());
                    System.out.println("iva"+iva0);
                    ps.setInt(7, iva0); 
                    ps.setInt(8, iva0); 
                }else if(queIva.equals("5%")){
                     System.out.println("iva "+registroFacturaCuota.tablaFacCuotaDetalle.getValueAt(i, 2).toString());
                    System.out.println("iva"+iva0);
                    ps.setInt(6, iva0); 
                    ps.setInt(7, Integer.parseInt(registroFacturaCuota.tablaFacCuotaDetalle.getValueAt(i, 2).toString())); 
                    ps.setInt(8, iva0); 
                }else{
                     System.out.println("iva "+registroFacturaCuota.tablaFacCuotaDetalle.getValueAt(i, 2).toString());
                    System.out.println("iva"+iva0);
                    ps.setInt(6, iva0);  
                    ps.setInt(7, iva0); 
                    ps.setInt(8, iva0); 
                }
                System.out.println("Id INscripcio"+idInscrip);
                 System.out.println("Id cabecera"+idcabecera);
                  
                ps.executeUpdate();
            }
            new rojerusan.RSNotifyShadowAnimated("¡Hecho!", "Se ha Guardado Correctamente", 5, RSNotifyShadowAnimated.PositionNotify.BottomRight, RSNotifyShadowAnimated.AnimationNotify.BottomUp, RSNotifyShadowAnimated.TypeNotify.SUCCESS).setVisible(true);
        } catch (Exception e) {
            System.err.println("ERROR DETALLE cuota:"+e.getMessage());
        }
    }
}
