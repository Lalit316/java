package college_information;

import java.util.Scanner;

/**
 * Created by lalit on 2/8/17.
 */
public class StudentInfo {

    Student[] stuArray = new Student[2];

    protected void getInfo(){
        Scanner s = new Scanner(System.in);
        for(int i=0; i<2;i++){
            Student st = new Student();
            System.out.println("Enter Your name :");
            st.name = s.nextLine();
            System.out.println("Enter Your address :");
            st.address = s.nextLine();
           System.out.println("Enter your roll number :");
            st.rollno = s.nextLine();
            stuArray[i]=st;
        }
        }
    protected void setInfo(){
        Student st = new Student();
        for(int i=0; i<stuArray.length;i++){
            st= stuArray[i];
            System.out.println("Name        =  "+st.name);
            System.out.println("Address     =  "+st.address);
            System.out.println("Rollnumber  =  "+st.rollno);

        }


    }
}
