
package Principal;

import Programas.Programa1;
import Programas.Programa2;
import Programas.Programa3;
import Programas.Programa4;
import Programas.Programa5;
import Programas.Programa6;
import Programas.Programa7;
import Programas.Programa8;
import Programas.Programa9;
import Programas.Programa10;
import java.util.Scanner;

/**
 *
 * @author Marcoromero
 */
public class Menu {
    public static void main(String[] args) {
        System.out.println("Menu:");
        for (int i =1; i <=10; i ++)
        System.out.println("Programa:"+i);
        System.out.println("Que programa vas a ejecutar: ");
        int operation= new Scanner(System.in).nextInt();
        switch (operation){
            case 1:
                Programa1 x=new Programa1();
                x.procedimiento1();
                break;
            case 2:
                Programa2 y=new Programa2();
                y.procedimiento2();
                break;
            case 3:
                Programa3 q=new Programa3();
                q.procedimiento3();
                break;
            case 4:
                Programa4 w=new Programa4();
                w.procedimiento4();
                break;
            case 5:
                Programa5 e=new Programa5();
                e.procedimiento5();
                break;
            case 6:
                Programa6 r=new Programa6();
                r.procedimiento6();
                break;
            case 7:
                Programa7 t=new Programa7();
                t.procedimiento7();
                break;
            case 8:
                Programa8 u=new Programa8();
                u.procedimiento8();
                break;
            case 9:
                Programa9 o=new Programa9();
                o.Procedimiento9();
                break;
            case 10:
                Programa10 p=new Programa10();
                p.procedimiento10();
                break;
        }
        
        
    }
}
