package oo.composicao.desafio;

public class ClienteDesafioTeste {

    public static void main(String[] args) {

        ClienteDesafio cliente1 = new ClienteDesafio("Joao");

        ProdutoDesafio produto1 = new ProdutoDesafio("Caneca", 160.50);
        ProdutoDesafio produto2 = new ProdutoDesafio("Camisa", 1200.00);
        ProdutoDesafio produto3 = new ProdutoDesafio("Copo", 10.00);
        ProdutoDesafio produto4 = new ProdutoDesafio("Air Jordan 1", 1000.00);

        ItemDesafio item1 = new ItemDesafio(produto1, 2);
        ItemDesafio item2 = new ItemDesafio(produto2, 1);
        ItemDesafio item3 = new ItemDesafio(produto3, 5);
        ItemDesafio item4 = new ItemDesafio(produto4, 1);

        CompraDesafio compraDesafio = new CompraDesafio(cliente1);
        compraDesafio.adicionarItem(item1);
        compraDesafio.adicionarItem(item2);
        compraDesafio.adicionarItem(item3);
        compraDesafio.adicionarItem(item4);

        cliente1.adicionarCompra(compraDesafio);
        System.out.print(cliente1.listaDeCompra.get(0));
        cliente1.obterValorTotal();


        ClienteDesafio cliente2 = new ClienteDesafio("Maria");

        ProdutoDesafio produto11 = new ProdutoDesafio("Blush", 140.50);

        ItemDesafio item11 = new ItemDesafio(produto11, 2);

        CompraDesafio compraDesafio11 = new CompraDesafio(cliente2);
        compraDesafio11.adicionarItem(item11);

        cliente2.adicionarCompra(compraDesafio11);


        System.out.print(cliente2.listaDeCompra.get(0));
        cliente2.obterValorTotal();


        ClienteDesafio cliente3 = new ClienteDesafio("Pedro");

        ProdutoDesafio produto21 = new ProdutoDesafio("Cadeira", 500.00);

        ItemDesafio item21 = new ItemDesafio(produto21, 1);

        CompraDesafio compraDesafio21 = new CompraDesafio(cliente3);

        compraDesafio21.adicionarItem(item21);

        cliente3.adicionarCompra(compraDesafio21);

        System.out.print(cliente3.listaDeCompra.get(0));

        cliente3.obterValorTotal();

    }
}
