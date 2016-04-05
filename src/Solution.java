import com.sun.xml.internal.fastinfoset.util.CharArray;

import java.sql.Array;
import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.Date;
import java.text.ParseException;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.trim();
        if ( (input.length() > 400000) || (input.length() == 0)){
            System.out.println("");
        }
        String delims = "[ .,?'!@]+";
        boolean returnDelims = true;
        StringTokenizer st = new StringTokenizer(input,delims, returnDelims);
        System.out.println(st.countTokens());
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
            }
    }
}