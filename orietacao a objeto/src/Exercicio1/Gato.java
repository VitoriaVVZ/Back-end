package Exercicio1;

public class Gato {

    public String nomee;
    public String sexoo;
    public String racaa;
    public int idadee;

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nomee + '\'' +
                ", sexo='" + sexoo + '\'' +
                ", raca='" + racaa + '\'' +
                ", idade=" + idadee +
                '}';
    }

    public Gato(String nome, String sexo, String raca, int idade) {
        this.nomee = nome;
        this.sexoo = sexo;
        this.racaa = raca;
        this.idadee = idade;


    }
}

