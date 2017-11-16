package nepal_telecom;

import java.util.Scanner;

/**
 * Created by l on 2/19/2017.
 */
public class NtMain {
    NumberDial nd = new NumberDial();

    public static void main(String[] args) {
        NtMain nm = new NtMain();
        System.out.println("Please select your preferred language...");
        System.out.println("For NEPALI press  [1]");
        System.out.println("For ENGLISH press [2]");
        nm.option();
        
    }
    public void option(){
        Scanner s = new Scanner(System.in);
        int choice =s.nextInt();
        if (choice == 2){
            nd.englishLang();
        }

    }
}
