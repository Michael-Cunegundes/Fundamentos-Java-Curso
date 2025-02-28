package oo.composicao;

import java.util.ArrayList;

public class Compra {

    String cliente;

    ArrayList<Item> itens = new ArrayList<Item>();

    public Compra() {
        this.itens = new ArrayList<>(); // Inicializa a lista para evitar erro de NullPointerException
    }

    public void adicionarItem(String nome, int quantidade, double preco) {
        // Criando um novo Item e adicionando à lista
        this.itens.add(new Item(nome, quantidade, preco));
    }

    public void adicionarItem(Item item) {
        // Adicionando um item já criado
        this.itens.add(item);
    }


    Double obeterValorTotal() {
        double total = 0;


        for (Item item : itens) {

            total += (item.quantidade * item.preco);

        }
        return total;
    }

}