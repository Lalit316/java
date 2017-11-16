package stack;

import java.util.Scanner;

/**
 * Created by lalit on 2/9/17.
 */
public class Stack {
    String[] strStack = new String[3];
    int top = -1;
    public void push() {
        if (top >= 2) {
            System.out.println("Stack is Overflow");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter value for push :");
            top++;
            strStack[top] = sc.nextLine();
        }

    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
        } else {
            System.out.println("poped =" + strStack[top]);
            top--;
        }

    }
}