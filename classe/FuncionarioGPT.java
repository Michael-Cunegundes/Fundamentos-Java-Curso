package classe;

public class FuncionarioGPT {

    String nome;
    double salario;
    int idade;
    double novosalario;

    FuncionarioGPT (String nome , double salario, int idade){
        this.nome = nome;
        this.salario = salario;
        this.idade = idade;

    }

    public void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: R$ " + salario);
        System.out.println("-------------------------");
    }


    public void aumentarSalario (double porcentagem){
         salario += salario * (porcentagem / 100);
        System.out.println(nome + " teve o salário aumentado em " + porcentagem + "%.");
    }

    public void novoSalario(){
        novosalario += salario;
        System.out.println("Novo salario de " + nome + " : R$ " + novosalario + "\n-------------------------");

    }
}
