package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class alunos {

    public static void main (String [] args){

        Queue<String> fila = new LinkedList<>();

        // Offer e Add -> adicionam elementos na fila

        // Diferenca eh o comportamento ocorre
        // quando a fila esta cheia!

        fila.add("Ana"); // lanca execao
        fila.offer("Bia"); // retorna false
        fila.add("Carlos");
        fila.offer("Daniel");
        fila.add("Rafael");
        fila.offer("Gui");

        // Peek e Element -> obter o proximo elemento
        // da fila (sem remover)

        // Diferenca eh o comportamento ocorre
        // quando a fila esta vazia!

        System.out.println(fila.peek()); // retorna null
        System.out.println(fila.element()); // retorna uma excecao

        // Poll e Remove -> obter o priximo elemento
        // da fila e remove!

        // Diferenca eh o comportamento ocorre
        // quando a fila esta vazia!

        System.out.println(fila.poll()); // retorna null
        System.out.println(fila.remove()); // lanca uma excecao

    }

}