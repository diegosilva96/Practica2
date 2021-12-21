
package com.mycompany.interfaces.impl;

import com.mycompany.interfaces.IPregunta;
import java.util.ArrayList;
import java.util.List;

public class Encuesta implements IPregunta {
    
    private String titulo;
    private String descripcion;
    private String imagen;
    private List<IPregunta> preguntas;
    private List<IPregunta> respuestas;
    
    private Calendar fechaActivacion;
    private Calendar fechaFinalizacion;
    private IEstadoEncuesta estado;
    
    public Encuesta() {
        preguntas = new ArrayList<IPregunta>();
    }

    public Encuesta(String titulo, String descripcion, String imagen, List<IPregunta> preguntas) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.imagen = imagen;
        this.preguntas = preguntas;
    }
    
    public void agregarPregunta(IPregunta pregunta) {
        if (pregunta != null) {
            this.preguntas.add(pregunta);
        }
    }
    
    public void quitarPregunta(int posicion) {
        this.preguntas.remove(posicion);
    }
    
    @Override
    public void listarPregunta() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public List<IPregunta> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<IPregunta> preguntas) {
        this.preguntas = preguntas;
    }
    public IRespuestaIterator iterator() {
        
        return new RespuestaIterator( respuestas );
    }
    
    public IEstadoEncuesta getEstado() {
        return estado;
    }

    public void setEstado(IEstadoEncuesta estado) {
        this.estado = estado;
    }

    public Calendar getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(Calendar fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public Calendar getFechaActivacion() {
        return fechaActivacion;
    }

    public void setFechaActivacion(Calendar fechaActivacion) {
        this.fechaActivacion = fechaActivacion;
    }

}
