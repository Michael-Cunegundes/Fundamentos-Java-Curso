
package classe;

import java.util.Scanner;

public class ExerciciosPassadosPeloGPT {
	
	public static void main(String[] args) {
		
//		Crie um programa que solicite ao usuário dois números e uma operação 
//		(adição, subtração, multiplicação ou divisão). Realize a operação escolhida e exiba o resultado.
//
//		Requisitos:
//
//		Use um Scanner para entrada de dados.
//		Utilize switch para escolher a operação.
		
        Scanner input = new Scanner(System.in);
//
//        System.out.println("1. Exercício: Calculadora Simples");
//        System.out.print("Digite o primeiro número: ");
//        double number1 = input.nextDouble();
//
//        System.out.print("Digite o segundo número: ");
//        double number2 = input.nextDouble();
//
//        System.out.println("Escolha uma operação (+, -, *, /):");
//        String operation = input.next();
//
//        double result;
//
//        switch (operation) {
//            case "+":
//                result = number1 + number2;
//                System.out.printf("O resultado é: %.2f\n", result);
//                break;
//            case "-":
//                result = number1 - number2;
//                System.out.printf("O resultado é: %.2f\n", result);
//                break;
//            case "*":
//                result = number1 * number2;
//                System.out.printf("O resultado é: %.2f\n", result);
//                break;
//            case "/":
//                if (number2 == 0) {
//                    System.out.println("Erro: divisão por zero não é permitida.");
//                } else {
//                    result = number1 / number2;
//                    System.out.printf("O resultado é: %.2f\n", result);
//                }
//                break;
//            default:
//                System.out.println("Operação inválida! Escolha entre +, -, * ou /.");
//        }
//		
//		
//		System.out.println("\n\n2. Exercício: Verificar Par ou Ímpar");
//		System.out.print("enter a integer number: ");
//		int parouimpar = input.nextInt();
//		
//		if (parouimpar %2 == 0) {
//		System.out.print("the number " + parouimpar + " is even.");
//		} else {
//			System.out.println("the number " + parouimpar + " is odd.");
//		}
		
		
		
		System.out.println("\n\n3. Exercício: Calculadora de Média");
//		Crie um programa que peça ao usuário 3 notas de um aluno e calcule a média aritmética. 
//		Informe se o aluno está aprovado, reprovado ou em recuperação, com base nas seguintes regras:
//			Aprovado: média >= 7.0
//			Recuperação: média >= 5.0 e < 7.0
//			Reprovado: média < 5.0
		
		
//		System.out.print("Digite a primeira nota: ");
//		double note1 = input.nextDouble();
//		
//		System.out.print("Digite a segunda nota: ");
//		double note2 = input.nextDouble();
//		
//		System.out.print("Digite a terceira nota: ");
//		double note3 = input.nextDouble();
//		
//		
//		
//		double average = (note1 + note2 + note3) / 3;
//		
//		System.out.printf("Media: %.1f", average);
//		
//		String notefinal;
//		
//		if (average >= 7.0) {
//			if (average == 10) {
//				notefinal = "Aprovado, você foi perfeito, parabéns :)";
//				System.out.printf("\nsituação: %s", notefinal);
//			} else {
//			notefinal = "Aprovado";
//			System.out.printf("\nSituação: %s", notefinal);
//			}
//		} else if (average >= 5.0) {
//			notefinal = "Recuperação";
//			System.out.printf("\nSituação: %s", notefinal);
//		} else {
//			notefinal = "Reprovado";
//			System.out.printf("\nSituação: %s", notefinal);
//		}
//		System.out.println("\n\n3. Exercício: Calculadora de Média");
//	
//		double media;
//		
//		System.out.print("Digite a primeira nota: ");
//		double nota = input.nextDouble();
//		media = nota;
//		
//		System.out.print("Digite a segunda nota: ");
//		nota = input.nextDouble();
//		media = media + nota;
//		
//		System.out.print("Digite a terceira nota: ");
//		nota = input.nextDouble();
//		media = media + nota;
//		
//		System.out.printf("Media: %.1f", media / 3);
		
//		String notefinal;
//		
//		if (media >= 7.0) {
//			if (media == 10) {
//				notefinal = "Aprovado, você foi perfeito, parabéns :)";
//				System.out.printf("\nsituação: %s", notefinal);
//			} else {
//			notefinal = "Aprovado";
//			System.out.printf("\nSituação: %s", notefinal);
//			}
//		} else if (media >= 5.0) {
//			notefinal = "Recuperação";
//			System.out.printf("\nSituação: %s", notefinal);
//		} else {
//			notefinal = "Reprovado";
//			System.out.printf("\nSituação: %s", notefinal);
//		}
//
//		
//		
//		
//		
		System.out.printf("\n\n5. Exercício: Tabuada");
//		Faça um programa que receba um número inteiro e exiba a tabuada desse número de 1 a 10.
//
//		Requisitos:
//
//		Use um laço for para gerar a tabuada.
//		Exiba cada resultado no formato "número x i = resultado".
		
		
		System.out.print("\nDigite um número: ");
		int nt = input.nextInt();
		System.out.print("\nTabuada do número " + nt + ": \n");
		System.out.println("-------------------------");
		
		
		for (int contador = 1; contador <= 10; contador++) {
			int resposta = nt * contador;
			System.out.println(nt + " x " + contador + " = " + resposta);
			
		}
		
		input.close();
		

		
		
		
		
		
	}



}
