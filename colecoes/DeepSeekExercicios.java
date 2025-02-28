package colecoes;

import classeProfessor.desafio.PessoaProfessor;

import java.util.*;

public class DeepSeekExercicios {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println();

//        System.out.println("Digite 10 numero inteiros ");
//        int[] numero = new int[10];
//        int soma = 0;
//        int maior = 0;
//        int menor = Integer.MAX_VALUE;
//
//        for (int i = 0; i < numero.length; i++) {
//            System.out.print("Digite o " + (i + 1) + "º numero : ");
//            numero[i] = input.nextInt();
//            soma += numero[i];
//
//            if (numero[i] > maior){
//                maior = numero[i];
//            }
//
//            if (numero[i] < menor){
//                menor = numero[i];
//            }
//
//        }
//
//        System.out.println("Media desses numeros: " + soma / numero.length);
//        System.out.println("maior: " + maior);
//        System.out.println("menor: " + menor);




//        List<TreeSet<String>> nomes = new ArrayList<>();
//
//        Set<String> nome = new TreeSet<>(Arrays.asList("Frenando", "Bento", "Ana", "Emilia", "Danilo", "Caio"));
//        System.out.println("Lista da galera em ordem alfabetica: " + nome);
//
//        HashSet<String> frutas = new HashSet<>();
//        frutas.add("Banana");
//        frutas.add("Maca");
//        frutas.add("Pera");
//        frutas.add("Acerola");
//        frutas.add("Manga");
//
//        System.out.println("Lista das frutas: " + frutas);
//        System.out.println("Nessa lista de fruta contem Acerola? " + frutas.contains("Acerola"));


//        Queue<String> FilaBanco = new LinkedList<>();
//        Queue<String> FilaPreferencial = new PriorityQueue();
//
//        FilaBanco.add("Ana");
//        FilaBanco.add("Fernando");
//        FilaBanco.add("Bento");
//        FilaPreferencial.add("Danilo");
//        FilaPreferencial.add("Emilia");
//
//        FilaBanco.addAll(FilaPreferencial);
//
//        for (int i = 1; i < 6; i++) {
//            System.out.println("Na fila do banco tem " + FilaBanco.size() + " Pessoas a serem atendidas" +
//                    " e sao essas por ordem de chegada: ");
//            System.out.println(FilaBanco);
//
//            if (FilaPreferencial.contains("Danilo") || FilaPreferencial.contains("Emilia")){
//                System.out.println("Fila Preferencial: " + FilaPreferencial);
//                System.out.println(FilaPreferencial.poll() + " foi atendido ");
//                FilaBanco.remove("Danilo");
//                if (FilaPreferencial.contains("Emilia") || FilaPreferencial.size() == 1){
//                    System.out.println(FilaPreferencial.poll() + " foi atendido ");
//                    FilaBanco.remove("Emilia");
//                }
//                System.out.println();
//
//            } else if (i < 5) {
//                System.out.println("\nAgora tem " + FilaBanco.size() + " Pessoas na fila");
//                System.out.println("\n" + FilaBanco.poll() + " foi atendido");
//
//            } else {
//                System.out.println("Todas as pessoas foram atendidas");
//            }
//
//
//        }


        Deque<String> livros = new ArrayDeque<>();

        livros.push("Turma da Monica");
        livros.push("Biblia");
        livros.push("Como Fazer Amigos e Influencia Pessoas");
        livros.push("Clean Code");
        livros.push("O Senhor dos Anéis");

        System.out.println(livros);
        System.out.println("livro no topo da pilha: " + livros.peek());

        input.close();

    }

}
