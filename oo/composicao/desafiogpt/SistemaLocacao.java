package oo.composicao.desafiogpt;

public class SistemaLocacao {
    // Classe principal que testa o código, simulando locações e exibindo o valor total gasto.

    public static void main(String[] args) {

        Locacao locacao1 = new Locacao();
        locacao1.adicionarItemLocacao(new Veiculo("Porshe", "911",349.99),5);

        Cliente cliente = new Cliente("Michael");
        cliente.locacoes.add(locacao1);

        System.out.println("\nLocação de " + cliente.nome + ":\n" + cliente.locacoes.get(0) + "Total: R$ " + locacao1.totalAluguel());

        Locacao locacao2 = new Locacao();
        locacao2.adicionarItemLocacao(new Veiculo("BYD", "Seal", 150.00),3);
        cliente.locacoes.add(locacao2);

        System.out.println("" + cliente.locacoes.get(1) + "Total: R$ " + locacao2.totalAluguel());

        Locacao locacao3 = new Locacao();
        locacao3.adicionarItemLocacao(new Veiculo("Fiat", "500", 99.99),12);
        cliente.locacoes.add(locacao3);
        System.out.println("" + cliente.locacoes.get(2) + "Total: R$ " + locacao2.totalAluguel());


        if (cliente.locacoes.size() == 1) {
            System.out.println("Valor total gasto em " +cliente.locacoes.size() +" carro por "+ cliente.nome +" R$ "+ cliente.obterValorTotal());
        } else {
            System.out.println("Valor total gasto em " +cliente.locacoes.size() +" carros por "+ cliente.nome +" R$ "+ cliente.obterValorTotal());
        }

    }
}
