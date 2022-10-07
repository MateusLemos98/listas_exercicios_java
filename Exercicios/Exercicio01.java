package Exercicios;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        var creditos = 0;
        var percentual = 0;
        var novoCredito = 0;

        Scanner credito = new Scanner(System.in);
        System.out.println("Qual o valor dos créditos Galácticos? ");
        creditos = credito.nextInt();

        Scanner aumento = new Scanner(System.in);
        System.out.println("Qual o percentual de aumento? ");
        percentual = aumento.nextInt();

        novoCredito = ((percentual * creditos) / 100) + creditos;

        System.out.println("Os créditos galacticos com o aumento ficou de: " + novoCredito);

    }
}
