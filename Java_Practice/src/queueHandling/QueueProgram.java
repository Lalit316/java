package queueHandling;

import java.util.Scanner;

/**
 * Created by lalit on 2/9/17.
 */
public class QueueProgram {
    String strArray[] = new String[3];
    int top= -1;

    public void pushData(){
        if(top==strArray.length-1) {
            System.out.println("Queue OverFlow!!!!");
     }
        else{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Data  ");
            top++;
            strArray[top] = sc.nextLine();
        }
    }
    public void popData(){
        if(top>=strArray.length*2-1){
            System.out.println("Queue is Empty!!!");
        }
        else{

            System.out.println("Poped = "+strArray[top-strArray.length+1]);
            top++;
        }


    }
}
