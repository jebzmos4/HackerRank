package Days_Of_Code;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/4/2016.
 */
public class Review {
    public static String review(String N){

        for (int i = 0; i < N.length(); i++){
            if ((i % 2) == 0){
                System.out.print(String.valueOf(N.charAt(i)) );
            }
        }
        System.out.print(" ");
        for (int i = 0; i < N.length(); i++){
            if ((i % 2) != 0){
                System.out.print(String.valueOf(N.charAt(i)) );
            }
        }return "\n";
    }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++){
            String N = in.next();
            System.out.println(review(N));
        }
    }
}
