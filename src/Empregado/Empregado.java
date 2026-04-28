package Empregado;

public abstract class Empregado {
    long matricula;
    String nome;

    public Empregado(long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Empregado{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                '}';
    }
}
