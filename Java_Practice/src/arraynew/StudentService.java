package arraynew;

import java.util.Scanner;

/**
 * Created by lalit on 2/8/17.
 */
public class StudentService {
    Student[] stuarray = new Student[4];

    public void setInfo() {

        Scanner s = new Scanner(System.in);
        for(int i=0;i<stuarray.length;i++) {
            Student student = new Student();
            System.out.println("Enter name :");
            student.name = s.nextLine();
            System.out.println("Enter address :");
            student.address = s.nextLine();
            stuarray[i] = student;
        }
    }

    public void getInfo() {
        Student student = new Student();

        for (int i = 0; i <stuarray.length; i++) {
            student = stuarray[i];
            System.out.println("Name = " + student.name);
            System.out.println("Address=" + student.address);
        }

    }

}
