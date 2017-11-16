package abstract_class;

/**
 * Created by lalit on 2/16/17.
 */
public abstract class Polygon {
    float length;
    float breadth;
    final float PI = 3.14f;
    public abstract void area();
    public abstract void perimeter();
    public void setProperties(float l, float b){
        length =l;
        breadth = b;
    }
}
