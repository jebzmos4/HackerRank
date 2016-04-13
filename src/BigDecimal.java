import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.math.BigDecimal;

/**
 * Created by Morifeoluwa on 4/5/2016.
 */
   class BigDecimal1 {
    public static void main(String []args){
      /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //Input
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String [] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextLine();
        }

        //Sorting (Selection)
//        for (int i = 0; i < (array.length - 1); i++) {
//            for (int k = (i + 1); k < array.length; k++) {
//                if (new BigDecimal(array[i]).compareTo(new BigDecimal(array[k])) < 0) {
//                    String tempValue = array[i];
//                    array[i] = array[k];
//                    array[k] = tempValue;
//                }
//            }
//        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}

