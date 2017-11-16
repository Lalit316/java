package access_modifier;

import java.util.Scanner;

/**
 * Created by lalit on 2/15/17.
 */
public class ProtectedClass {

    protected void employee() {
        Scanner s = new Scanner(System.in);
        //String st = s.nextLine();
        System.out.println("Enter your name :");
        s.nextLine();
        System.out.println("Enter your address :");
        s.nextLine();
        System.out.println("Enter your qualification :");
        s.nextLine();
    }
}
