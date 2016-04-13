package Algorithm;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/12/2016.
 */
public class Time_In_Words {
    public static String getWord(int number){

        HashMap<Integer, String> HA = new HashMap();
        HA.put(1, "one"); HA.put(2, "two"); HA.put(3, "three"); HA.put(4, "four");
        HA.put(5, "five"); HA.put(6, "six"); HA.put(7, "seven"); HA.put(8, "eight");
        HA.put(9, "nine"); HA.put(10, "ten"); HA.put(11, "eleven"); HA.put(12, "twelve");
        HA.put(13, "thirteen"); HA.put(14, "fourteen"); HA.put(15, "quarter"); HA.put(16, "sixteen");
        HA.put(17, "seventeen"); HA.put(18, "eighteen"); HA.put(19, "nineteen"); HA.put(20, "twenty");
        HA.put(21, "twenty one"); HA.put(22, "twenty two"); HA.put(23, "twenty three"); HA.put(24, "twenty four");
        HA.put(25, "twenty five"); HA.put(26, "twenty six"); HA.put(27, "twenty seven"); HA.put(28, "twenty eight");
        HA.put(29, "twenty nine");
        return HA.get(number);
    }
    public static void main (String []args){
        Scanner in = new Scanner(System.in);

        int hour = in.nextInt();
        int minute = in.nextInt();
        if ( hour > 12){
            hour = hour - 12;
        }
        switch (minute){
            case 0:
                System.out.println( getWord(hour) + " o' clock ");
                break;
            case 30:
                System.out.println( "half past " + getWord(hour));
                break;
            case 1:
                System.out.println(getWord(minute) + " past "+ getWord(hour));
                break;
            case 15:
                System.out.println( "quarter past " + getWord(hour));
                break;
            case 45:
                System.out.println("quarter to " + getWord(hour + 1));
                break;
        }if ((minute > 1 && minute != 15) && (minute < 30)) {
            System.out.println(getWord(minute) + " minutes past " + getWord(hour));
        }else if ((minute > 30) && (minute != 15) && (minute != 45)) {
            System.out.println(getWord(60 - minute) + " minutes to " + getWord(hour + 1));
        }
    }
}
