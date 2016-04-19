package Algorithm;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/18/2016.
 */
public class UtopianTree {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int height = 0;
        for(int i = 0; i < t; i++){
            int N = in.nextInt();
            if( N % 2 == 0)
                height = (int)(Math.pow(2, N / 2) - 1) * 2 + 1;
            else
                height = (int)(Math.pow(2, N / 2 + 1) - 1 ) * 2;

            System.out.println(height);
        }
    }
}
