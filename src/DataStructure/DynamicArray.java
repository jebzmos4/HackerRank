package DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/5/2016.
 */
public class DynamicArray {
    // method to convert input to
    public static int binary (int N){
        ArrayList <Integer> bin = new ArrayList<>();
        while (N > 1) {
            bin.add(N % 2);
            N = N/2;
        }
        for (int j: bin)
            System.out.println(bin.get(j));
        return 1;
    }
    public static int data(int N, int x, int y){
        List<String> seqList = new ArrayList<>(N);
        int lastAns = 0;
        lastAns =  (binary(x) ^ lastAns) % N;
        return lastAns;
    }
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(data(N, x, y));
    }
}
