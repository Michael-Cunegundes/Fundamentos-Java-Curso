package fundamentos.operadores;

public class Ternario {
	
	public static void main(String[] args) {
		
		double media = 7.6;
		String resuldadoFinal = media >= 8.0 ? "aprovado" : "em recuperacao";
		System.out.println("O aluno esta " + resuldadoFinal + "\n");
		
		double nota = 9.0;
		boolean bomComportamento = true;
		boolean passouPormedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPormedia;
		String resultado = temDesconto ? "Sim." : "Nao";
		
		System.out.printf("O aluno tem desconto? %s",  resultado);
	}

}
