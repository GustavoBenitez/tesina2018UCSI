/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horarios;

/**
 *
 * @author Gustavo
 */
public class SentenciasHorarios {
     public static String LISTAR = "SELECT * FROM horarios";
    public static String REGISTRAR= "INSERT INTO horarios(" 
             + "HORA_INICIO, "
             + "HORA_TERMINO) " 
             + "VALUES(?,?)";
    public static String ACTUALIZAR = "UPDATE horarios SET " 
            + "HORA_INICIO = ?, "
            + "HORA_TERMINO = ? " 
            + "WHERE ID_HORARIO = ?";
    public static String ELIMINAR = "DELETE FROM horarios WHERE ID_HORARIO = ?";
    private String ID_HORARIO;
    private String HORA_INICIO;
    private String HORA_TERMINO;

    public String getID_HORARIO() {
        return ID_HORARIO;
    }

    public void setID_HORARIO(String ID_HORARIO) {
        this.ID_HORARIO = ID_HORARIO;
    }
    
    public String getHORA_INICIO() {
        return HORA_INICIO;
    }

    public void setHORA_INICIO(String HORA_INICIO) {
        this.HORA_INICIO = HORA_INICIO;
    }

    public String getHORA_TERMINO() {
        return HORA_TERMINO;
    }

    public void setHORA_TERMINO(String HORA_TERMINO) {
        this.HORA_TERMINO = HORA_TERMINO;
    }

}
