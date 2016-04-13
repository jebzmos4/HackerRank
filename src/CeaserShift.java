import java.util.Scanner;

/**
 * Created by Morifeoluwa on 4/13/2016.
 */
public class CeaserShift {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("What would you like me to encrypt");
        String message = reader.nextLine();
        String encrypted = encrypt(message,10);
        System.out.println(encrypted);
        String decryptedAgain = decrypt(encrypted,10);
        System.out.println(decryptedAgain);

        //demonstrate using second, combined method
        System.out.println("What would you like me to encrypt");
        String message2 = reader.nextLine();
        String encrypted2 = shiftLetters(message2,5);
        System.out.println(encrypted2);
        String decryptedAgain2 = shiftLetters(message2,-5);
        System.out.println(decryptedAgain2);
    }

    //Method 1 of doing things: Write a method to encrypt and then a 2nd to decrypt
    //The second method is so similar that it's better to compbine the 2 into one method
    //called shiftLetters below
    //This method takes as input a String and a number representing the amount to shift by
    //It encodes the String using a shift by changing all the letters by shift
    //For example: If the string is "abc" and the shift is 3, we add 3 to each letter
    //to get "def" Note that punctuation, numbers, etc remain the same.
    //This method only works for values of shift between 0 and 25 (inclusive)
    public static String encrypt(String original, int shift)
    {
        //start out with a blank string
        //We will build onto this String by reading the original String one
        //letter at a time
        String encrypted = "";
        //Individual characters of a String are numbered from 0 until n-1 where n is the
        //length of the string
        //So what we want to repeat is "get the i character of the String, encrypt it, and build
        //it onto the String named encrypted" We want to do that for each value of i
        //To actually encrypt, we need to worry about "wraparound" issues around z
        for (int i = 0; i < original.length(); i++) {
            //Check if it is a letter. If it isn't, then we don't have to do anything anyway
            if( (original.charAt(i) >= 'A' && original.charAt(i) <= 'Z') ||
                    (original.charAt(i) >= 'a' && original.charAt(i) <= 'z'))
            {
                //Check if there was "wraparound" For example z + 3 should give us c
                //In this case, the way to get this result is by subtracting 23 instead of adding 3
                if (((char)(original.charAt(i) + shift)  > 'Z' &&
                        original.charAt(i) <= 'Z')
                        || ((char)(original.charAt(i) + shift)  > 'z'
                        && original.charAt(i) <= 'z'))

                {
                    //add the next character which is encrypted to the String
                    encrypted = encrypted + (char)(original.charAt(i) + shift - 26);
                }
                else
                {
                    //add the next character which is encrypted to the String
                    encrypted = encrypted + (char)(original.charAt(i) + shift);
                }
            }
            else
            {
                //add the original character to the String
                encrypted = encrypted + original.charAt(i);
            }
        }

        //return the resulting String
        return encrypted;
    }

    //decrypt is the same as encrypt except it subtracts shift instead (to reduce code since there
    //is a lot of overlap between this method and encrypt, we can combine the methods if we are clever: see below)
    public static String decrypt(String original, int shift)
    {
        String decrypted = "";
        for (int i = 0; i < original.length(); i++) {
            if( (original.charAt(i) >= 'A' && original.charAt(i) <= 'Z') ||
                    (original.charAt(i) >= 'a' && original.charAt(i) <= 'z'))
            {
                if (((char)(original.charAt(i) - shift)  < 'A' &&
                        original.charAt(i) >= 'A')
                        || ((char)(original.charAt(i) - shift)  < 'a'
                        && original.charAt(i) >= 'a'))

                {
                    decrypted = decrypted + (char)(original.charAt(i) - shift + 26);
                }
                else {
                    decrypted = decrypted + (char)(original.charAt(i) - shift);
                }
            }
            else
            {
                decrypted = decrypted + original.charAt(i);
            }
        }
        return decrypted;
    }

    //this method is a generalization of the above 2 methods to merge them into one.
    public static String shiftLetters(String original, int shift)
    {
        String shifted = "";
        for (int i = 0; i < original.length(); i++)
        {
            if (isLetter(original.charAt(i)))
            {
                shifted = shifted + shift(original.charAt(i), shift);
            }
            else
            {
                shifted = shifted + original.charAt(i);
            }
        }

        return shifted;
    }

    //helper method to check if something is a letter
    public static boolean isLetter(char letter)
    {
        return (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z');
    }

    //helper method to encrypt just one letter
    //this method assumes that the character is a letter. If it is not, this method should not be called
    public static char shift(char original, int shift)
    {
        int normalizedShift = shift % 26; //put all values in the range 0-25. Now we can deal with this in just one case
        char shifted = (char)(original + shift);
        //now, make sure that it is in the appropriate range. Shift can be any value but we need to standardize it between A-Z
        //Warning: Here be dragons!
        if ((shift > 'Z' && original <= 'Z') || (shift > 'z' && original <= 'z'))
        {
            shifted = (char)(shifted - 26);
        }

        return shifted;
    }

}
