package br.edu.ifnmg.poo.projeto_com_strategy;

public class Program {

    public static void main(String[] args) {
        CalculadoraImposto calculadora = new CalculadoraImposto();
        
        ICMS icms = new ICMS(100.0);
        IPI ipi = new IPI(100.00);
        OUTRO outro = new OUTRO(100.00);
        
        System.out.println(calculadora.calcular(icms));
        System.out.println(calculadora.calcular(ipi));
        System.out.println(calculadora.calcular(outro));
    }
    
    /**
     * Código padrão e orientado a objetos, se futuramente surgir novos impostos
     * será necessário apenas criar uma nova classe e tudo continuará
     * funcionando.
     */
}
