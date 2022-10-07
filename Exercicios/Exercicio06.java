package Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        var nota1 = 0;
        var nota2 = 0;
        var mediaNotas = 0;
        var aprovados = 0;
        var reprovados = 0;
        var exames = 0;
        var mediaTurma = 0;



        for (var i = 0; i < 6; i++){
            Scanner leitor1 = new Scanner(System.in);
            System.out.println("Digite a primeira nota do aluno: ");
            nota1 = leitor1.nextInt();

            Scanner leitor2 = new Scanner(System.in);
            System.out.println("Digite a segunda nota do aluno: ");
            nota2 = leitor2.nextInt();

            mediaNotas = (nota1 + nota2)/2;

            if (mediaNotas < 3){
                System.out.println("O aluno está reprovado!");
                reprovados++;
            } else if (mediaNotas >= 3 && mediaNotas <= 7) {
                System.out.println("O aluno vai para o exame final!");
                exames++;
            }else {
                System.out.println("O aluno está aprovado!");
                aprovados++;
            }
            mediaTurma = mediaNotas/6;
            System.out.println(mediaTurma);


        }
        mediaTurma = mediaNotas/6;
        System.out.println(mediaTurma);

        System.out.println("O total de alunos aprovados foi: "+ aprovados);
        System.out.println("O total de alunos para fazer exame é: " + exames);
        System.out.println("O total de alunos reprovados foi: " + reprovados);
        System.out.println("Média da classe foi: " + mediaTurma);
    }
    }

