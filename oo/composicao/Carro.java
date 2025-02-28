package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Carro {

    Motor motor;

    private List<Portas> portas;

    Carro(){

        this.motor = new Motor(this);
        this.portas = new ArrayList<>();
    }

    public void adicionarPorta(Portas porta) {
        portas.add(porta);
    }

    public boolean todasPortasFechadas(){
        for (Portas porta : portas){
            if (porta.estaAberta()){
                return false;
            }
        }
        return true;
    }

    void acelerar() {
        if (!todasPortasFechadas()) {
            System.out.println("Porta aberta");
        }

        if (motor.fatorInjecao < 3.0) {
            motor.fatorInjecao += 0.4;
        }
    }

    void frear() {
        if (motor.fatorInjecao > 0.5) {
            motor.fatorInjecao -= 0.4;
        }
    }

    void ligar() {
        motor.ligado = true;
    }

    void desligar() {
        motor.ligado = false;
    }

    boolean estaLigado() {
        return motor.ligado;
    }
}