package Days_Of_Code;

import java.util.Scanner;

/**
 * Created by Morifeoluwa on 5/2/2016.
 */
public class Person {

        private int age;

        public Person(int initialAge) {
            // Add some more code to run some checks on initialAge
            if (initialAge < 0){
                System.out.println("Age is not valid, setting age to 0.");
                this.age = 0;
            }else
                this.age = initialAge;
        }

        public void amIOld() {
            // Write code determining if this person's age is old and print the correct statement:
            String output = "";
            if ( this.age >= 0 && this.age < 13){
            output = ("You are young");
            }else if (this.age >= 13 && this.age < 18){
                output = ("You are a teenager");
            }else if (this.age >= 18){
                output = ("You are old");
            }
            System.out.println(output);
        }

        public void yearPasses() {
            // Increment this person's age.
            this.age++;
        }
    public static void main(String []args){
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        Person p = new Person(age);
        p.amIOld();
        for (int i = 0; i < 3; i++){
            p.yearPasses();
        }
        p.amIOld();
        System.out.println();
    }
}
