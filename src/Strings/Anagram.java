package Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/4/2016.
 */
public class Anagram {

    static boolean isAnagram(String A, String B) {
        if(A != null && B != null) {
            char[] arrayA = A.toLowerCase().toCharArray();
            char[] arrayB = B.toLowerCase().toCharArray();
            Arrays.sort(arrayA);
            Arrays.sort(arrayB);
            if ( Arrays.equals(arrayA, arrayB)){
                return true;
            }
        }return false;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        boolean ret = isAnagram(A,B);
        if(ret){
            System.out.println("Anagrams");
        }
        else
            System.out.println("Not Anagrams");

    }
}
