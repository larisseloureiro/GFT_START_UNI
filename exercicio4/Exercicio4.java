package exercicio4;


/**
 *
 * @author Larisse
 */
public class Exercicio4 {

    public static void main(String[] args) {
       
       Caminhao c = new Caminhao(1000f,100f);
       
       Vagao v = new Vagao(18850f,27500f);
        System.out.println(v);
        System.out.println(c);
        
        v.calculaFrete();
        c.calculaFrete();
        
}
}
