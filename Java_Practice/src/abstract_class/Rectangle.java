package abstract_class;

/**
 * Created by lalit on 2/16/17.
 */
public class Rectangle extends Polygon {
    public void area(){
        float arear= length*breadth;
        System.out.println("Area of Rectangle = "+arear);
    }
    public void perimeter(){
        float perimeter = 2*(length+breadth);
        System.out.println("Perimeter of Rectangle = "+perimeter);
    }
}
