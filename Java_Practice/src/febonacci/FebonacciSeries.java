package febonacci;

import java.util.Scanner;

/**
 * Created by lalit on 2/7/17.
 */
public class FebonacciSeries {
    public static void main(String[] args) {
        FebonacciSeries fs = new FebonacciSeries();
        fs.calclFebonacci();

    }
    public void calclFebonacci(){
        Scanner s = new Scanner(System.in);
        System.out.printf("Enter the number to calculate febonacci series :");
        int a = 0;
        int b = 1;
        System.out.println(""+a+","+b+"");
        int num = s.nextInt();
        for(int i=0;i<=num;i++) {
            int c = a + b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }

    }

}
