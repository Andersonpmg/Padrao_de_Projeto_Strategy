package br.edu.ifnmg.poo.projeto_com_strategy;

//public class ICMS{
        
public class ICMS implements Imposto {

    private double valor;
    
    public ICMS(double valor){
        this.valor = valor;
    }
    
    @Override
    public double calcular(){
        return this.valor * 0.10;
    }
}
