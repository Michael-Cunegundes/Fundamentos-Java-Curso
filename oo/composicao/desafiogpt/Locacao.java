package oo.composicao.desafiogpt;

import java.util.ArrayList;
import java.util.List;

public class Locacao {
    //Representa uma locação, que contém vários veículos alugados.

    List<ItemLocacao> itemLocacao = new ArrayList<>();

    public void adicionarItemLocacao(Veiculo veiculo, int diasalugados){
        this.itemLocacao.add(new ItemLocacao(veiculo, diasalugados));

    }

    @Override
    public String toString() {
        StringBuilder detalhes = new StringBuilder();
        for (ItemLocacao item: itemLocacao){
            detalhes.append(item.toString()).append(" ");
        }
        return detalhes.toString();
    }

    public double totalAluguel(){

        double total = 0;
        for (ItemLocacao aluguel: itemLocacao){
            total += aluguel.diasalugados * aluguel.veiculo.diaria;
        }
        return total;
    }

}