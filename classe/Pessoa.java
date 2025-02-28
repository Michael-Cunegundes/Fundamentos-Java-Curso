package classe;

public class Pessoa {

    private String nomeDaPessoa;
    private double pesoDaPessoa;

    Pessoa(){
        this.nomeDaPessoa = "Maria";
        this.pesoDaPessoa = 75.50;
    }

    Pessoa (String nomeDaPessoa , double pesoDaPessoa){
        this.nomeDaPessoa = nomeDaPessoa;
        this.pesoDaPessoa = pesoDaPessoa;

    }

    public double comer(double pesoDaComida) {
        return this.pesoDaPessoa += pesoDaComida;
    }

    public String getNomeDaPessoa(){
        return nomeDaPessoa;
    }

    public double getPesoDaPessoa() {
        return pesoDaPessoa;
    }
}