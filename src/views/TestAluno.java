package views;

import model.Aluno;

import java.util.Scanner;

public class TestAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.println("Digite as notas respectivamente");
        aluno.nota1= ler.nextDouble();
        aluno.nota2 = ler.nextDouble();
        aluno.nota3 = ler.nextDouble();

        System.out.println(aluno.mostrarDados());

    }
}
