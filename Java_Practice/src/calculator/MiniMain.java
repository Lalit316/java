package calculator;

/**
 * Created by l on 2/27/2017.
 */
public class MiniMain {
    public static void main(String[] args) {
        MiniCalculator mc = new MiniCalculator();
        MiniMain mm = new MiniMain();
        mc.getData();
        mm.option();

        mc.showData();
    }
    public void option(){

        System.out.println("What do you want to do?");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");
        System.out.println("5.Square root");
        System.out.println("6.Power");
    }
}
