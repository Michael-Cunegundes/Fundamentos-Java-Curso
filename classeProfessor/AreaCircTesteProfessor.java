package classeProfessor;

public class AreaCircTesteProfessor {
	
	public static void main(String[] args) {
		
		AreaCircProfessor a1 = new AreaCircProfessor(10);
		a1.raio = 10;
//		a1.PI = 100000;
		
//		AreaCircProfessor.PI = 3.1415;
		
		System.out.println(a1.area());
		
		System.out.println(AreaCircProfessor.area(100));
		System.out.println(AreaCircProfessor.PI);
		System.out.println(Math.PI);
		
		

	}

}
