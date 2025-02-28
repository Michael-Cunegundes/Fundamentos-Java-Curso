package classe;

public class Produto {

    String nome;
    double preco;
    static double desconto;
    
    Produto(){
    	
    }
    
    Produto (String nomeInicial,double precoInicial, double descontoInicial){
    	nome = nomeInicial;
    	preco = precoInicial;
    	desconto = descontoInicial;
    
    }
    
    double precoComDesconto () {
    	double precoFinal = preco * (1 - desconto);
		return precoFinal;
}

}