package com.mycompany.interfaces.Interfaces;

import com.mycompany.interfaces.impl.Encuesta;

public interface IEstadoEncuesta {
    void procesar(Encuesta encuesta);
    void setEncuesta(Encuesta encuesta);
}
