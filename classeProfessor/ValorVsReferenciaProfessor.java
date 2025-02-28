package classeProfessor;

public class ValorVsReferenciaProfessor {
	
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuicao por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		DataProfessor d1 = new DataProfessor(1,6,2022);
		DataProfessor d2 = d1; // atribuicao por referencia (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		d1.ano = 2025;
		
		System.out.println(d1.obterDataFormatadaProfessor());
		System.out.println(d2.obterDataFormatadaProfessor());
		
		voltarDataParaValorPadraoProfessor(d1);
		
		System.out.println(d1.obterDataFormatadaProfessor());
		System.out.println(d2.obterDataFormatadaProfessor());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
		
	}
	
	static void voltarDataParaValorPadraoProfessor(DataProfessor d) {
	    d.dia = 1;
	    d.mes = 1;
	    d.ano = 1970;
	    
	}
	
	static void alterarPrimitivo(int a) {
		a++;
	}
}
			
	


	
