package ProjectEuler;

/**
 * Created by Morifeoluwa on 3/21/2016.
 */

import java.util.Collections;
import java.util.Scanner;

public class Palindrome {

    public static String palindrome(String input){
        StringBuilder inputBuilder = new StringBuilder();
        inputBuilder.append(input);
        inputBuilder = inputBuilder.reverse();
        return inputBuilder.toString();
    }

    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        System.out.println(palindrome(input));
    }
}
