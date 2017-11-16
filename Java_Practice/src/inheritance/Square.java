package inheritance;

/**
 * Created by lalit on 2/15/17.
 */
public class Square extends Rectangle {
    public void area(){
        float area = length*length;
        System.out.println(area);
    }
    public void perimeter(){
        float peri = 4*length;
        System.out.println(peri);
    }
}
