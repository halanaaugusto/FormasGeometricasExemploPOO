package br.senai.sp.jandira.model;

public class FormaGeometrica {

    private double lado1, lado2, raio;
    private double resultadoArea;
    private double resultadoPerimetro;

    public void calcularArea(){
    }

    public void calcularPerimetro(){
    }

    public void criarRetangulo(double lado1, double lado2){
        setLado1(lado1);
        setLado2(lado2);
    }

    public void criarCirculo(double raio){
        setRaio(raio);
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getResultadoArea() {
        return resultadoArea;
    }

    public void setResultadoArea(double resultadoArea) {
        this.resultadoArea = resultadoArea;
    }

    public double getResultadoPerimetro() {
        return resultadoPerimetro;
    }

    public void setResultadoPerimetro(double resultadoPerimetro) {
        this.resultadoPerimetro = resultadoPerimetro;
    }
}
