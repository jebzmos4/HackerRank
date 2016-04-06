package Algorithm;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Morifeoluwa on 3/10/2016.
 */
public class AngryProfessor {
    public static String isEarly(int [] arrivalTime, int K){
        int sum = 0;
        for (int i = 0; i < arrivalTime.length; i++){
            if (arrivalTime[i] <= 0){
                sum ++;
            }
        }
        if (sum < K){
            return "YES";
        }
        return "NO";
    }
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++){
            int Students = in.nextInt();
            int K = in.nextInt();
            int [] arrivalTime = new int[Students];
            for (int j = 0; j < Students; j++){
                arrivalTime[j] = in.nextInt();
            }
            System.out.println(isEarly(arrivalTime, K));
        }
    }
}