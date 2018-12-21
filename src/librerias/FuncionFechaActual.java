/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librerias;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Gustavo
 */
public class FuncionFechaActual {
        public static String fechaactual(){
        Date fecha= new Date();
        SimpleDateFormat formatofecha= new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
}
