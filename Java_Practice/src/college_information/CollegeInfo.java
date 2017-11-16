package college_information;

import java.util.Scanner;

/**
 * Created by lalit on 2/8/17.
 */
public class CollegeInfo {
    College[] colArray = new College[2];
    protected void getInfo() {
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < colArray.length; i++) {
            College co = new College();
            System.out.println("Enter Collage name :");
            co.name = s.nextLine();
            System.out.println("Enter address :");
            co.address = s.nextLine();
            colArray[i] = co;
        }
    }
        protected void setInfo(){
            College co = new College();
            for(int i = 0; i<colArray.length; i++){
                co = colArray[i];
                System.out.println("College Name    = "+co.name);
                System.out.println("College Address = "+co.address);

    }

    }
}
