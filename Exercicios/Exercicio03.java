package Exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        var funcionario = "";
        while(!funcionario.equalsIgnoreCase("Fim")){
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Digite o nome do funcionário: ");
            funcionario = leitor1.nextLine();

            var salario = 0;
            Scanner Salario = new Scanner(System.in);
            System.out.println("Digite o salário do " + funcionario + ":");
            salario = Salario.nextInt();

            if (salario < 500){
                int aumento = (20*salario) / 100;
                int novoSal = salario + aumento;
                System.out.println("O salário de " + funcionario + " com o reajuste, ficou: " + novoSal);
            }else{
                System.out.println("O salário de " + funcionario + " não terá reajuste");
            }
            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Digite funcionário ou fim");
            funcionario = leitor2.nextLine();
        }




    }
}
