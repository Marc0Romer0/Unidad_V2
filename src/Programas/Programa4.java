package Programas;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;
import java.text.ParseException;


/**
 *
 * @author Marcoromero
 */
public class Programa4 {
    public void procedimiento4() {
            String input = "23/12/2014 10:22:12 PM";
      DateFormat df = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
      DateFormat outputformat = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
        System.out.println("hora?: ");
      Date date = null;
      String output = null;
      try{
    	 date= df.parse(input);
    	 output = outputformat.format(date);
    	 System.out.println(output);
      }catch(ParseException pe){
         pe.printStackTrace();
    }
    }
}
