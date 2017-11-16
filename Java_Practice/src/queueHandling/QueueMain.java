package queueHandling;

import java.util.Scanner;

/**
 * Created by lalit on 2/10/17.
 */
public class QueueMain {

    QueueProgram qp = new QueueProgram();

    public static void main(String[] args) {
        new QueueMain().menu();
    }
    public void menu(){
        System.out.println("1. PUSH ");
        System.out.println("2. POP   ");
        System.out.println("3. EXIT");
        option();
    }
    public void option(){
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if(choice ==1){
           qp.pushData();
        }
        else if (choice == 2){
            qp.popData();
        }
        else{
            System.exit(0);
        }
        menu();
    }

}
