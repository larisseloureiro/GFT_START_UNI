package exercicio3;

import java.util.Scanner;

/**
 *
 * @author Larisse
 */
public class Exercicio3 {

    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       Soma somar = new Soma();
       Subtracao sub = new Subtracao();
       Multiplicacao mult = new Multiplicacao();
       Divisao div = new Divisao();
       
       float x,y;
       
        System.out.println("Digite um número: ");
        x = sc.nextFloat();
        System.out.println("Digite outro número: ");
        y = sc.nextFloat();

        somar.efetuarOperacao(x, y);
        System.out.println("======================");
        sub.efetuarOperacao(x, y);
        System.out.println("======================");
        mult.efetuarOperacao(x, y);
        System.out.println("======================");
        div.efetuarOperacao(x, y);
        
    }
}
