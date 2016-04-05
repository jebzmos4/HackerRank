package Strings;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/1/2016.
 */
public class Reverse {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        String A = in.next();
        StringBuilder input = new StringBuilder();
        input.append(A);
        input = input.reverse();
        if ( input.toString().equalsIgnoreCase(A)){
            System.out.println("Yes");
        }else
            System.out.println("No");
    }
}
