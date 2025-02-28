package arrays;

import java.util.Arrays;
//System.out.println(Arrays.toString(notasAlunoA));

import java.util.Scanner;

public class DesafioArray {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("\nQuantos alunos foram avaliados?: ");
        int quantidadeAlunos = input.nextInt();

        String[] alunos = new String[quantidadeAlunos];


        System.out.print("\nQuantas provas foram aplicadas?: ");
        int notasPassadas = input.nextInt();

        double[] notas = new double[notasPassadas];


        int contador = 1;
        while (contador <= quantidadeAlunos) {
            System.out.println("---------------------------------------------------");
            System.out.print("Qual o nome do aluno " + contador + "?: ");
            alunos[contador - 1] = input.next();

            double maiorNota = 0;
            double menorNota = 10;
            System.out.println("Aluno " + contador + ", " + alunos[contador - 1]);

            for (int i = 0; i < notas.length; i++) {
                System.out.print("Digite a " + (i + 1) + "º nota do " +alunos[contador-1] + " (0 a 10): ");
                notas[i] = input.nextDouble();
                if (notas[i] < 0 || notas[i] > 10) {
                    System.out.println("Valor invalido, por favor digite um numero de 0 a 10");
                    i--;
                    continue;

                }

                if (notas[i] >= maiorNota) {
                    maiorNota = notas[i];
                }

                if (notas[i] < menorNota) {
                    menorNota = notas[i];
                }

            }

//        System.out.println("\n" + Arrays.toString(notas) + "\n");


            double soma = 0;
            for (double nota : notas) {
                soma += nota;
            }

            System.out.printf("Media do " + alunos[contador - 1] + ": %.1f", soma / notasPassadas);
            System.out.printf("\nMenor nota do " + alunos[contador - 1] + " foi %.1f", menorNota);
            System.out.printf("\nMaior nota do " + alunos[contador - 1] + " foi %.1f\n", maiorNota);
            System.out.println("---------------------------------------------------");
            contador += 1;
        }

        input.close();
    }
}
