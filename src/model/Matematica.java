package model;

public class Matematica {
    public int valorA;
    public int valorB;
    public int valorC;
    public int valorD;

    public int calculaProdutoAB(){
        return (this.valorA*valorB);
    }

    public int calculaMultiplicação(){
        return (calculaProdutoAB()* this.valorC);
    }

    public int calcularModulo(){
        return valorD%valorA;
    }

    public String mostrarDados(){
        return "\nValor A: "+this.valorA+
                "\nValorB: "+this.valorB+
                 "\nValorC: "+this.valorC+
                  "\nResultado do Produto: "+this.calculaProdutoAB()+
                   "\nResultado da Multiplicação: "+this.calculaMultiplicação()+
                     "\nResto da Divisao "+this.calcularModulo();
    }

}
