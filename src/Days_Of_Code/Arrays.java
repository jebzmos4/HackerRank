package Days_Of_Code;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/5/2016.
 */
public class Arrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        for (int j = (n - 1); j >= 0; j--){
            System.out.print(arr[j] + " ");
        }
    }
}
