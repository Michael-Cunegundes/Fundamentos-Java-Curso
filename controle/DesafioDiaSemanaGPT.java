package controle;

import java.util.Scanner;

public class DesafioDiaSemanaGPT{

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o dia da semana: ");
        String dia = entrada.nextLine().trim().toLowerCase(); // Remove espaços e normaliza para minúsculo

        if (dia.equals("domingo")) {
            System.out.println("1");
        } else if (dia.equals("segunda")) {
            System.out.println("2");
        } else if (dia.equals("terça") || dia.equals("terca")) { // Aceita terça com ou sem acento
            System.out.println("3");
        } else if (dia.equals("quarta")) {
            System.out.println("4");
        } else if (dia.equals("quinta")) {
            System.out.println("5");
        } else if (dia.equals("sexta")) {
            System.out.println("6");
        } else if (dia.equals("sábado") || dia.equals("sabado")) { // Aceita sábado com ou sem acento
            System.out.println("7");
        } else {
            System.out.println("Dia inválido");
        }

        entrada.close();
    }
}
