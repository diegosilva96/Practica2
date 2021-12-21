package com.mycompany.interfaces.impl;

import java.util.Calendar;

import com.mycompany.interfaces.Interfaces.IEstadoEncuesta;

public class EncuestaProgramada implements IEstadoEncuesta {
    private Encuesta Encuesta;
    @Override
    public void procesar(Encuesta e) {           
        if( validarFechaActivacion(e) ){
            e.setEstado(new EncuestaVigente());
        }else{

        }        
    }
    
    private boolean validarFechaActivacion(Encuesta e) {
        Calendar Factual = Calendar.getInstance();
        Calendar FActivacion = e.getFechaActivacion();
        Calendar FFinalizacion = e.getFechaFinalizacion();
        
        return FActivacion.before(Factual) && !FFinalizacion.before(Factual) ;
        
    }



    public Encuesta getEncuesta() {
        return Encuesta;
    }
    public void setEncuesta(Encuesta e) {
        this.Encuesta = e;
    }
}