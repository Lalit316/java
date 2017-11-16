package result;

import java.util.Scanner;

/**
 * Created by lalit on 2/7/17.
 */
public class CalculateMarks {
    double total = 0;
    public static void main(String[] args) {
        CalculateMarks cm = new CalculateMarks();
        cm.enterMarks();
        cm.calcMarks();

    }
   public void enterMarks(){
       Scanner si = new Scanner(System.in);
       System.out.println("Enter marks of Computer :");
       float co = si.nextFloat();
       if(co>100){
           System.out.println("Marks invalid!");
       }
       System.out.println("Enter marks of Physics :");
       float ph = si.nextFloat();
       System.out.println("Enter marks of Java language :");
       float jl = si.nextFloat();
       System.out.println("Enter marks of Economics :");
       float ec = si.nextFloat();
       System.out.println("Enter marks of Social :");
       float so = si.nextFloat();
       total = co+ph+jl+ec+so;
       if(total<500) {
           System.out.println("Total =" + total);
       }
   }
    public void calcMarks(){
        double per = total/5;
        if(per>100){
            System.out.println("Error!! Marks invalid");
        }
        {
        if(per<=32){
            System.out.println("Result Failed!");
        }
        else if(per>=32&&per<=45) {
            System.out.println("Result Passed!");
        }
            else if (per>=45 && per<=55) {
            System.out.println("Third Division!!");
        }
            else if (per>=55 && per<60){
            System.out.println("Second Division!!");
        }
        else if (per>=60 && per<80){
            System.out.printf("First Divison!!");
        }
        else if (per>=80 && per<=100){
            System.out.println("Distinction!!!");
        }


    }}
}
