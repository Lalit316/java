package stackWork;

import java.util.Scanner;

/**
 * Created by lalit on 2/9/17.
 */
public class StackHandling {
    String[] strArray = new String[3];
    int top = -1;
    public void pushData(){
        if(top>=2){
            System.out.println("Stack OverFlow !!!");
        }
        else{
            Scanner s = new Scanner(System.in);
            System.out.println("Enter Value ");
            top++;
            strArray[top] = s.nextLine();
        }
        

    }
    public void popData(){
        if(top==-1){
            System.out.println("Stack is Empty!");
        }
        else{
            System.out.println("Poped data = "+strArray[top]);
            top--;
        }

    }
}
