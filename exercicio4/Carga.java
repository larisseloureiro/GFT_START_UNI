package exercicio4;

/**
 *
 * @author Larisse
 */
public class Carga  {
    protected float valor, peso;

    public Carga() {
        this.valor = valor;
        this.peso = peso;
    }

    public Carga(float valor, float peso) {
        this.valor = valor;
        this.peso = peso;
    }
    
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Carga{" + "valor=" + valor + ", peso=" + peso + '}';
    }
          
    
}
