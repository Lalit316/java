package factorial;

import java.util.Scanner;

/**
 * Created by lalit on 2/7/17.
 */
public class CalcFact {
    public static void main(String[] args) {
        CalcFact cf = new CalcFact();
        cf.calculation();
    }

    public void calculation() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to calculate factorial : ");
        int fact = s.nextInt();
        if (fact == 1) {
            System.out.printf("The factorial of " +fact+ " is : 1");
        } else {
           int facto = 1;
            for(int i=1; i<=fact;i++){
                facto= facto*i;
            }
            System.out.printf("The factorial of "+fact+" is : " +facto);
        }
    }
}
