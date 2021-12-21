package com.mycompany.interfaces.impl;

import javax.sound.sampled.SourceDataLine;

import com.mycompany.interfaces.Interfaces.IEstadoEncuesta;

public class EncuestaFinalizada implements IEstadoEncuesta {
    private Encuesta Encuesta;
    @Override
    public void procesar(Encuesta e) {   
        System.out.println("Encuesta finalizada...");
    }

    public Encuesta getEncuesta() {
        return Encuesta;
    }
    public void setEncuesta(Encuesta e) {
        this.Encuesta = e;
    }
}