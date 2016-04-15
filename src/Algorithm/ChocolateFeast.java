package Algorithm;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/15/2016.
 */
public class ChocolateFeast {
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int capital = in.nextInt();
        int price = in.nextInt();
        int discount = in.nextInt();

        int quantity = (capital /price) + ((capital / price) / discount);
        System.out.println(quantity);
    }
}
