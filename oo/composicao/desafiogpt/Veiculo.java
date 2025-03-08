package oo.composicao.desafiogpt;

public class Veiculo {
    //Produto
    //Representa um veículo disponível para locação.

    String marca;
    String nome;
    Double diaria;

    Veiculo(String marca, String nome, Double diaria){
        this.marca = marca;
        this.nome = nome;
        this.diaria = diaria;

    }

    public String toString(){
        return "- " + marca + " " + nome;
    }

}
