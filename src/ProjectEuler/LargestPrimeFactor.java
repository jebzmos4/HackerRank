package ProjectEuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 3/7/2016.
 */
public class LargestPrimeFactor {
    public static Long prime( long input){
        ArrayList<Long> arrInput = new ArrayList<>();
        for ( long i = 1; i < input; ++i){
            if (input % i == 0){
                arrInput.add(i);
            }
        }if (arrInput.size() == 1){
            return(input);
        }else
            return (Collections.max(arrInput));
    }

    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
       Long arrOutput [] = new Long[T];
        for (int i = 0; i < T; i++){
            long input = in.nextLong();
            arrOutput[i] = prime(input);
        }for (int p = 0; p < arrOutput.length; p++){
            System.out.println(arrOutput[p]);
        }
    }
}
