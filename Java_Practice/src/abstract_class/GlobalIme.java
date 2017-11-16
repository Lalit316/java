package abstract_class;

import java.util.Scanner;

/**
 * Created by lalit on 2/16/17.
 */
public class GlobalIme extends Bank {
    public void interest(){
        float f = interest;
        System.out.println("Interest in Global IME  Bank = "+f);
    }
    public void totalBusiness(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter balance :");
        int i = s.nextInt();
        System.out.println("Total Business of the day = "+i);

    }
}
