package exercicio4;
/**
 *
 * @author Larisse
 */
public class Caminhao extends Transporte  {

    public Caminhao() {
       
    }

    Caminhao(float f, float f0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public void calculaFrete(){
        float frete = (float) ((carga.valor*0.3)+(carga.peso*0.12));
         if(carga.peso > 40.000)
        {
            frete *=0.75;
        }
         System.out.println(frete);
    }
}
  