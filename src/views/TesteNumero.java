package views;


import model.Numero;
import java.util.Scanner;
public class TesteNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numero numero = new Numero();

        System.out.println("Digite o Valor 1");
        numero.valor1 = ler.nextDouble();
        System.out.println("Digite o Valor 2");
        numero.valor2 = ler.nextDouble();

        System.out.println(numero.mostrarDados());
    }
}
