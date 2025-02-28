package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		
		Produto p1 = new Produto("Notebook", 4356.89, Produto.desconto);
		
		System.out.printf("Produto 1 \nNome: %s \nPreco: R$%.2f\nDesconto padrao da loja (min 25): %.2f"
				+ "\n"
				, p1.nome,p1.preco, Produto.desconto);
		
		System.out.printf("Preco com desconto: R$%.2f \n", p1.precoComDesconto());
		
		
		
		
		Produto p1f = new Produto ("Celular", 2500.00, 0.30);
		System.out.printf("\nProduto 2 \nNome: %s \nPreco: R$%.2f\nDesconto padrao da loja (min 25): %.2f\n"
				, p1f.nome,p1f.preco, Produto.desconto);
		System.out.printf("Preco com desconto: R$%.2f \n", p1f.precoComDesconto());
		
		
		Produto.desconto = 0.25;
		
		
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.50;
		
		System.out.printf("\nProduto 3 \nNome: %s \nPreco: R$%.2f\nDesconto padrao da loja (min 25): %.2f\n"
				, p2.nome,p2.preco, Produto.desconto);
		System.out.printf("Preco com desconto: R$%.2f \n", p2.precoComDesconto());
		
		Produto.desconto = 0.25;
		
		
		
		var p2f = new Produto("Caneta Azul", 7.99, Produto.desconto);
		System.out.printf("\nProduto 4 \nNome: %s \nPreco: R$%.2f\nDesconto padrao da loja (min 25): %.2f\n"
				, p2f.nome,p2f.preco, Produto.desconto);
		System.out.printf("Preco com desconto: R$%.2f \n", p2f.precoComDesconto());
		
	
	}

}