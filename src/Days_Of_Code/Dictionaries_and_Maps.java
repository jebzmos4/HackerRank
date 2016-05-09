package Days_Of_Code;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/9/2016.
 */
public class Dictionaries_and_Maps {
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap <String, Integer> phoneBook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if (phoneBook.containsKey(s)){
                System.out.println( s + " = " + phoneBook.get(s));
            }else
                System.out.println("Not Found");
        }
        in.close();
    }
}
