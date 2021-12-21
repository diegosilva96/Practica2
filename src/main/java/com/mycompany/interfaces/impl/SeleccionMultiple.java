
package com.mycompany.interfaces.impl;

import com.mycompany.interfaces.IPregunta;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Condori
 * @version 21 dic. 2021 17:41:08
 */
public class SeleccionMultiple implements IPregunta {
    
    private List<String> respuestas;

    public SeleccionMultiple() {
        this.respuestas = new ArrayList<String>();
    }
    
    @Override
    public void listarPregunta() {
    }

}
