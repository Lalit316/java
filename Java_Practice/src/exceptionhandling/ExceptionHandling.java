package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by l on 2/20/2017.
 */
public class ExceptionHandling {
        public static void main(String[] args) {
        int num1=0;
        int num2=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two numbers");
        try {
             num1 = sc.nextInt();
             num2 = sc.nextInt();

             int result = num1 / num2;
            System.out.println(result);
        }catch(Exception e){
            System.out.println("Exception!!");
        }
    }
}
