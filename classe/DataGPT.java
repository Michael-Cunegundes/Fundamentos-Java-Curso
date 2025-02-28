package classe;

import java.util.Scanner;

public class DataGPT {
	
	int day;
	int month;
	int year;
	
	
	String formatarData () {
		return String.format("%d/%d/%d",day,month,year);
		
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		
		System.out.print("Digite o dia: ");
		int day = input.nextInt();
		
		System.out.print("Digite o mes: ");
		int month = input.nextInt();
		
		System.out.print("Digite o ano: ");
		int year = input.nextInt();
		
		
		DataGPT d20 = new DataGPT();
		
		d20.day = day;
		d20.month = month;
		d20.year = year;
		
		System.out.println("A data formatada é: " + d20.formatarData());
		
	
		
		
		input.close();
	}

}
