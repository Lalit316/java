package constructor;

/**
 * Created by lalit on 2/14/17.
 */
public class Calculation {
    public void sum(int a, int b){
        int s1 = a+b;
        System.out.println("SUM = "+s1);
    }
    public void sum(int b,int c,int d){
        int s2 = b+c+d;
        System.out.println("Sum of three arguement = "+s2);
    }
    public void sum(){
        float fl = 3f+500f;
        System.out.println("Sum of default argument = "+fl);
    }
}




