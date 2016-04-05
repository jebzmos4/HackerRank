package Introduction;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 3/30/2016.
 */
public class Static_Initializer {
    static Scanner sc = new Scanner(System.in);
    static int B = sc.nextInt();
    static int H = sc. nextInt();
    static boolean flag = ((B > 0) && (H > 0));

    static{
        try{
            if (!flag){
                throw new Exception("Breadth and height must be positive");
            }
        } catch(Exception e){
            System.out.print(e);
        }
    }


    public static void main(String[] args) {
        int area = B * H;
        if (flag){
            System.out.println(area);
        }
    }
}
