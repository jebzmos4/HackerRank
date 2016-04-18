package Algorithm;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/15/2016.
 */
public class ChocolateFeast {
    public static int quantity(int capital, int price, int discount){

        int total = capital / price;
        int wrappers = total;
        while(wrappers >= discount) {
            total += (wrappers / discount);
            int leftover = wrappers % discount;
            wrappers = (wrappers / discount) + leftover;
        }
        return total;
    }
    public static void main (String[]args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++){
        int capital = in.nextInt();
        int price = in.nextInt();
        int discount = in.nextInt();

        System.out.println(quantity(capital,price,discount));
        }
    }
}
