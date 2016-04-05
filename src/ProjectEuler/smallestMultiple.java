package ProjectEuler;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 3/17/2016.
 */
public class smallestMultiple {
    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        //int [] multiple = new int [1000000];
        ArrayList <Integer> setOfInputs = new ArrayList<>();
        ArrayList <Integer> setOfNumbers = new ArrayList<>();
        int value = 100;

        for (int i = 1; i <= value; i++){
            for (int j = 1; j <= N; j++){
                for ( int k = 1; (i % j) == 0; k++)
                    setOfNumbers.add(i);
            }
        }System.out.println(setOfNumbers.toString());
    }
}
