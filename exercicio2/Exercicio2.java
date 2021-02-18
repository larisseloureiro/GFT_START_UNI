package exercicio2;

import java.util.Scanner;

/**
 *
 * @author Larisse
 */
public class Exercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        int qntVezes = 0;
        final String in = "Incomoda";

        for (int i = 1; qntVezes < i; i++) {
            System.out.println("informe quantas vezes o elefante incomoda: ");
            qntVezes = x.nextInt();
        }
        for (int cont = 0; cont < qntVezes; cont++) {
            System.out.println("Incomoda");
        }
        System.out.println("muito mais");

    }

}
