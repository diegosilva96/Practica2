/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces.impl;

import com.mycompany.interfaces.IPregunta;
import com.mycompany.interfaces.IRepuestaIterator;
import java.util.List;

/**
 *
 * @author diego
 */
public class RespuestaIterator  implements IRepuestaIterator {

    private List<String> respuestas;
    protected int currentDetail = 0;

    public RespuestaIterator(List<String> respuestas){
        this.respuestas = respuestas;
    }

    @Override
    public boolean hasNext() {

        return (currentDetail < respuestas.size() && respuestas.get(currentDetail) != null);
    }

    @Override
    public String next() {

        return respuestas.get(currentDetail++);
    }
}
