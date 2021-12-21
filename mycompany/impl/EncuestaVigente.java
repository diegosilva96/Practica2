package com.mycompany.interfaces.impl;

import java.util.Calendar;

import com.mycompany.interfaces.Interfaces.IEstadoEncuesta;

public class EncuestaVigente implements IEstadoEncuesta {
    private Encuesta Encuesta;
    @Override
    public void procesar(Encuesta e) {   

        if( validarFechaFinalizacion(e) ){
            e.setEstado(new EncuestaFinalizada());
        }else{

        }   
    }
    private boolean validarFechaFinalizacion(Encuesta e) {

        Calendar Factual = Calendar.getInstance();
        Calendar FFinalizacion = e.getFechaFinalizacion();
        
        return FFinalizacion.before(Factual) ;
      
    }
    public Encuesta getEncuesta() {
        return Encuesta;
    }
    public void setEncuesta(Encuesta e) {
        this.Encuesta = e;
    }
}