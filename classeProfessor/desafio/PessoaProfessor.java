package classeProfessor.desafio;

import classe.Pessoa;

public class PessoaProfessor {

    String nome;
    double peso;

    PessoaProfessor(String nome, double peso){

        this.nome = nome;
        this.peso = peso;
    }

    void comer (ComidaProfessor comida){

        if (comida != null){
            this.peso += comida.peso;
        }
    }

    String apresentar(){
        return "Ola eu sou o " + nome + " e tenho " + peso + " Kgs.";
    }
}
