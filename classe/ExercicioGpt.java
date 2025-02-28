package classe;

public class ExercicioGpt {

    public static void main(String[] args) {


        System.out.println("\nExercício: Gerenciamento de Funcionários\n");
        System.out.println("---------------------------------");
        System.out.println("Novos salarios com o reajuste");
        System.out.println("---------------------------------");

        FuncionarioGPT f1 = new FuncionarioGPT("Joao", 13000, 25);

        FuncionarioGPT f2 = new FuncionarioGPT("Larrisa", 14000, 37);

        FuncionarioGPT f3 = new FuncionarioGPT("Michael", 6400, 22);


        f1.exibirInformacoes();
        f1.aumentarSalario(10);
        f1.novoSalario();

        f2.exibirInformacoes();
        f2.aumentarSalario(14);
        f2.novoSalario();

        f3.exibirInformacoes();
        f3.aumentarSalario(16);
        f3.novoSalario();


    }
}