package Algorithm;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/15/2016.
 */
public class Factorial {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        BigDecimal sum = BigDecimal.ZERO;

        for (int i = 2; i <= N; i++){
            BigDecimal big = new BigDecimal((i));
            big.intValue(i);
            sum += sum.multiply(big);
        }
        System.out.println(big);
    }
}
