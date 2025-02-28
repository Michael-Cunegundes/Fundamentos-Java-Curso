package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		Double nota = (double) 0;
		Double total = nota;
		Double notasvalidas = (double) 0;
		
		do {
			System.out.print("Digite a nota: ");
			nota = entrada.nextDouble();
			
			if (nota < 10.1 && nota > -1) {
				total = total + nota;
				notasvalidas++;
			} else {
				if (nota != (-1))
				System.out.println("Digite uma nova valida por favor\n");
			}
			
		} while (nota != (-1));
		
		System.out.printf("\nTotal da notas validas digitadas: %.0f", notasvalidas);
		System.out.printf("\nMedia das notas: %.2f", total/notasvalidas);
		
		entrada.close();
		
	}
	}


