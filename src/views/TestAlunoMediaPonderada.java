package views;

import model.AlunoMediaPonderada;

import java.util.Scanner;

public class TesteMediaPonderada {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        AlunoMediaPonderada mp = new AlunoMediaPonderada();
        System.out.println("Digite as notas respectivamente: ");
        mp.nota1 = ler.nextDouble();
        mp.nota2 = ler.nextDouble();
        mp.nota3 = ler.nextDouble();
        System.out.println("Digite os pesos de cada avaliação: ");
        mp.peso1 = ler.nextDouble();
        mp.peso2 = ler.nextDouble();
        mp.peso3 = ler.nextDouble();
        System.out.println(mp.mostrarResultados());

    }
}