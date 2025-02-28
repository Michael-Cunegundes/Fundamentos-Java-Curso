package controle;

import java.util.Scanner;

public class DesafioWhileProfessor {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while (nota != -1) {
			System.out.print("Informe a nota (ou -1 p/ sair): ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeDeNotas++;
			} else if (nota != -1) {
				System.out.println("Nota Invalida, digite uma nota de 0 a 10");
			}
		}
		
		double media = total / quantidadeDeNotas;
		System.out.printf("Media = %.1f", media);

		entrada.close();
	}

}
