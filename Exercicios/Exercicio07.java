package Exercicios;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        var diaria = 40;
        var dias = 0;
        var i = 0;
        var cliente = "";
        var contaCliente = 0;
        var total = 0;

        while( i < 4){
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Olá cliente, qual o seu nome?");
            cliente = leitor1.nextLine();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Quantos dias você pretende ficar?");
            dias = leitor2.nextInt();

            if(dias < 10){
                contaCliente = (40 * dias) + (15 * dias);
            }else{
                contaCliente = (40 * dias) + (8 * dias);
            }
            total += contaCliente;
            System.out.println("A conta do cliente " + cliente + " possui um valor total de: " + contaCliente);
            i++;
        }
        System.out.println("O total que a pousada arrecadou foi: " + total);
    }
}
