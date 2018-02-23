
package Programas;

import java.util.Scanner;

/**
 *
 * @author Marcoromero
 */
public class Programa10 {
    public void procedimiento10(){
        Scanner sc= new Scanner (System.in);
        System.out.println("numero: ");
        int x= sc.nextInt();
        int r=1;
        for (int y=0; y<x+1; y++){
            if (y==0){
        y = 1;
            }
            r= r * y;
        }
          System.out.println("resultado: " +r);
          
                
        
    }
   
   
    
}
