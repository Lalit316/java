package nepal_telecom;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by l on 2/19/2017
 */
public class NumberDial {
   // NumberDial numd = new NumberDial();
    public void englishLang(){
        System.out.println("Welcome to NepalTelecom customer care service!!!");
        System.out.println("For balance or credit limit                   press [1]");
        System.out.println("To recharge                                   press [2]");
        System.out.println("For complaint                                 press [3]");
        System.out.println("For other services                            press [4]");
        System.out.println("For other queries                             press [5]");
        System.out.println("For personal profile update                   press [6]");
        System.out.println("For operator system                           press [0]");
        System.out.println("To repeat option any menu                     press [9]");
        System.out.println("To return to menu at a time                   press [*]");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        if(choice == 1){
            press1();
        }
        if(choice ==2){
            press2();
        }
        if(choice == 3){
            press3();
        }
        if(choice == 4){
            press4();
        }
        if(choice == 5){
            press5();
        }
        if(choice == 6){
            press6();
        }
        if(choice == 0){
            press0();
        }
        if(choice == 9){
            press9();
        }
    }
    public void press1() {
        System.out.println("Your balance is 198.22. It will expire on 2020/Feb/20.");
        System.out.println("To repeat press [1] \n  To call back to menu  Press      [2]!!!");
        Scanner s = new Scanner(System.in);
        int choice = s.nextInt();
        if(choice == 1){
            press1();
        }
        if(choice == 2){
            englishLang();
        }
    }
    public void press2(){
        System.out.println("Please enter the pin number from the voucher card!!!!\n.....");
        System.out.println("Your card is Successfully recharged!!!!");
        System.exit(0);
    }
    public void press3(){
        System.out.println("Please enter the service number that has been service issue.");
        System.out.println("Thank you for service!");
        System.exit(0);
    }
    public void press4(){
        System.out.println("To report       press  [1]");
        System.out.println("To report missing phones or cancel missing claims       press [3]");
        System.exit(0);
    }
    public void press5(){
        System.out.println("Please report your queries.");
        System.exit(0);
    }
    public void press6(){
        System.out.println("Enter your mobile security code...");
        s.nextInt();
        System.exit(0);
    }
    public void press0(){
        System.out.println("Enter your phone number...");
        s.nextInt();
        System.exit(0);

    }
    public void press9(){
        System.out.println("The system menu is repeated...");
        englishLang();
    }
    Scanner s = new Scanner(System.in);

}
