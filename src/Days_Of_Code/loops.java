package Days_Of_Code;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/4/2016.
 */
public class loops {
    public static  void main (String []args){
        Scanner in = new Scanner(System.in);

        int N = in .nextInt();
        int i = in.nextInt();

        for (int j = 1; j <= i; j++){
            System.out.print( N + " * " + j + " = ");
            System.out.print( N * j);
            System.out.println();
        }
    }
}
