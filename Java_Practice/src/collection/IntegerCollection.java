package collection;

import java.util.ArrayList;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

/**
 * Created by l on 2/21/2017.
 */
public class IntegerCollection {
    public static void main(String[] args) {
        Integer[] intArray = new Integer[5];
        ArrayList<Integer> intlist = new ArrayList<Integer>();
        intlist.add(55);
        intlist.add(50);
        intlist.add(33);
        for(Integer abc : intlist ){
            System.out.println(abc);

        }

    }
}
