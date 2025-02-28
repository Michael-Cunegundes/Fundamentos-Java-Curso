package colecoes;

import java.util.*;

public class DesafiosGptSecao6 {
    public static void main(String[] args) {



//        HashSet <String> alunos = new HashSet<>();
//
//        alunos.add("Michael");
//        alunos.add("Caio");
//        alunos.add("Nicolas");
//        alunos.add("Victoria");
//        alunos.add("Rafael");
//        alunos.add("Rafael");
//
//        System.out.println("Lista de alunos: " + alunos);
//
//        System.out.print("\nBuscar um aluno na lista: ");
//        String busca = input.nextLine();
//
//        if (alunos.contains(busca)) {
//            System.out.println("O aluno " + busca + " esta presente na lista");
//        } else {
//            System.out.println("O aluno " + busca + " nao foi encontrado");
//        }




//        Queue<String> fila = new LinkedList<>();
//
//        // Adicionando pessoas à fila
//        fila.add("Michael");
//        fila.add("Caio");
//        fila.add("Nicolas");
//        fila.add("Victoria");
//        fila.add("Rafael");
//        fila.add("Manuela");
//
//        // Simulando o atendimento
//        while (!fila.isEmpty()) {
//            System.out.println("\n📌 Fila atual (" + fila.size() + " pessoas): " + fila);
//
//            // Atendendo a primeira pessoa da fila
//            String atendido = fila.poll();
//            System.out.println("✅ " + atendido + " foi atendido. Agora restam " + fila.size() + " pessoas na fila.");
//
//            // Simulando tempo de atendimento (opcional)
//            Thread.sleep(1000);
//        }
//
//        // Mensagem final
//        System.out.println("\n🎉 Todas as pessoas foram atendidas! A fila está vazia.");


//
//        Map<Long, String> usuario  = new HashMap<>();
//
//        usuario.put(50234105879L, "Michael");
//        usuario.put(81821148029L, "Victoria");
//        usuario.put(67531478021L, "Nicolas");
//        usuario.put(25223345061L, "Sarah");
//
//        System.out.print("Lista de Usuarios: ");
//
//        for (String valor : usuario.values()){
//            System.out.print(valor + ", ");
//
//        }
//
//        System.out.print("\nBuscar um usuario pelo CPF: ");
//        Long cpf = input.nextLong();
//
//
//        if (usuario.containsKey(cpf) == true){
//            System.out.println("Usuario com este CPF: " + usuario.get(cpf));
//        } else {
//            System.out.println("Usuario nao localizado");
//        }
//
//

        Scanner input = new Scanner(System.in);
        List<String> alunos = new ArrayList<>();

        // Adicionando alunos
        alunos.add("Michael");
        alunos.add("Caio");
        alunos.add("Nicolas");
        alunos.add("Victoria");
        alunos.add("Rafael");
        alunos.add("Manuela");

        // Exibir a lista de alunos
        System.out.println("\n📋 Lista de alunos:");
        for (String nome : alunos) {
            System.out.println("- " + nome);
        }

        // Variáveis para cálculo de média, maior e menor nota
        double media = 0;
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        String nomemaior = "";
        String nomemenor = "";

        // Captura de notas
        for (int i = 0; i < alunos.size(); i++) {
            System.out.print("\nDigite a nota de " + alunos.get(i) + ": ");
            double nota = input.nextDouble(); // Lendo a nota

            media += nota; // Somando para cálculo da média

            // Verifica maior nota
            if (nota > maior) {
                maior = nota;
                nomemaior = alunos.get(i);
            }

            // Verifica menor nota
            if (nota < menor) {
                menor = nota;
                nomemenor = alunos.get(i);
            }
        }

        // Exibição dos resultados formatados
        System.out.printf("\n📊 Média da sala: %.1f\n", media / alunos.size());
        System.out.printf("🏆 Maior nota: %s com %.1f\n", nomemaior, maior);
        System.out.printf("📉 Menor nota: %s com %.1f\n", nomemenor, menor);

        input.close();
    }
}
