package inheritance;

/**
 * Created by lalit on 2/15/17.
 */         //Child             Parent
public class Rectangle extends Polygon{
    public void area(){
        float  area = length*breadth;
        System.out.println(area);
    }
    public void perimeter(){
        float perimeter = 2*(length+breadth);
        System.out.println(perimeter);
    }

}
