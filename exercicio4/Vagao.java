package exercicio4;

/**
 *
 * @author Larisse
 */
public class Vagao extends Transporte {
    protected float frete;

    public Vagao(float frete) {
        this.frete = frete;
    }

    Vagao(float f, float f0) {
    }
    
 
    @Override
    public void calculaFrete(){
        frete = (float) ((carga.valor*0.1)+(carga.peso*0.2));
        if(carga.peso < 15.000)
        {
          frete+=5000;
        }
        System.out.println(frete);
    }

}
