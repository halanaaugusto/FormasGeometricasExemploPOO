package br.senai.sp.jandira.model;

public class Circulo extends FormaGeometrica {

    public void calcularArea() {
        setResultadoArea(3.14*(super.getRaio()*super.getRaio()));
        System.out.println("O resultado da área é: " + getResultadoArea());
    }

    @Override
    public void calcularPerimetro() {
        setResultadoPerimetro((3.14*2)*super.getRaio());
        System.out.println("O resultado do perímetro é: " + getResultadoPerimetro());
    }
}
