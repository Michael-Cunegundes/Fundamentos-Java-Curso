package controle;

import java.util.Scanner;

public class DesafioWhileGPT {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double nota = 0.0;
        double total = 0.0;
        int notasValidas = 0;

        do {
            System.out.print("Digite a nota (ou -1 para sair): ");
            nota = entrada.nextDouble();

            if (nota >= 0 && nota <= 10) {
                total += nota;
                notasValidas++;
            } else if (nota != -1) {  // Evitar mensagem se o usuário quiser sair com -1
                System.out.println("Nota inválida! Por favor, digite uma nota entre 0 e 10.\n");
            }

        } while (nota != -1);

        if (notasValidas > 0) {
            System.out.printf("\nTotal de notas válidas digitadas: %d", notasValidas);
            System.out.printf("\nMédia das notas: %.2f", total / notasValidas);
        } else {
            System.out.println("\nNenhuma nota válida foi digitada.");
        }

        entrada.close();
    }
}
