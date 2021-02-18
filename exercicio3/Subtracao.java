package exercicio3;

/**
 *
 * @author Larisse
 */
public class Subtracao extends Operacao {

    @Override
    public void efetuarOperacao(float x, float y) {
        if (x == 0 || y == 0) {
            System.out.println("A operação não será possível");
        } else {
            float sub = x - y;
            System.out.println("Resultado da subtração: " + sub);
        }
    }
}
