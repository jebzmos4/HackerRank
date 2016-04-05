package ProjectEuler;

import java.util.Scanner;
import java.util.ArrayList;


public class SumOfMultiples {

    public static Long multiples(long value){
        long i = 0;
        long answer = 0;
        ArrayList<Long> input = new ArrayList<>();
        for (i = 0; i < value; i++){
            input.add(i);
        }
        for ( long j : input) {
            if (j % 3 == 0 || j % 5 == 0){
                answer = answer + j;
            }
        }return answer;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        long N = 0;
        long N1 [] = new long [T];
        int i = 0;
        for(i = 0; i < T; i++){
            N = in.nextLong();
            N1[i] = N;
        }for (int k = 0; k < T; k++){
            System.out.println(multiples(N1[k]));
        }
    }
}