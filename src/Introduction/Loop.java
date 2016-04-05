package Introduction;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 3/31/2016.
 */
public class Loop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int line = in.nextInt();

        for (int x = 0;x < line; x++) {

            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            int sum = a;

            for (int i=0;i<n;i++)
            {
                sum+=(int) ((Math.pow(2,i))*b);

                System.out.print(sum+" ");
            }
            System.out.println();
        }
    }
}
