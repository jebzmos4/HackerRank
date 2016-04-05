/**
 * Created by Morifeoluwa on 2/18/2016.
 */
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TimeConversion {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();

        //Format of the date defined in the input String
        DateFormat inputFormat = new SimpleDateFormat("hh:mm:ss aa");
        DateFormat inputFormat2 = new SimpleDateFormat("hh:mm:ssaa");

        //Desired format: 24 hour format: Change the pattern as per the need
        DateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
        Date date;
        String output;
        try {
            if( input.equals( ("hh:mm:ssaa" ) ) ){
            date = inputFormat2.parse(input);
            }else{
            date = inputFormat.parse(input);
            }
            output = outputFormat.format(date);
            System.out.println(output);
        }
        catch(ParseException pe){
            pe.printStackTrace();
        }





    }
}
