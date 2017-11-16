package access_modifier;

import java.util.Scanner;

/**
 * Created by lalit on 2/15/17.
 */
public class PrivateClass {
    public static void main(String[] args) {
        PrivateClass pc = new PrivateClass();
        pc.message();
        pc.calculation();
    }

    private void message() {
        System.out.println("This is Private Class!");
    }

    private void calculation() {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial : ");
        int fact = s.nextInt();
        if (fact == 1) {
            System.out.printf("The factorial of " + fact + " is : 1");
        } else {
            int facto = 1;
            for (int i = 1; i <= fact; i++) {
                facto = facto * i;
            }
            System.out.printf("The factorial of " + fact + " is : " + facto);
        }
    }
}
