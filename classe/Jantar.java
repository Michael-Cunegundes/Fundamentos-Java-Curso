package classe;

public class Jantar {


    public static void main(String[] args) {

        Comida c1 = new Comida();
        System.out.printf("\n\nComida c1\n Nome: %s de queijo\n Peso da comida: %.2f gramas", c1.getNomeDaComida(), c1.getPesoDaComida());

        Comida c2 = new Comida("Arroz", 0.4);
        System.out.printf("\n\nComida c2\n Nome: %s\n Peso da comida: %.2f gramas", c2.getNomeDaComida(), c2.getPesoDaComida());

        Pessoa p1 = new Pessoa();
        System.out.printf("\n\nPessoa p1\n Nome: %s\n Peso Inicial %.2f KG\n Peso depois de comer %s: %.2f KG",
                p1.getNomeDaPessoa(),p1.getPesoDaPessoa(),c1.getNomeDaComida(),p1.getPesoDaPessoa());


        Pessoa p2 = new Pessoa("Joao", 80);
        System.out.printf("\n\nPessoa p2\n Nome: %s\n Peso: %.2f kg\n O que comeu: %s\n Peso depois de comer o %s: %.2f kg",
                p2.getNomeDaPessoa(), p2.getPesoDaPessoa(), c2.getNomeDaComida(),c2.getNomeDaComida(),p2.comer(c2.getPesoDaComida()));


        System.out.printf("\n\n%s chegou com %.2f KG, depois de comer %s e ficou com %.2f KG, comeu mais %s de %.2f KG ficou com %.2f KG",
                p2.getNomeDaPessoa(),p2.getPesoDaPessoa() - c2.getPesoDaComida(),c2.getNomeDaComida(), p2.getPesoDaPessoa(), c1.getNomeDaComida(), c1.getPesoDaComida(), p2.comer(c1.getPesoDaComida()));


        System.out.printf("\n\n%s depois de comer %s perbeceu que a comida estava podre, entao ela chegou com %.2f KG, depois de comer ficou com %.2f KG" +
                        ", mas vomitou tudo e voltou a ficar com %.2f KG", p1.getNomeDaPessoa(), c1.getNomeDaComida(), (p1.getPesoDaPessoa()),
                p1.comer(c1.getPesoDaComida()), p1.getPesoDaPessoa() - c1.getPesoDaComida());


    }
}
