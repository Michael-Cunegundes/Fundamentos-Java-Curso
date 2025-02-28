package classeProfessor;

public class DataTesteProfessor {
	
	public static void main(String[] args) {
		
		DataProfessor d1 = new DataProfessor();
		d1.ano = 2021;

		var d2 = new DataProfessor(31, 12, 2020);

		
		String dataFormatada1Professor = d1.obterDataFormatadaProfessor();
		
		System.out.println(dataFormatada1Professor);
		System.out.println(d2.obterDataFormatadaProfessor());
		
		d1.imprimirDataForamatadaProfessor();
		d2.imprimirDataForamatadaProfessor();

	}	

}
