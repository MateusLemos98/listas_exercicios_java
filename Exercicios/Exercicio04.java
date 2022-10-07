package Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        var litrosGasolina = 0;
        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Quantos litros de gasolina você colocou?");
        litrosGasolina = leitor1.nextInt();

        var refrigerante = 0;
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Quantos refrigerantes você consumiu?");
        refrigerante = leitor2.nextInt();

        var custoGasolina = litrosGasolina * 2.50;
        System.out.println("O total de gasolina é: " + custoGasolina);
        var custoRefri = refrigerante * 3;
        System.out.println("O custo total do refrigerante é: " + custoRefri);

        var custoTotal = custoGasolina + custoRefri;
        System.out.println("O total a pagar é: " + custoTotal);


    }
}
