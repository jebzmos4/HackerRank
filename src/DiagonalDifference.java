
import java.util.Scanner;

/**
 * Created by Morifeoluwa on 3/9/2016.
 */
public class DiagonalDifference {
    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int arrInput [][] = new int[N][N];
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < N; i ++) {
            for (int j = 0; j < N; j++) {
                int inputs = in.nextInt();
                arrInput[i][j] = inputs;
            }
        }
        for (int i = 0; i < N; i++){
            for (int j = 0; j < N; j++){
                if ( i == j){
                    sum1 += arrInput[i][j];
                }if ( i + j == (N-1)){
                    sum2 += arrInput[i][j];
                }
            }
        }System.out.println(Math.abs(sum1 - sum2));
    }
}
