package informacion;

import java.sql.Timestamp;

public class SentenciasAca {
    public static String LISTAR = "SELECT * FROM cursos";
    public static String LISTAR_CURSO = "SELECT * FROM cursos c, modulos WHERE c.ID_CURSO = modulos.ID_CURSO";
    public static String LISTAR_INS = "SELECT * FROM inscripciones, alumnos, cursos "
            + "WHERE inscripciones.FK_CURSO = cursos.ID_CURSO AND inscripciones.FK_ALUMNO = alumnos.ID_ALUMNO";
    public static String REGISTRAR= "INSERT INTO cursos("
            + "ID_CURSO, " 
            + "NOM_CURSO, " 
            + "DURACION, "
            + "CUOTA, "
            + "PRECIO_CUOTA, "
            + "PRECIO_TOT, " 
            + "CUR_IVA10, " 
            + "CUR_IVA5, " 
            + "CUR_IVA0) " 
            + "VALUES(?,?,?,?,?,?,?,?,?)";
    public static String ACTUALIZAR = "UPDATE cursos SET NOM_CURSO = ?, DURACION = ?, CUOTA = ?, PRECIO_CUOTA= ?, PRECIO_TOT = ? "
            + "WHERE ID_CURSO = ?";
    public static String ELIMINAR = "DELETE FROM cursos WHERE ID_CURSO = ?";
    public static String ELIMINAR_INS= "DELETE FROM inscripciones WHERE ID_INSCRIPCION = ?";
    private String ID_CURSO;    
    private String NOM_CURSO;   
    private  Integer  DURACION;           
    private Integer CUOTA;        
    private Double PRECIO_CUOTA;     
    private Integer PRECIO_TOT; 
    private String ID_INSCRIPCION;
    private Integer ID_ALUMNO;
    private Integer ID_CURSO1;
    private String fecha_inscripcion;
    private Double CUR_IVA10;
    private Double CUR_IVA5;
    private Double CUR_IVA0;

    public Double getCUR_IVA10() {
        return CUR_IVA10;
    }

    public void setCUR_IVA10(Double CUR_IVA10) {
        this.CUR_IVA10 = CUR_IVA10;
    }

    public Double getCUR_IVA5() {
        return CUR_IVA5;
    }

    public void setCUR_IVA5(Double CUR_IVA5) {
        this.CUR_IVA5 = CUR_IVA5;
    }

    public Double getCUR_IVA0() {
        return CUR_IVA0;
    }

    public void setCUR_IVA0(Double CUR_IVA0) {
        this.CUR_IVA0 = CUR_IVA0;
    }

    public String getID_INSCRIPCION() {
        return ID_INSCRIPCION;
    }

    public void setID_INSCRIPCION(String ID_INSCRIPCION) {
        this.ID_INSCRIPCION = ID_INSCRIPCION;
    }

    public Integer getID_ALUMNO() {
        return ID_ALUMNO;
    }

    public void setID_ALUMNO(Integer ID_ALUMNO) {
        this.ID_ALUMNO = ID_ALUMNO;
    }

    public Integer getID_CURSO1() {
        return ID_CURSO1;
    }

    public void setID_CURSO1(Integer ID_CURSO1) {
        this.ID_CURSO1 = ID_CURSO1;
    }

    public String getFecha_inscripcion() {
        return fecha_inscripcion;
    }

    public void setFecha_inscripcion(String fecha_inscripcion) {
        this.fecha_inscripcion = fecha_inscripcion;
    }
    

    public String getNOM_CURSO() {
        return NOM_CURSO;
    }

    public void setNOM_CURSO(String NOM_CURSO) {
        this.NOM_CURSO = NOM_CURSO;
    }
    
    public String getID_CURSO() {
        return ID_CURSO;
    }

    public void setID_CURSO(String ID_CURSO) {
        this.ID_CURSO = ID_CURSO;
    }

    public Integer getDURACION() {
        return DURACION;
    }

    public void setDURACION(Integer DURACION) {
        this.DURACION = DURACION;
    }
    public Integer getCUOTA() {
        return CUOTA;
    }

    public void setCUOTA(Integer CUOTA) {
        this.CUOTA = CUOTA;
    }

    public Double getPRECIO_CUOTA() {
        return PRECIO_CUOTA;
    }

    public void setPRECIO_CUOTA(Double PRECIO_CUOTA) {
        this.PRECIO_CUOTA = PRECIO_CUOTA;
    }

    public Integer getPRECIO_TOT() {
        return PRECIO_TOT;
    }

    public void setPRECIO_TOT(Integer PRECIO_TOT) {
        this.PRECIO_TOT = PRECIO_TOT;
    }
    
    
}
