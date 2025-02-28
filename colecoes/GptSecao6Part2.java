package colecoes;

import java.util.*;

public class GptSecao6Part2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        HashSet<String> Contatos = new HashSet<>();

        int comando = 0;

        while (comando != 5) {
            System.out.print("\n📞 Digite:\n 1 para ver a Agenda de Contatos\n 2 para adicionar um contato\n 3 para remover um contato \n 4 para pesquisar um contato \n 5 para sair: ");
            comando = input.nextInt();
            input.nextLine(); // Para evitar problemas ao ler strings depois de números

            if (comando == 1) {
                if (Contatos.isEmpty()) {
                    System.out.println("\nA agenda está vazia.");
                } else {
                    System.out.println("\n" + Contatos.size() + " contatos na agenda:");
                    for (String contato : Contatos) {
                        System.out.println("- " + contato);
                    }
                }
            }

            else if (comando == 2) {
                System.out.print("\nDigite o telefone ou nome do contato: ");
                String addcontato = input.nextLine().trim();

                if (Contatos.add(addcontato)) {
                    System.out.println("\n✅ Contato '" + addcontato + "' adicionado com sucesso!");
                } else {
                    System.out.println("\n⚠️ Contato já existe na agenda.");
                }
            }

            else if (comando == 3) {
                if (Contatos.isEmpty()) {
                    System.out.println("\n📭 A agenda está vazia.");
                } else {
                    System.out.println("\n📌 Contatos na agenda: " + Contatos);
                    System.out.print("\nDigite o contato que deseja remover: ");
                    String removercontato = input.nextLine().trim();

                    if (Contatos.remove(removercontato)) {
                        System.out.println("\n✅ Contato '" + removercontato + "' removido com sucesso!");
                    } else {
                        System.out.println("\n⚠️ Contato não encontrado na agenda.");
                    }
                }
            }

            else if (comando == 4) {
                if (Contatos.isEmpty()) {
                    System.out.println("\n📭 A lista está vazia.");
                } else {
                    System.out.print("\n🔎 Digite o contato para pesquisa: ");
                    String pesquisacontato = input.nextLine().trim();

                    if (Contatos.contains(pesquisacontato)) {
                        System.out.println("\n✅ O contato '" + pesquisacontato + "' está na agenda.");
                    } else {
                        System.out.println("\n❌ O contato '" + pesquisacontato + "' não foi encontrado.");
                    }
                }
            }

            else if (comando == 5) {
                System.out.println("\n📴 Programa finalizado. Até mais!");
            }

            else {
                System.out.println("\n⚠️ Opção inválida. Tente novamente.");
            }
        }

        input.close();
    }
}
