package Days_Of_Code;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/2/2016.
 */
public class Operator {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);

        double mealCost = in.nextDouble();
        double tipPercent = in.nextInt();
        double taxPercent = in.nextInt();
        double totalCost = mealCost + ((tipPercent / 100) * mealCost) + ((taxPercent / 100) * mealCost);
        System.out.println("The total meal cost is " + Math.round(totalCost) + " dollars");
    }
}
