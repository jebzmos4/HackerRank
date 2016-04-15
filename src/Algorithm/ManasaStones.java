package Algorithm;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/15/2016.
 */
public class ManasaStones {
    public static int addA(int n, int a){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += a;
        }return sum;
    }
    public static int addB(int n, int b){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += b;
        }return sum;
    }
    public static int addAB(int n, int a, int b){
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum += a;
        }return sum;
    }
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int init = 0;
        int n = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        for (int i = 0; i < n; i++){
            init += a;
        }
    }
}
