
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
    
    private String pregunta;
    private List<String> respuestas;

    public SeleccionMultiple() {
        this.respuestas = new ArrayList<String>();
    }

    public SeleccionMultiple(String pregunta, List<String> respuestas) {
        this.pregunta = pregunta;
        this.respuestas = respuestas;
    }
    
    @Override
    public void listarPregunta() {
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public List<String> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<String> respuestas) {
        this.respuestas = respuestas;
    }

}
