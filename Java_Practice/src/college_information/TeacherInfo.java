package college_information;

import java.util.Scanner;

/**
 * Created by lalit on 2/8/17.
 */
public class TeacherInfo {
    Teacher[] teaArray = new Teacher[1];
    public void getData(){
        Scanner sc = new Scanner(System.in);
        Scanner sr = new Scanner(System.in);
        for(int i=0;i<teaArray.length;i++) {
            Teacher t = new Teacher();
            System.out.printf("Enter name of Teacher :");
            t.name = sc.nextLine();
            System.out.printf("Enter qualification of Teacher :");
            t.qualification = sc.nextLine();
            System.out.printf("Enter Major Subject of Teacher :");
            t.expert = sc.nextLine();
            System.out.print("Enter Experience of Teacher:");
            t.experience = sr.nextInt();
            teaArray[i] = t;
        }
    }
    public void setData(){
        Teacher t = new Teacher();
        for(int i=0;i<teaArray.length;i++){
            t=teaArray[i];
            System.out.println("\nTeacher Name             =" + t.name);
            System.out.println("Teacher Qualification    = " + t.qualification);
            System.out.println("Teacher Experience       =" + t.experience);
            System.out.println("Teacher Major Subject    =" + t.expert);
            System.out.println("\n");


        }

    }
}
