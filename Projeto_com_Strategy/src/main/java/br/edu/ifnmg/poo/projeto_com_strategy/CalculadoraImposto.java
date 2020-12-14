package br.edu.ifnmg.poo.projeto_com_strategy;

public class CalculadoraImposto {
    
    public double calcular(Imposto imposto){
        return imposto.calcular();
    }
    
    /**
     * Código limpo, Coeso, Simples e Eficiente.
     * Polimorfismo, estamos passando a interface como parâmetro do método,
     * agora qualquer classe que implementa Imposto pode ser passada para o
     * método.
     */
}
