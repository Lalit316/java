package collection;

import array.Student;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by l on 2/22/2017.
 */
public class StudentInfor {
    String name;
    int rollno;
    String address;

    StudentInfor(String name, int rollno, String address) {
        this.name=name;
        this.rollno=rollno;
        this.address=address;
    }

    public static void main(String[] args) {
       ArrayList<StudentInfor> list = new ArrayList<StudentInfor>();
        StudentInfor s1 = new StudentInfor("Ram",101,"Kathmandu");
        StudentInfor s2 = new StudentInfor("Shyam",102,"Pokhara");
        StudentInfor s3 = new StudentInfor("Ram",101,"Butwal");
        list.add(s1);
        list.add(s2);
        list.add(s3);
       // Iterator itr = new list.iterator();

        for(StudentInfor abc: list ){
            System.out.println(abc.name+" "+abc.rollno+" "+abc.address);
        }
    }
}
