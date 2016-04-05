package Introduction;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 3/31/2016.
 */
public class EOF {
    public static void main(String[]args){

        Scanner in = new Scanner(System.in);
        ArrayList<String> arrInput = new ArrayList<>();

        while (in.hasNext()){
            String input = in.nextLine();
            arrInput.add(input);
        }
        for (int j = 0; j < arrInput.size(); j++){
            System.out.print((j + 1) + " ");
            System.out.print( arrInput.get(j) );
            System.out.println();
        }

    }
}
