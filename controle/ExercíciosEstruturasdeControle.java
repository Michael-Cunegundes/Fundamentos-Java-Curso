package controle;

import java.util.Scanner;

public class ExercíciosEstruturasdeControle {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Exercícios: Estruturas de Controle");
		System.out.println(
				"1. Criar um programa que receba um número" + " e \nverifique se ele está entre 0 e 10 e é par:");


		String entredezezero = "";
		String numeropar = "";

		System.out.print("\nDigite um valor: ");
		double valor1 = entrada.nextDouble();
		

		if (valor1 >= 0 && valor1 <= 10) {
			entredezezero = "Sim";

		} else {
			entredezezero = "Nao";
		}
		System.out.printf("O valor esta entre 0 e 10?: %s", entredezezero);

		if (valor1 % 2 == 0) {
			numeropar = "Sim";
		} else {
			numeropar = "Nao";
		}
		System.out.printf("\nO valor eh par?: %s", numeropar +  "\n\n\n");
		
		
		

		System.out.println("2. Criar um programa informa se o" + " \nano atual é um ano bissexto:");

		System.out.print("Qual o ano? ");
		int ano = entrada.nextInt();
		String resposta = "";

		for (int i1 = 0; i1 < 4000; i1 += 4) {
			if (i1 == ano) {
				resposta = "eh sim";
				break;
			} else {
				resposta = "nao eh";
			}
		}
		System.out.printf("%d %s um ano bissexto", ano, resposta);
	
		
		
		
		System.out.println("\n\n3. Criar um programa que receba duas notas parciais,\n"
				+ "calcular a média final. Se a nota do aluno for maior ou\nigual a 7.0 imprime no console \"Aprovado\", "
				+ "se a nota for menor\nque 7.0 e maior do que 4.0 imprime no console\n\"Recuperação\", "
				+ "caso contrário imprime no console \n\"Reprovado\".\n");
		
		double media1 = 0;
		
		for (int i2 = 1; i2 < 3; i2++) {
			
			System.out.printf("Digite a %dº nota: ", i2);
			double nota = entrada.nextDouble();
			
			if (i2 == 1 || i2 == 2) {
				media1 += nota;
			}	
			
			if (i2 == 2) {
				
				media1 = media1 / 2;
				System.out.printf("media: %.1f", media1);
				
			}
			
		}
		
		if (media1 >= 7.0 && media1 <= 10) {
			System.out.print("\nAprovado");
		}
		
		if (media1 <= 6.9 && media1 >= 4.0) {
			System.out.printf("\nRecuperação");
		} else if (media1 < 4.0){
			System.out.printf("\nRepovado");
		}

		
		
		
		System.out.println("\n\n4. Criar um programa que receba um número e diga se ele é \num número primo.");
		
		
		System.out.printf("\nDigite um numero: ");
		int primo = entrada.nextInt();
		int div = 0;
		
		for (int i3 = 1; i3 < 10000; i3++) {
			
			if (primo % i3 == 0) {
				div += 1;
			}
			
			
		}
		
		if (div == 2 ) {
			System.out.printf("o numero %d eh primo " ,primo);
		} else {
			System.out.printf("o numero %d nao eh primo " ,primo);
		}
		
		
		
		System.out.println("\n\n5. Refatorar o exercício 04, utilizando a estrutura switch.");
		
		
		System.out.printf("\nDigite um numero: ");
		int primo2 = entrada.nextInt();
		
		switch (primo2) {
		case 2:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 3:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 5:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 7:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 11:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 13:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 17:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 19:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 23:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 29:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 31:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 37:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 41:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 43:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 47:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 53:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 59:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 61:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 67:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 71:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 73:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 79:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 83:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 89:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 97:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 101:
			System.out.println(primo2 + " eh um numero primo");
			break;
		case 103:
			System.out.println(primo2 + " eh um numero primo");
			break;
		default:
			System.out.println(primo2 + " nao eh primo");
		}
		
		
		
		
		System.out.println("\n\n6. Jogo da adivinhação: Tentar adivinhar um número entre \n"
				+ "0 - 100. Armazene um numero aleatório em uma variável. \n"
				+ "O Jogador tem 10 tentativas para adivinhar o número gerado. \n"
				+ "Ao final de cada tentativa, imprima a quantidade de\n"
				+ "tentativas restantes, e imprima se o número inserido é\n"
				+ "maior ou menor do que o número armazenado.\n");
		
		
		System.out.println("Sortenando um numero de 0 a 100...");
		System.out.println("tente adivinhar o numero");
		int numeroSorteado = (int) (Math.random() * 101);
		
		int chute = 0;

		int cc = 9;
		
		for (int i4 = 1; i4 <= 10; i4 ++) {
			System.out.printf("Digite um numero de 0 a 100: ");
			chute = entrada.nextInt();
			
			
			if (chute != numeroSorteado) {
				System.out.println("\nerrou, tente novamente");
				System.out.println("voce tem mais " + cc + " chances");
				cc -= 1;
				if (cc < 0) {
					System.out.println("Suas chances acabaram");
					System.out.println("O numero era " + numeroSorteado);
					break;
				}
				if (numeroSorteado < chute) {
					System.out.println("eh um numero menor do que " + chute + "\n");
				} else if (numeroSorteado > chute) {
					System.out.println("eh um numero maior do que " + chute + "\n");
					
				}
				
			} else {
				System.out.println("acertou mizeravi");
				break;
			}
			
			
			
		}
		
		
		
		
		System.out.println("\n\n7. Criar um programa que enquanto estiver recebendo números \n"
				+ "positivos, imprime no console a soma dos números inseridos,\n"
				+ "caso receba um número negativo, encerre o programa.\n"
				+ "Tente utilizar a estrutura do while.\n\n");
		


		int numeroInicial = 1;
		int totalDaSoma = 0;
		System.out.println("comecando com 0 digite um numero para somar ou\n"
				+ "um numero negativo para finalizar");
		while (numeroInicial > -1) {
			
			System.out.printf("\nDigite um numero para somar a %d: ", totalDaSoma);
			numeroInicial = entrada.nextInt();
			
			if (numeroInicial > -1) {
				totalDaSoma += numeroInicial;
				System.out.printf("Soma de todos os numeros digitados: %d", totalDaSoma, " ");
				
			} else {
				System.out.printf("\nA soma total de todos os numeros digitados foi : %d" , totalDaSoma);
			}
		}
			
			
		
		
		System.out.println("\n\n8. Crie um programa que recebe 10 valores\n"
				+ "e ao final imprima o maior número.\n");
		
		
		int maior = 0;
		for (int i = 1; i < 11; i++) {
			System.out.print("Digite o " + i + "º valor: ");
			int valor = entrada.nextInt();
			
			if (valor > maior) {
				
				maior = valor;
			}
			
		}
		System.out.println("o maior valor digitado foi o " + maior);

		entrada.close();
	}
}
