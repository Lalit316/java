package stackWork;

import stack.Stack;

import java.util.Scanner;

/**
 * Created by lalit on 2/9/17.
 */
public class StackMain {
    StackHandling sh = new StackHandling();
    public static void main(String[] args) {
        StackMain sm = new StackMain();
        sm.menu();
    }
    public void menu(){
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Exit");
        option();
    }
    public void option(){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice == 1){
            sh.pushData();
        }
        else if (choice ==2){
            sh.popData();
        }
        else{
            System.exit(0);
        }
        menu();
    }
}
