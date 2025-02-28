package classeProfessor;

public class DataProfessor {
	
	int dia;
	int mes;
	int ano;
	
	
	DataProfessor() {
//		dia = 1;
//		mes = 1;
//		ano = 1970;
		this(1, 1, 1970);
	}
	
	DataProfessor(int dia , int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	String obterDataFormatadaProfessor() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	void imprimirDataForamatadaProfessor() {
		System.out.println(obterDataFormatadaProfessor());
	}
	

}
