package Algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/19/2016.
 */
public class Cut_the_Sticks {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        ArrayList <Integer> array = new ArrayList<>();
        for (int i = 0; i < N; i++){
            array.add(in.nextInt());
        }
        Collections.sort(array);

        for(int i = 0; i < array.size(); i++){
            if( array.get(0) == 0) {
                array.remove(0);
                i = -1;
                continue;
            }
            System.out.println(array.size());
            int min = array.get(0);
            for(int j = 0; j < array.size(); j++){
                array.set( j , array.get(j)-min);
            }
        }
        for (int j = 0; j < array.size(); j++){
            if (array.get(j) > 0){
            System.out.print(array.get(j) + " ");
            }
        }

    }
}
