
package introduction;
import java.util.Scanner;


/**
 * Created by lalit on 2/6/17.
 */
public class MyIntroduction {
    public static void main(String args[]){
        MyIntroduction intro = new MyIntroduction();
        intro.printInfo();
    }

    public void printInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter Name");
        String name = sc.nextLine();
        System.out.println("Your name is = "+name);
    }
}
