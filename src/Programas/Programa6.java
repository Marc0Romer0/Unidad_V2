
package Programas;

import java.util.Scanner;

/**
 *
 * @author Marcoromero
 */
public class Programa6 {
    public void procedimiento6() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresa un numero ");
        int a = sc.nextInt();
        if(a%2==0)
        {
             System.out.println(a+" es par");
        }
        else{
            System.out.println(a+" es impar");
        }
    }
}
