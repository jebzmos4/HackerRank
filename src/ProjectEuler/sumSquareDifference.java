package ProjectEuler;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 3/22/2016.
 */
public class sumSquareDifference {

    public static long sumOfSquare(long N){
       return (long)Math.floor((Math.pow(N, 3.0)/3.0) + (Math.pow(N, 2.0)/2.0) + (N/6.0));
    }

    public static long squareOfSums(long N){
        return (long)Math.floor(Math.pow(((Math.pow(N, 2.0) + N)/2.0), 2.0));
    }


    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        long [] output = new long[T];
        for (int i = 0; i < T; i++){
        long N = in.nextLong();
            output [i] = Math.abs(squareOfSums(N)- sumOfSquare(N));
        }
        for (int k = 0; k < output.length; k++) {
            System.out.println(output[k]);
        }


    }
}
