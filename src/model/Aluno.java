package model;

public class Aluno {

    public double nota1;
    public double nota2;
    public double nota3;

    public double calcularMediaSimples() {
        return (nota1 + nota2 + nota3) / 3;
    }

    public String mostrarDados() {
        return "\nNota 1: " +this.nota1+
                "\nNota 2: "+this.nota2+
                "\nNota 3: "+this.nota3+
                "\nMédia Final: " + this.calcularMediaSimples();
    }
}
