
package Programas;

import java.util.Scanner;

/**
 *
 * @author Marcoromero
 */
public class Programa5 {
    public void procedimiento5() {
    Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Introduce un número:");
        numero = sc.nextInt();
       if (numero<=50)
        System.out.println("Doble: "+ 2*numero);
       else if (numero>=50)
        System.out.println("Triple: " + 3*numero);
    }
}
