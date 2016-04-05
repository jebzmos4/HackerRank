package Strings;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 3/31/2016.
 */
public class Intro {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int sum;
        System.out.println( sum = A.length() + B.length());
        int compare = A.compareToIgnoreCase(B);
        String order = null;
        if ( compare > 0){
            System.out.println(order = "YES");
        }else
            System.out.println(order = "NO");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1,A.length()) + " "
                + B.substring(0,1).toUpperCase() + B.substring(1,B.length()));

    }
}
