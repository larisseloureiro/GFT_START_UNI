package exercicio3;

/**
 *
 * @author Larisse
 */
public class Multiplicacao extends Operacao {

    @Override
    public void efetuarOperacao(float x, float y) {
        if (x == 0 || y == 0) {
            System.out.println("A operação não será possível");
        } else {
            float mult = x * y;
            System.out.println("Resultado da multiplicação: " + mult);
        }

    }
}
