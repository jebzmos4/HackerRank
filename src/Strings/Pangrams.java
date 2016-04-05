package Strings; /**
 * Created by Morifeoluwa on 2/29/2016.
 */
import java.util.Scanner;
public class Pangrams {
    public static  String panagram(String input) {
        String[] A = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
                "v", "w", "x", "y", "z"
        };
        String B = null;
        for (int i = 0; i < input.length(); i++) {
            B = String.valueOf(input.substring(0, input.length()).charAt(i));
            if (B == (String.valueOf(A[i]))) {
                return "panagram";
            }
        }
        return "not panagram";
    }

    public static void main(String []args){
        Scanner in = new Scanner (System.in);
        String input = in.next();
        System.out.println(panagram(input));

    }
}
