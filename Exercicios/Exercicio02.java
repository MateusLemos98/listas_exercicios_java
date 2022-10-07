package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        var contador = 0;
        while (contador < 10){
            Scanner num = new Scanner(System.in);
            System.out.println("Digite um número: ");
            var numero = num.nextInt();
            contador++;
            if (numero %2 == 0){
                System.out.println("Este número é par!");
            }else {
                System.out.println("Este número é impar!");
            }
        }
    }

}
