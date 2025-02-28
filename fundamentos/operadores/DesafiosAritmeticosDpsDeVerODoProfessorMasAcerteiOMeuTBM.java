package fundamentos.operadores;

public class DesafiosAritmeticosDpsDeVerODoProfessorMasAcerteiOMeuTBM {
	
	public static void main(String[] args) {
		
		// primeiro formula
		double PNE = Math.pow(6 * (3 + 2), 2);
		double DPNE = PNE / (3 * 2);
		System.out.println(DPNE);
		
		//segunda formula
		double PND = (1 - 5) * (2 - 7);
		double DPND = PND / 2;
		double NFSE = DPND * DPND;
		System.out.println(NFSE);
		
		double cinquenta = Math.pow(DPNE - NFSE, 3);
		double resultado = cinquenta / (10 * 10 * 10);
		System.out.println(resultado);

	}

}
