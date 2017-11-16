package constructor;

import com.sun.org.apache.xpath.internal.operations.Mult;

/**
 * Created by lalit on 2/14/17.
 */
public class MultipleConstructor {
    int i;
    int j;
    public static void main(String[] args) {
        MultipleConstructor in = new MultipleConstructor(10,20);
     }
    public MultipleConstructor(){
        System.out.println("This is Default constructor");
    }
     MultipleConstructor(int a){
         this();
         System.out.println("Parameter single");
    }
    MultipleConstructor(int b, int c){
        this(b);
        System.out.println("Parameter Double");
    }

}
