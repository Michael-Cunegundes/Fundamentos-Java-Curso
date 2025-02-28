package classeProfessor;

public class ProdutoTesteProfessor {
	
	public static void main(String[] args) {
		
		ProdutoProfessor p1 = new ProdutoProfessor("Notebook", 4356.89);
		
		var p2 = new ProdutoProfessor();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		
		ProdutoProfessor.desconto = 0.50;
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto(0.1);
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2 ;
		
		System.out.printf("Media do carrinho = R$%.2f", mediaCarrinho);
	}

}
