package oo.composicao.desafio;

public class ProdutoDesafio {

    String nome;
    double preco;

    public ProdutoDesafio(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return nome + " - R$ " + preco;
    }

}