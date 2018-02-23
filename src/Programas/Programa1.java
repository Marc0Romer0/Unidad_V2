
package Programas;
import java.util.Scanner;
/**
 *
 * @author Marcoromero
 */
public class Programa1 {
   public void procedimiento1(){
      Scanner sc= new Scanner(System.in);
      System.out.println("Escribe la base: ");
      int base = sc.nextInt();
      System.out.println("Escribe la altura: ");
      int height = sc.nextInt();	
      int x = (base * height)/1/2;
      System.out.println("Area: "+x);
    }
          
}
