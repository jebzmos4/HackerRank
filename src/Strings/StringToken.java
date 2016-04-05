package Strings;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/4/2016.
 */
public class StringToken {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String delims = "[ .,?'!@]+";
        String[] tokens = input.split(delims);
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++){
            System.out.println(tokens[i]);
        }

    }
}
