package br.edu.ifnmg.poo.projeto_com_strategy;

//public class OUTRO{        
        
public class OUTRO implements Imposto{
    
    private double valor;
    
    public OUTRO(double valor){
        this.valor = valor;
    }
    
    @Override
    public double calcular(){
        return this.valor * 0.50;
    }
}
