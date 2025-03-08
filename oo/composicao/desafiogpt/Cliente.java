package oo.composicao.desafiogpt;

import oo.composicao.desafioProfessor.Compra;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    //Representa um cliente que pode alugar veículos.

    String nome;
    List<Locacao> locacoes = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }

    public void alugarCarro(Locacao locacao){
        this.locacoes.add(locacao);
    }


    double obterValorTotal() {
        double total = 0;

        for (Locacao locacao : locacoes) {
            total += locacao.totalAluguel();
        }

        return total;
    }


}
