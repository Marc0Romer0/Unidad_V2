
package Programas;

import java.util.Scanner;

/**
 *
 * @author Marcoromero
 */
public class Programa2 {
    public void procedimiento2() {
        Scanner sc= new Scanner(System.in);
        System.out.println("introduce numero: ");
        double x= sc.nextInt();
        double iva= 0.16;
        double y= iva*x+x;
        System.out.println("Resultado:"+y);
    }
}
