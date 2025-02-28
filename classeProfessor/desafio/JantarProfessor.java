package classeProfessor.desafio;

public class JantarProfessor {

    public static void main(String[] args) {

        ComidaProfessor c1 = new ComidaProfessor("Arroz", 0.180);
        ComidaProfessor c2 = new ComidaProfessor("Feijao", 0.300);

        PessoaProfessor p = new PessoaProfessor("Joao", 99.8);

        System.out.println(p.apresentar());
        p.comer(c1);

        System.out.println(p.apresentar());
        p.comer(c2);

        System.out.println(p.apresentar());
    }
}
