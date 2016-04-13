package Algorithm;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/12/2016.
 */
public class CeaserCipher {

    public static String encrypt(String encrypted, int K) {
        for (int i = 0; i < encrypted.length(); i++) {
            if( (encrypted.charAt(i) >= 'A' && encrypted.charAt(i) <= 'Z') ||
                    (encrypted.charAt(i) >= 'a' && encrypted.charAt(i) <= 'z'))
            {
                if (((char)(encrypted.charAt(i) + K)  > 'Z' &&
                        encrypted.charAt(i) <= 'Z')
                        || ((char)(encrypted.charAt(i) + K)  > 'z'
                        && encrypted.charAt(i) <= 'z'))
                {
                    encrypted = encrypted + (char)(encrypted.charAt(i) + K - 26);
                }
                else
                {
                    encrypted = encrypted + (char)(encrypted.charAt(i) + K);
                }
            }
            else
            {
                encrypted = encrypted + encrypted.charAt(i);
            }
        }
        return encrypted;
    }

    public static void main (String []args){
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String input = in.next();
        int K = in.nextInt();
        System.out.println(encrypt(input, K));
    }
}
