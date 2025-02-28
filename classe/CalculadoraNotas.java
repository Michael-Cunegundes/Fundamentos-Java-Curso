package classe;

import java.util.Scanner;

public class CalculadoraNotas {

    public static void main(String[] args) {

        double nota1, nota2, nota3, media;
        String situacao;
        Scanner input = new Scanner(System.in);

        // Método para obter nota válida
        nota1 = getNota(input, 1);
        if (nota1 == -1) return;

        nota2 = getNota(input, 2);
        if (nota2 == -1) return;

        nota3 = getNota(input, 3);
        if (nota3 == -1) return;

        media = (nota1 + nota2 + nota3) / 3;

        System.out.println("\nResultado Final:");
        System.out.printf("Nota 1: %.2f\n", nota1);
        System.out.printf("Nota 2: %.2f\n", nota2);
        System.out.printf("Nota 3: %.2f\n", nota3);
        System.out.printf("Média: %.2f\n", media);

        if (media >= 7.0) {
            situacao = "Aprovado";
        } else if (media >= 5.0) {
            situacao = "Recuperação";
        } else {
            situacao = "Reprovado";
        }

        System.out.printf("Situação: %s\n\n", situacao);
        input.close();
    }

    // Método auxiliar para obter uma nota válida
    private static double getNota(Scanner input, int numero) {
        double nota;
        System.out.printf("Digite a nota da avaliação %d (0 a 10): ", numero);
        try {
            nota = input.nextDouble();
            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida! Insira valores entre 0 e 10.");
                return -1; // Indica que a entrada foi inválida
            }
        } catch (Exception e) {
            System.out.println("Entrada inválida! Por favor, insira um número válido.");
            input.next(); // Limpa a entrada inválida
            return -1; // Indica que a entrada foi inválida
        }
        return nota;
    }
}
