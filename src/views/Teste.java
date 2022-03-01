package views;
import model.Matematica;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Matematica mat = new Matematica();
        System.out.println("Digite o valor de A: ");
        mat.valorA = ler.nextInt();
        System.out.println("Digite o valor de B: ");
        mat.valorB = ler.nextInt();
        System.out.println("Digite o valor de C: ");
        mat.valorC = ler.nextInt();
        System.out.println("Digite o valor de D:");
        mat.valorD = ler.nextInt();
        System.out.println(mat.mostrarDados());
    }
}
