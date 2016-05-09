import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/5/2016.
 */
public class BinaryAlgorithm {
    public static Integer binary (int N){
        ArrayList <Integer> bin = new ArrayList<>();
            while (N > 1) {
                bin.add(N % 2);
                N = N/2;
            }
        for (int j: bin)
            System.out.println(bin.get(j));
        return 1;
    }
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        System.out.println(binary(N));
    }
}
