package array;

import java.util.Scanner;

/**
 * Created by lalit on 2/8/17.
 */
public class StudentService {
    int i;
    Student[] stuarray = new Student[3];
    public void setInfo(){
        Scanner s = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Enter the name of student :");
        student.name = s.nextLine();
        System.out.println("Enter the address of student :");
        student.address = s.nextLine();
        stuarray[i]=student;


    }
    public void getInfo(){
        Student student = stuarray[i];
        for(i=0;i<=2;i++) {
            System.out.println( student.name);
            System.out.println( student.address);
        }

    }


}
