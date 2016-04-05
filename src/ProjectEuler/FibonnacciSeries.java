package ProjectEuler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by Morifeoluwa on 3/7/2016.
 */
public class FibonnacciSeries {

    public static Long fib(long N) {
        long a = 1;
        long b = 2;
        long answer = 2;
        ArrayList<Long> fibs = new ArrayList<>();

        for (long i = 2; i < N; ++i) {
            i = a + b;
            fibs.add(i);
            a = b;
            b = i;
        }

        for ( long i : fibs) {
            if (i % 2 == 0 && i < N) {
                answer += i;
            }
        }return answer;
    }

    public static void main (String []args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        long N = 0;
        long arr [] = new long[T];
        int i =0;
        for (i = 0; i < T; i ++){
            N = in.nextLong();
            arr[i] = fib(N);
        }
        for (int p = 0; p < arr.length; p++){
            System.out.println(arr[p]);
        }


    }

}
