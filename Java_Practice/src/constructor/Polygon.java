package constructor;

/**
 * Created by lalit on 2/14/17.
 */
public class Polygon {
    public static void main(String[] args) {

    }
    public void area(float l,float b){
        float area= l*b;
        System.out.println("Area of rectangle = "+area);
    }
    public void area(float l){
        float area = l*l;
        System.out.println("Area of Square = "+area);
    }
    public void area(){
        double area = 3.14f*3*3;
        System.out.println("Area of circle ="+area);
    }

}

