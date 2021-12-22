package com.mycompany.impl;


import com.mycompany.interfaces.IEstadoEncuesta;


public class EncuestaFinalizada implements IEstadoEncuesta {
    private Encuesta Encuesta;
    @Override
    public void procesar(Encuesta e) {   
      IRespuestaIterator iterator = e.iterator();
        while (iterator.hasNext()) {
            String pregunta = iterator.next();
            System.out.println("Pregunta: " + pregunta.listarPregunta());

           for(String  respuesta: pregunta.getRespuestas() ){
                System.out.println("Respuesta:" + respuesta);
            }
        }
        System.out.println("Encuesta finalizada...");
    }

    public Encuesta getEncuesta() {
        return Encuesta;
    }
    public void setEncuesta(Encuesta e) {
        this.Encuesta = e;
    }
}
