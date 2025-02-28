package classe;

public class AreaCirc {
	
	double raio;
	static final double PI = 3.14;
	
	
	//construtor
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	
	}
	// Metodo
	double area () {
		return PI * Math.pow(raio, 2);
	}
	
	double areateste () {
		return Math.PI * Math.pow(raio, 2);
	}
	
}
