package oo.composicao;

public class Portas {

    Carro portas;

    boolean aberta = false;

    void abrir(){
        aberta = true;
    }

    void fechar(){
        aberta = false;
    }

    boolean estaAberta(){
        return aberta;
    }
}