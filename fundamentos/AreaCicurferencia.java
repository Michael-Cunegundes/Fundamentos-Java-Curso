package fundamentos;

public class AreaCicurferencia {

	public static void main(String[] args) {
		double Raio = 3.2;
		final double Pi = 3.1415;
		
		double Area = Pi * Raio * Raio;
		System.out.println(Area);
		
		Raio = 8.7;
		Area = Pi * Raio * Raio;
		System.out.println("A area dessas medicas eh: " + Area);
		
	}
}
