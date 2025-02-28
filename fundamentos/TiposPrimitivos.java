package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informacoes do funcionario
		
		// Tipos numericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		// Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false;
		
		// Tipo carctere
		char status = 'A';
		
		// Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		// Numero de viagens
		System.out.println(numerosDeVoos /2);
		
		// Pontos por real
		System.out.println(pontosAcumulados/vendasAcumuladas);
		
		System.out.println(id + ": faz -> " + salario);
		
		System.out.println(id + " esta de ferias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
		
		
		
		
		
		
	}

}
