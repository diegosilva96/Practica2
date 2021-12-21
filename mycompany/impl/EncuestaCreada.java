package com.mycompany.interfaces.impl;

import java.util.Calendar;

import com.mycompany.interfaces.Interfaces.IEstadoEncuesta;

public class EncuestaCreada implements IEstadoEncuesta {
    private Encuesta Encuesta;
    EncuestaCreada a;
    @Override
    public void procesar(Encuesta e) {        
        if(validarConfiguracion(e) && ValidarFechaActivacion(e) ){
            e.setEstado(new EncuestaProgramada());
        }else{
            
        }        
    }

    private boolean validarConfiguracion(Encuesta e) {
        return !e.getTitulo().isEmpty() &&  
        !e.getDescripcion().isEmpty()  && 
        !e.getImagen().isEmpty()  && 
        !e.getPreguntas().isEmpty();
    }
    
    private boolean ValidarFechaActivacion(Encuesta e) {
        
        Calendar Factual = Calendar.getInstance();
        Calendar FActivacion = e.getFechaActivacion();
        
        return !FActivacion.before(Factual) ;
    }


    public Encuesta getEncuesta() {
        return Encuesta;
    }
    public void setEncuesta(Encuesta e) {
        this.Encuesta = e;
    }
}