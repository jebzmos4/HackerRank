package Strings;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 3/31/2016.
 */
public class Compare {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        String input = in.next();
        int k = in.nextInt();
        //String array [] = new String[input.length()];
        String max = input.substring(0,k);
        String min = input.substring(0,k);

        for(int i = 0; i + k <= input.length(); i++){
            if(input.substring(i, i+k).compareTo(min) < 0) min = input.substring(i, i+k);
            if(input.substring(i, i+k).compareTo(max) > 0) max = input.substring(i, i+k);
        }

        System.out.println(min);
        System.out.println(max);
    }
}
