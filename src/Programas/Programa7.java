
package Programas;

import java.util.Scanner;

/**
 *
 * @author Marcoromero
 */
public class Programa7 {
    public void procedimiento7() {
        Scanner sc=new Scanner(System.in);
      String numero[]={"I", "II", "III", "IV", "V", "VI", "VII"};
      System.out.println("poner un numero del 1 al 7: ");
      int n= sc.nextInt();
      if(n >= 1 && n <= 7){
          System.out.println("EL NUMERO  "+n+" es:  "+numero[n-1]);
    }
    } 
}
