package constructor;

/**
 * Created by lalit on 2/13/17.
 */
public class ConstructorExample {
    public static void main(String[] args) {
        ConstructorExample ex = new ConstructorExample();
            ex.print();
    }
    public void print(){
        System.out.println("This is a Method!");
    }
    public ConstructorExample(){
        System.out.println("First const");
    }

}
