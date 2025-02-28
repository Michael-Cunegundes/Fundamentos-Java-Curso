package fundamentos.operadores;

import java.util.Scanner;

public class ExercíciosConceitosBásicosProfessor {

	public static void main(String[] args) {

		// Celsius para Fahrenheit
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();

		double conversaoF = celsius * 1.8 + 32;

		// Fahrenheit para celsuis

		System.out.print("Valor em Farenheit: " + conversaoF);

		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();

		double conversaoC = (fahrenheit - 32) / 1.8;

		System.out.print("Valor em Celsius: " + conversaoC);

		// IMC
		System.out.println("Digite o peso:");
		double peso = scanner.nextDouble();

		System.out.println("Digite a altura:");
		double altura = scanner.nextDouble();

		double imc = peso / (altura * altura);

		System.out.print("IMC: " + imc);
		
		//ao quadrado e cubo
		System.out.println("Digite o valor:");
		double valor = scanner.nextDouble();
		
		/** Existe tamb�m a seguinte possibilidade
		 * double quadrado = valor * valor;
		 * double cubo = valor * valor * valor;
		 */
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.print("O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		
		
		//Area triangulo
		System.out.println("Digite a Base:");
		double base = scanner.nextDouble();
		
		System.out.println("Digite a Altura:");
		double alturaa = scanner.nextDouble();
		
		double area = (base * alturaa) / 2;
		
		System.out.print("A Área do Triângulo é: " + area);
		
		
		//equacao segundo grau
		System.out.println("Equação: ax² + bx + c = 0");
		
		System.out.println("\nDigite o valor de A: ");
		int a = scanner.nextInt();

		System.out.println("\nDigite o valor de B: ");
		int b = scanner.nextInt();

		System.out.println("\nDigite o valor de C: ");
		int c = scanner.nextInt();

		int delta = (b * b) - (4 * a * c);

		System.out.printf("\nSua equação é: %dx² + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO delta é: " + delta);

		double x1 = (-b + Math.sqrt(delta)) / (2 * a);

		System.out.printf("O x1 da equação é: %.2f", x1);

		double x2 = (-b - Math.sqrt(delta)) / (2 * a);

		System.out.printf("\nO x2 da equação é: %.2f" ,x2);
		
		
		

		scanner.close();

		
		
		
		
		
		
		
		
		
	}

}
