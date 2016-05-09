package Strings;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/6/2016.
 */
public class AlternatingCharacters {

    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int k = 0; k < T; k++){
            String input = in.next();
            int j = 0;
            for (int i = 0; i < input.length(); i++){
                if ( (i + 1) < input.length()){
                    if (String.valueOf(input.charAt(i)).equalsIgnoreCase(String.valueOf(input.charAt(i+1)))){
                        input.replace(String.valueOf(input.charAt(i+1)),"");
                        j += 1;
                    }
                }
            }
            System.out.println(j);

        }
    }
}
