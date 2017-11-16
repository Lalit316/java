package calculator;

import java.util.Scanner;

import static java.lang.Math.pow;
import static java.lang.StrictMath.sqrt;

public class MiniCalculator {
    double num;
    double num1;
    Scanner s = new Scanner(System.in);
    public void getData(){
        System.out.println("Enter number to calculate??");

        double num = s.nextDouble();
        double num1 = s.nextDouble();
    }
    public void showData(){
        int choose = s.nextInt();
        switch (choose) {
            case 1:
                System.out.println("Addition");
                double add = num + num1;
                System.out.println(add);
                break;
            case 2:
                System.out.println("Subtraction");
                if (num > num1) {
                    double sub = num - num1;
                    System.out.println(sub);
                } else {
                    double sub = num - num1;
                    System.out.println("-" +sub);
                }
                break;
            case 3:
                System.out.println("Multiplication");
                double mul = num * num1;
                System.out.println(mul);
                break;
            case 4:
                System.out.println("Division!");
                double div = num / num1;
                System.out.println(div);
                break;
            case 5:
                System.out.println("Square root");
                double squ = sqrt(num);
                System.out.println("Square root of first number : " + squ);
                double squ1 = sqrt(num1);
                System.out.println("Square root of second number : " + squ1);
                break;
            case 6:
                System.out.println("Power!!");
                double power = pow(num,num1);
                System.out.println(""+num+" to the power "+num1+" is "+power);
        }
    }
}
