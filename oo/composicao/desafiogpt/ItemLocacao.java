package oo.composicao.desafiogpt;

public class ItemLocacao {
    //Item
    //Representa um veículo alugado e a quantidade de dias de aluguel.

    Veiculo veiculo;
    int diasalugados;


    ItemLocacao(Veiculo veiculo, int diasalugados){
        this.veiculo = veiculo;
        this.diasalugados = diasalugados;

    }

    @Override
    public String toString() {
        return veiculo.toString() + " (" + diasalugados + " dias) → ";
    }

}
