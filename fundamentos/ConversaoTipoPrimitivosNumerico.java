package fundamentos;

public class ConversaoTipoPrimitivosNumerico {
	
	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		
		float b = (float) 1.2345; // explicita
		System.out.println(b);
		
		 int c = 340; 
		 byte d = (byte) c; // explicita
		 System.out.println(d);
		 
		 double e = 1.9999;
		 int f = (int) e; // explicita
		 System.out.println(f);
		
	}

}
