package stack;

import java.util.Scanner;

/**
 * Created by lalit on 2/9/17.
 */
public class MainStack {
    public static void main(String[] args) {

        new MainStack().menu();
    }
    Stack stack = new Stack();
    public void menu(){
        System.out.println("1.Push");
        System.out.println("2.pop");
        System.out.println("3.Exit");
        option();


    }
    public void option(){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
            if(choice==1){
                //Stack s = new Stack();
                //s.push();
                stack.push();
            }
            else if (choice ==2){
                stack.pop();
            }
            else{
                System.exit(0);
            }
        menu();
    }
}
