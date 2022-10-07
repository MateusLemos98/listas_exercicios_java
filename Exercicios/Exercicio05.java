package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        var salario = 0;
        var prestacao = 0;
        var prestacaoMax = 0;

        Scanner leitor1 = new Scanner(System.in);
        System.out.println("Digite seu salário: ");
        salario = leitor1.nextInt();

        Scanner leitor2 = new Scanner(System.in);
        System.out.println("Digite o quanto você quer pegar de prestação: ");
        prestacao = leitor2.nextInt();

        prestacaoMax = (30 * salario)/100;

        if (prestacao < prestacaoMax){
            System.out.println("Empréstimo aprovado.");
        }else {
            System.out.println("Empréstimo reprovado.");
        }
    }
}
