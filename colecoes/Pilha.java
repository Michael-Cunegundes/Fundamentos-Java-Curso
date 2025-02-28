package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Principe");
        livros.push("Como Fazer Amigos e Influenciar Pessoas");
        livros.push("O Hobbit ");

        System.out.println(livros.peek());
        System.out.println(livros.element());

        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.pop());
//        System.out.println(livros.remove());

        System.out.println(livros.size());
        System.out.println(livros.isEmpty());
//        System.out.println(livros.contains());

    }
}
