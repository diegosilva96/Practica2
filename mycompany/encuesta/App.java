
package com.mycompany.encuesta;

import com.mycompany.interfaces.impl.Encuesta;
import com.mycompany.interfaces.impl.SeleccionSimple;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Condori
 * @version 21 dic. 2021 17:52:33
 */
public class App {
    
    public static void main(String[] args) {
        Encuesta encuesta = new Encuesta();
        
        List<String> respuestas = new ArrayList<>();
        respuestas.add("SI");
        respuestas.add("NO");
        
        encuesta.agregarPregunta(new SeleccionSimple("Selecciona tu edad", respuestas));
    
    }

}
