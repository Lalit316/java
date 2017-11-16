package collection;

import java.util.ArrayList;

/**
 * Created by l on 2/21/2017.
 */
public class collection_class {
    public static void main(String[] args) {
        String[] strArray = new String[4];
        ArrayList<String> strlist = new ArrayList<String>();
        strlist.add("a");
        strlist.add("b");
        strlist.add("c");
        strlist.remove("b");
       // System.out.println(strlist.get(0));
        for(String str: strlist){
            System.out.println(str);
        }
    }
}
