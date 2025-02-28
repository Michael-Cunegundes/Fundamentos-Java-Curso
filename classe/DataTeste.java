package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data d1 = new Data();
		System.out.printf("Data d1: %d/%d/%d\n", d1.dia, d1.mes, d1.ano);
		
		Data d2 = new Data(16, 12, 2024);
		System.out.printf("Data d2: %d/%d/%d", d2.dia, d2.mes, d2.ano);
		
		Data d3 = d2;
		d3.dia = 2;
		System.out.printf("\nData d2: %d/%d/%d", d2.dia, d2.mes, d2.ano);
		
		System.out.printf("\nData d3: %d/%d/%d", d3.dia, d3.mes, d3.ano);
		

	}

}


