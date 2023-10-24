package br.senai.sp.jandira.model;

import org.w3c.dom.ls.LSOutput;

public class Retangulo extends FormaGeometrica {

    @Override
    public void calcularArea() {
        setResultadoArea(super.getLado1()*super.getLado2());
        System.out.println("O resultado da área é: " + getResultadoArea());
    }

    @Override
    public void calcularPerimetro() {
        setResultadoPerimetro((super.getLado1()*2)+(super.getLado2()*2));
        System.out.println("O resultado do perímetro é: " + getResultadoPerimetro());
    }

}
