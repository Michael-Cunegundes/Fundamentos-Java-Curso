package fundamentos.operadores;

import java.util.Scanner;

public class DesafioCalculadora {
    
    public static void main(String[] args) {
        
        System.out.println("Seja bem-vindo à incrível calculadora feita em Java!\n");
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Qual o primeiro número? ");
        String n1 = entrada.next();
        entrada.nextLine();
        
        System.out.println("Qual o segundo número? ");
        String n2 = entrada.next();
        
        System.out.println("Digite o símbolo da operação que deseja realizar: "
                + " + "
                + " - "
                + " * "
                + " / "
                + " % ");
        String ope = entrada.next();
        
        entrada.close();
        
        double valor1 = Double.parseDouble(n1);
        double valor2 = Double.parseDouble(n2);
        
        double soma = valor1 + valor2;
        double sub = valor1 - valor2;
        double mult = valor1 * valor2;
        double div = valor1 / valor2;
        double modu = valor1 % valor2; 

        
        System.out.println(
                "+".equals(ope.trim()) ? valor1 + " + " + valor2 + " = " + soma :
                "-".equals(ope.trim()) ? valor1 + " - " + valor2 + " = " + sub :
                "*".equals(ope.trim()) ? valor1 + " * " + valor2 + " = " + mult :
                "/".equals(ope.trim()) ? valor1 + " / " + valor2 + " = " + div :
                "%".equals(ope.trim()) ? valor1 + " % " + valor2 + " = " + modu :
                "Operação inválida"
            );
        }
    }