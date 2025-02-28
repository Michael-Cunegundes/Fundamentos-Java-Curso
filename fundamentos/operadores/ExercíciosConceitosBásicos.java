package fundamentos.operadores;

import java.util.Scanner;

public class ExercíciosConceitosBásicos {

	public static void main(String[] args) {

		// Criar um programa que leia a temperatura em Fahrenheit e converta para
		// Celsius.
		System.out.println("Temperatura Fahrenheit para Celsius");

		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual a temperaturam em Fahrenheit? ");

		double F = entrada.nextDouble();
		double C = (F - 32) / 1.8;
		System.out.println(F + " Graus Fahrenheit convertido para Celsius eh: " + C + "\n\n");

		// Criar um programa que leia a temperatura em Celsius e converta para
		// Fahrenheit.
		System.out.println("Temperatura Celsius para Fahrenheit");

		System.out.println("Qual a temperatura em Celsius? ");
		double Ce = entrada.nextDouble();
		double Fa = (Ce * 1.8) + 32;
		System.out.println(Ce + " Graus Celsius convertido para Fahrenheit eh: " + Fa + "\n\n");

		// Criar um programa que leia o peso e a altura do usuário e imprima no console
		// o IMC.
		System.out.println("Calculo IMC");

		System.out.println("Qual seu peso? ");
		double peso = entrada.nextDouble();

		System.out.println("Qual sua altura? ");
		double altura = entrada.nextDouble();

		double alturaqua = (double) Math.pow(altura, 2);

		double finalr = peso / alturaqua;

		System.out.println("Seu IMC eh: " + finalr + "\n\n");

		// Criar um programa que leia um valor e apresente os resultados ao quadrado e
		// ao cubo do valor.

		System.out.println("numero ao quadrado e ao cubo");

		System.out.println("Digite um numero: ");
		double n = entrada.nextDouble();

		double quadrado = (double) Math.pow(n, 2);
		double cubo = (double) Math.pow(n, 3);

		System.out.println(n + " elevado ao quadrado = " + quadrado + "\n" + n + " elevado ao cubo = " + cubo + "\n\n");

		// Criar um programa que leia o valor da base e da altura de um triângulo e
		// calcule a área.

		System.out.println("Area do tringulo");

		System.out.println("Qual o valor da base do triangulo? ");
		double base = entrada.nextDouble();

		System.out.println("Qual o valor da altura do triangulo? ");
		double alturatriangulo = entrada.nextDouble();

		double area = (base * alturatriangulo) / 2;

		System.out.println("A base desse triangulo eh: " + area + "\n\n");

		/*
		 * Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0)
		 * utilizando a fórmula de Bhaskara. Use como exemplo a = 1, b = 12 e c = -13.
		 * Encontre o delta
		 */

		System.out.println("Equações do segundo");
		System.out.println("\nΔ = b² -4 . a . c");
		System.out.println("\na = 1;  \r\n" + "b = 12; \r\n" + "c = -13;");
		System.out.println("\nΔ = 12² -4 . 1 . (-13)");
		System.out.println("Δ = 144 + 52");

		int a = 1;
		int b = 12;
		int c = -13;

		int pp = (int) Math.pow(b, 2);
		int sp = -4 * a * c;
		int delta = pp + sp;

		System.out.println("Δ = " + delta);

		entrada.close();

	}
}
