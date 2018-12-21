package librerias;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class ClaseValidaciones {
     
   public static boolean email(String cadena){
        //Sentencia para validar email.
        String sentencia="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{3,})$";
        Pattern pattern = Pattern.compile(sentencia);
        Matcher matcher = pattern.matcher(cadena);
       return matcher.matches();
    }
    public static boolean ParaDireccion(char caracter){
        if(Character.toString(caracter).matches("[^0-9a-zA-Z áéíóúÁÉÍÓÚñÑ]")) {
           return true;
        }
        return false;
    }
    public static boolean cod(char caracter){
        if(Character.toString(caracter).matches("[^0-9a-zA-Z áéíóúÁÉÍÓÚñÑ]")) 
        if ((caracter != '-' && caracter != '/'))
        {
            return true;
        } else {
        }
        return false;
    }
    public static boolean USU(char caracter){
        if(Character.toString(caracter).matches("[^0-9a-zA-Z. @]")) {
            return true;
        } else {
        }
        return false;
    }
     public static boolean Cedula(char caracter){
        if(Character.toString(caracter).matches("[^0-9 -]")) 
        if ((caracter != '.'))
        {
            return true;
        } else {
        }
        return false;
    }
    
    //Metodo que se encarga de validar las letras, y recibe como parametro el evento capturado al presionar un tecla cualquiera
    public static boolean Letras(char carcater){
        if(Character.toString(carcater).matches("[^a-zA-Z áéíóúÁÉÍÓÚ ñÑ]")){
            return true;
        }
            return false;
    }
//permite la introduccion solo de numeros
    
    public static boolean Numeros(char caracter){
            if (Character.toString(caracter).matches("[^0-9 +]")){
                return true;
            }
            return false;
    }//termina validacion numero
    
    public static boolean Espacio(char caracter){
        if(caracter != ' '){
            return true;
        }
        return false;
    }

    //Metodo que se encarga de validar los simbolosos, y recibe como parametro el evento capturado al presionar un tecla cualquiera
    public void validar_simbolos(KeyEvent evento){
        char car = evento.getKeyChar();//captura la tecla presionada, y le asigna a una variable de tipo caracter
        //Si el caracter presionado es algunos de los sigtes sinbolos
        //'º' '!' '"' '·' '$' '%' '&' '/' '(' ')' '=' '?' '¿' '^' '*' '¨' ';' ',' '.' ':' '-' '_' '*' incluhar car = evento.getKeyChar();//captura la tecla presionada, y le asigna a una variable de tipo caracter
        //Si el carso la tecla de espacio y la tecla ENTER
        if((car=='º')||(car=='!')||(car=='"')||(car=='·')||(car=='$')||(car=='%')||(car=='&')||(car=='/')||(car=='(')||(car==')')||(car=='=')||(car=='?')||(car=='¿')||(car=='^')||(car=='*')||(car=='¨')||(car==';')||(car==',')||(car=='.')||(car==':')||(car=='-')||(car=='_')||(car=='*')||(car==(char)KeyEvent.VK_SPACE)||(car==(char)KeyEvent.VK_ENTER)){
            if(car==(char)KeyEvent.VK_SPACE){//Si el caracter presionado es igual a la tecla de espacio
                //muestra mensaje en pantalla 
                JOptionPane.showMessageDialog(null, "Presionaste la tecla de espacio");
            }else{//si no es la tecla de espacio
                if(car==(char)KeyEvent.VK_ENTER){//si la tecla presionada es la tecla ENTER
                    //Muestra mensaje en pantalla
                    JOptionPane.showMessageDialog(null, "Presionaste la tecla ENTER");
                }else{//si no, si la tecla presionada es alguno de los simbolos permitidos
                    //muestra mensaje en pantalla
                    JOptionPane.showMessageDialog(null, "Presionaste el simbolo "+car);
                }
           }
        }else{// si la tecla presionada es distinto a los simbolos permitidos, a la tecla de espacio, o la tecla ENTER
            evento.consume();//consume el evento
        }
    }
}