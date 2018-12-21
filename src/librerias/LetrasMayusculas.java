package librerias;
public class LetrasMayusculas {
    //METODO CONVERTIR MINÚSCULAS A MAYÚSCULAS 
    public static void convertiraMayusculas(javax.swing.JTextField jTextfieldS){
        String cadena= (jTextfieldS.getText()).toUpperCase();
        jTextfieldS.setText(cadena);
    }
}
