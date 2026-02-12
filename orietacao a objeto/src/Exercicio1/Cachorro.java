package Exercicio1;

public class Cachorro {

    public String nome;
    public String sexo;
    public String raca;
    public int idade;

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                ", sexo='" + sexo + '\'' +
                ", raca='" + raca + '\'' +
                ", idade=" + idade +
                '}';
    }

    public Cachorro(String nome, String sexo, String raca, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.raca = raca;
        this.idade = idade;


    }
}

