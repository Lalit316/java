package college_information;

import java.util.Scanner;

/**
 * Created by lalit on 2/8/17.
 */
public class MainMethod {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StudentInfo si = new StudentInfo();
        CollegeInfo co = new CollegeInfo();
        TeacherInfo ti = new TeacherInfo();
        System.out.println("\nWhich you want to choose 1,2 or 3?");
        System.out.println("\n1.  Student\n2.  College\n3.  Teacher");
        int choice = s.nextInt();
        switch(choice){
            case 1:
                si.getInfo();
                si.setInfo();
                break;
            case 2:
                co.getInfo();
                co.setInfo();
                break;
            case 3:
                ti.getData();
                ti.setData();
                break;
            default:
                System.out.println("Choose valid number!");
        }

    }
}
