package Strings; /**
 * Created by Morifeoluwa on 2/29/2016.
 */
import java.util.Arrays;
import java.util.Scanner;
public class SubString {


    public static String evaluate(String A, String B){

        for(int i = 0; i < A.length() ; i++){
            for(int k = 0; k < B.length(); k++){

                if(String.valueOf(A.charAt(i)).equalsIgnoreCase(String.valueOf(B.charAt(k)))){
                    return "YES";
                }
            }
        }
        return "NO";
    }


    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
            String A = null;
        String B = null;
        String[] s = new String[T];
        int i;
        for ( i= 0; i < T; i++){
            A = in.next();
            B = in.next();
           s[i] = (evaluate(A , B));
        }
        System.out.println(Arrays.toString(s));
//        for( i = 0; i < s.length; i++) {
//            System.out.println(s[i]);

        }

}
