package pattern;

import java.util.Scanner;

/**
 * Created by lalit on 2/7/17.
 */
public class Trianglepat {
    public static void main(String[] args) {
        Trianglepat tp = new Trianglepat();
        tp.tPattern();
        tp.toPattern();
        tp.rectangle();
        tp.newTriangle();
    }

    public void tPattern() {
        System.out.printf("Enter line number/size of triangle!!");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int i;
        for (i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }


    }
    public void toPattern(){
        Scanner si = new Scanner(System.in);
        System.out.printf("Enter the row of triangle!!");
        int num = si.nextInt();
        int i;
        for(i=num;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
    }
    public void rectangle(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter the rectangle size!!");
        int num = s.nextInt();
        int i;
        for(i=num; i>0; i--){
            for(int j=num;j>0;j--){
                System.out.printf("* ");
            }
            System.out.print("\n");
        }
    }
    public void newTriangle(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter the rectangle size!!");
        int num = s.nextInt();
        int i;
        for (i = 1; i <= num; i++){
            for (int j = 1; j <= i; j++) {
                System.out.printf("*");
            }
            System.out.printf("\n");
        }
        for(i=num-1;i>=0;i--){
            for(int j=1;j<=i;j++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

    }
}
