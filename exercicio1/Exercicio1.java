package exercicio1;

import java.util.Scanner;
/**
 *
 * @author Larisse
 */
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int a, b, c;
        
        System.out.println("Digite o valor do primeiro número: ");
        a = x.nextInt();
        System.out.println("Digite o valor do segundo número: ");
        b = x.nextInt();
        System.out.println("Digite o valor do terceiro número: ");
        c = x.nextInt();
        
        if( a > b && a > c){
            System.out.println(a + " é o maior número!");
        } else if(b > a && b > c){
            System.out.println(b + " é o maior número!");
        } else if(c > a && c > b){
            System.out.println(c + " é o maior número!");
        } else if(a==b && a==c && b==c){
            System.out.println("Os números são iguais!");
        }
    }
}
