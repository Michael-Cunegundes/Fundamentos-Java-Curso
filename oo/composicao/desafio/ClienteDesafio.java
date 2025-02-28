package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class ClienteDesafio {

    String nome;
    List<CompraDesafio> listaDeCompra = new ArrayList<>();

    ClienteDesafio(String nome) {
        this.nome = nome;
    }

    public void adicionarCompra(CompraDesafio compra) {
        listaDeCompra.add(compra);

    }

    public void obterValorTotal() {
        double total = 0;
        for (CompraDesafio compra : listaDeCompra) {
            for (ItemDesafio item : compra.listaDeItens) {
                total += item.produtoDesafio.preco * item.quantidade;
            }
        }
        System.out.println("O valor total das compras de " + nome + " é R$ " + total);
    }


    @Override
    public String toString() {
        return nome;
    }

}
