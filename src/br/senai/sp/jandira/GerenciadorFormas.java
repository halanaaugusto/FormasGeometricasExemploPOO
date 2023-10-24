package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Circulo;
import br.senai.sp.jandira.model.FormaGeometrica;
import br.senai.sp.jandira.model.Retangulo;

import java.text.Normalizer;
import java.util.Scanner;

public class GerenciadorFormas {
    public static void main(String[] args) {

        //Instanciando o scanner
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        //looping enquanto for verdadeiro
        while (continuar) {
            System.out.println("====== Cálculo das Formas Geométricas ======");
            System.out.println("Escolha uma forma geométrica:");
            System.out.println("1- Círculo");
            System.out.println("2- Retângulo");
            System.out.println("3- Sair");

            //atribuindo a escolha do usuário ao número da própria escolha
            int escolha = scanner.nextInt();

            // escolhas do usuário utilizando switch
            switch (escolha){

                case 1:
                    //instanciando a classe
                    FormaGeometrica circulo = new Circulo();
                    //obtendo dados
                    System.out.println("Digite o raio: ");
                    double raio = scanner.nextDouble();
                    // chamar métodos para a criação do círculo
                    circulo.criarCirculo(raio);
                    circulo.calcularArea();
                    circulo.calcularPerimetro();
                    break;

                case 2:
                    //instanciando a classe
                    FormaGeometrica retangulo = new Retangulo();
                    //obtendo dados
                    System.out.println("Digite o lado 1 do retângulo: ");
                    double lado1 = scanner.nextDouble();
                    System.out.println("Digite o lado 2 do retângulo: ");
                    double lado2= scanner.nextDouble();
                    //chamar métodos para a criação do retângulo
                    retangulo.criarRetangulo(lado1, lado2);
                    retangulo.calcularArea();
                    retangulo.calcularPerimetro();
                    break;

                case 3:
                    System.out.println("Saindo do sistema...");
                    continuar = false;
                    break;
            }
        }
    }
}
