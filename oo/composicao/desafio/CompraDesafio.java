package oo.composicao.desafio;

import java.util.ArrayList;

public class CompraDesafio {

    ClienteDesafio cliente;
    ArrayList<ItemDesafio> listaDeItens = new ArrayList<>();

    public CompraDesafio(ClienteDesafio cliente) {
        this.cliente = cliente;
    }


    public void adicionarItem(ItemDesafio item) {
        listaDeItens.add(item);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nCompra de ").append(cliente.nome).append("\nItens:\n");
        for (ItemDesafio item : listaDeItens) {
            sb.append(item.toString()).append("\n");
        }
        return sb.toString();
    }

}
