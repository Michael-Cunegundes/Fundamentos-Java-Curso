package controle;

import java.util.Scanner;

public class IfElseIfGPT {

    // Definindo constantes para os limites de cada conceito
    public static final double LIMITE_A = 8.1;
    public static final double LIMITE_B = 6.1;
    public static final double LIMITE_C = 4.1;
    public static final double LIMITE_D = 2.1;
    public static final double LIMITE_E = 0.1;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota de 0 a 10: ");
        double nota = entrada.nextDouble();

        // Validação antecipada da nota
        if (nota > 10 || nota < 0) {
            System.out.println("Nota inválida");
        } else if (nota >= LIMITE_A) {
            System.out.println("Conceito A");
        } else if (nota >= LIMITE_B) {
            System.out.println("Conceito B");
        } else if (nota >= LIMITE_C) {
            System.out.println("Conceito C");
        } else if (nota >= LIMITE_D) {
            System.out.println("Conceito D");
        } else if (nota >= LIMITE_E) {
            System.out.println("Conceito E");
        } else {
            System.out.println("Conceito F");
        }

        entrada.close();
    }
}
