package ProjectEuler;

/**
 * Created by Morifeoluwa on 3/21/2016.
 */
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Random;
public class Palindrome {

    public static Integer product(int a, int b ){

     return a * b ;
    }

    public static void main(String []args){
        ArrayList <Integer> setOfNumbers = new ArrayList<>();
        ArrayList <Integer> setOfProducts = new ArrayList<>();
        int [] setOfOutput = new int [1000];
        for (int i = 100; i < 1000; i++){
            setOfNumbers.add(i);
        }

        for (int i : setOfNumbers){
            for (int k : setOfNumbers){
            System.out.print( (product(setOfNumbers.get(i), setOfNumbers.get(i))) + " " );
            }
        }
    }
}
