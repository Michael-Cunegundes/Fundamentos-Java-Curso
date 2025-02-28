package fundamentos.operadores;

public class DesafioLogicos {
	
	public static void main(String[] args) {
		
		boolean trabalhot = true; //trabalho da terca
		boolean trabalhoq = true; // trabalho da quinta
		boolean trabalho2 = trabalhot && trabalhoq;
		
		boolean tv50 = trabalhot && trabalhoq;
		boolean tv32 = trabalhot ^ trabalhoq;

		boolean tomousorvete = trabalhot || trabalhoq;
		
		System.out.println("Trabalhou na terca? " + trabalhot);
		System.out.println("\nTrabalhou na quinta? " + trabalhoq);
		System.out.println("\nOs dois trabalhos deram certo? " + trabalho2);
		System.out.println("\nCompro TV de 50\"? " + tv50);
		System.out.println("\nCompro TV de 32\"? " + tv32);
		System.out.println("\nTomou sorvete? " + tomousorvete);
		System.out.println("\nFicou mais saudavel? " + !tomousorvete);

	}

}
