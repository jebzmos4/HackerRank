package Days_Of_Code;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/9/2016.
 */
    class Factorial {
        int factorial(int n) {
            if ( n == 1)
                return 1;
            return  factorial (n-1) * n;
        }
    }
    public class Recursion {
         public static void main(String []args){
             Scanner in = new Scanner(System.in);
             Factorial fact = new Factorial();
             int n = in.nextInt();
             if (n != 1){
                System.out.println(fact.factorial(n));
            }else
                System.out.println(1);
    }
}

