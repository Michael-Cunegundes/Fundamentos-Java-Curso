package oo.composicao.desafio;

public class ItemDesafio {

    ProdutoDesafio produtoDesafio;
    int quantidade;

    public ItemDesafio(ProdutoDesafio produtoDesafio, int quantidade) {
        this.quantidade = quantidade;
        this.produtoDesafio = produtoDesafio;
    }

    @Override
    public String toString() {
        return produtoDesafio.toString() + " x" + quantidade;
    }
}