package Days_Of_Code;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/2/2016.
 */
public class Conditions {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n % 2 != 0) {
            System.out.println("Weird");
        }else if ((n % 2 == 0) && n > 2 && n <= 5){
            System.out.println("Not Weird");
        }else if ((n % 2 == 0) && n > 5 && n <= 20){
            System.out.println("Weird");
        }else if ((n % 2 == 0) && n > 20){
            System.out.println("Not Weird");
        }
    }
}
