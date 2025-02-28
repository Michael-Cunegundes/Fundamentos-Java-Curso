package classe;

public class Comida {

    private String nomeDaComida;
    private double pesoDaComida;

    public Comida(){
        this.nomeDaComida = "Pizza";
        this.pesoDaComida = 0.6;
    }

    public Comida (String nomeDaComida , double pesoDaComida){
        this.nomeDaComida = nomeDaComida;
        this.pesoDaComida = pesoDaComida;
    }

    public String getNomeDaComida(){
        return nomeDaComida;
    }

    public double getPesoDaComida(){
        return pesoDaComida;
    }


}

