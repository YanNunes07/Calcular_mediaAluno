package model;

public class AlunoMediaPonderada {
    // notas:   10 ,   8,    3
    public double nota1, nota2, nota3;

    // pesos: 3,   2,    5
    public double peso1, peso2, peso3;

    public double calcularMedia(){
        return ((nota1*peso1)+(nota2*peso2)+(nota3*peso3))/(peso1+peso2+peso3);
    }
    public String mostrarResultados(){
        return "\nMédia Final: "+this.calcularMedia();

    }
}
