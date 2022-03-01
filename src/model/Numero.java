package model;

public class Numero {

    public double valor1;
    public double valor2;

    //verificando o valor máximo
    public double verificarValorMaximo(){
        return Math.max(valor1,valor2);
    }
    //verificando o valor mínimo
    public double verificarValorMinimo(){
        return Math.min(valor1,valor2);
    }
    // calculando a Raiz Quadrada do valor 1
    public double calcularRaizDoValor1(){
        return Math.sqrt(valor1);
    }
    // calculando a Raiz Cúbica do valor 1
    public double calcularRaizCubicaDoValor2(){
        return Math.cbrt(valor1);
    }
    // calculando a potencia do valor1 elevado na 5
    public double calcularPotencia(){
        return Math.pow(valor1,5);
    }

    public String mostrarDados(){
        return "Valor Máximo: "+verificarValorMaximo()+
                "\nValor Mínimo: "+verificarValorMinimo()+
                "\nRaiz Quadrada: "+calcularRaizDoValor1()+
                "\nRaiz Cúbica: "+calcularRaizCubicaDoValor2()+
                "\nPotencia: "+calcularPotencia();
    }

}


