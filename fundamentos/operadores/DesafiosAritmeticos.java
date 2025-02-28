package fundamentos.operadores;

public class DesafiosAritmeticos {
	public static void main(String[] args) {

		int a = 3 + 2;
		int b = 6 * a;
		int c = (int) Math.pow(b, 2);
		int d = c / (3*2);
		
		System.out.println(d + "\n"); // resultado da primeira formula
		
		int e = 1 - 5;
		int f = 2 - 7;
		int g = e * f;
		int i = g / 2;
		int h = (int) Math.pow(i, 2);
		
		System.out.println(h + "\n"); // resuldado da segunda formula
		
		int j = d - h;
		int k = (int) Math.pow(j, 3);
		int l = (int) Math.pow(10, 3);
		int m = k / l;
		System.out.println(m); // resultado final
				
	}
}
