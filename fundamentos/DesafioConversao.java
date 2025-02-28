package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    
    public static void main(String[] args) {
        
        Scanner infoSala = new Scanner(System.in);
        System.out.print("Digite seu salário 1: ");
        String salario1 = infoSala.nextLine();
        
        System.out.print("Digite seu salário 2: ");
        String salario2 = infoSala.nextLine();
        
        System.out.print("Digite seu salário 3: ");
        String salario3 = infoSala.nextLine();
            
        // Substituir vírgula por ponto
        salario1 = salario1.replace(",", ".");
        salario2 = salario2.replace(",", ".");
        salario3 = salario3.replace(",", ".");
        
        // Conversão das strings para double
        double valor1 = Double.parseDouble(salario1);
        double valor2 = Double.parseDouble(salario2);
        double valor3 = Double.parseDouble(salario3);
        
        // Soma dos salários
        double soma = valor1 + valor2 + valor3;
        System.out.printf("A soma é: %.3f\n" , soma);
        
        // Cálculo e impressão da média
        double media = soma/3;
        System.out.printf("A média é: %.3f" , media);
        
        // Fechar o scanner para evitar vazamento de recursos
        infoSala.close();
        
    }

}