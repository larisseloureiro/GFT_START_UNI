package exercicio4;

/**
 *
 * @author Larisse
 */
public abstract class Transporte {
    protected Carga carga;
    
    public void calculaFrete(){
        
    }

    public Carga getCarga() {
        return carga;
    }

    public void setCarga(Carga carga) {
        this.carga = carga;
    }
    
}
