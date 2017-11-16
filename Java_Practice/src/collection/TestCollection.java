package collection;

import java.util.ArrayList;

/**
 * Created by l on 2/21/2017.
 */
public class TestCollection {
    public static void main(String[] args) {
        String[] strArray = new String[4];
        ArrayList<String> list = new ArrayList<String>();
        list.add("Harish");
        list.add("Kathmandu");
        list.add("BCE");
        for(String abc : list){
            System.out.println(abc);
        }

    }
}
