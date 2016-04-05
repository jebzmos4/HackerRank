

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Created by Morifeoluwa on 3/10/2016.
 */
public class AngryProfessor {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int sum = 0;
        ArrayList <Integer> input = new ArrayList<>();
        ArrayList <Integer> students = new ArrayList<>();
        for (int i = 0; i < 2; i ++){
            input.add(in.nextInt());
        }
        for (int i = 0; i < input.get(0); i++ ){
            students.add(in.nextInt());
            if (students.get(i) >= 0 ){
                sum += sum;
            }
        }if (sum >= input.get(1)){
            System.out.println("NO");
        }else
            System.out.println("YES");

    }
}