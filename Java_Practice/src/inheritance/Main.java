package inheritance;

/**
 * Created by lalit on 2/15/17.
 */
public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        Square s = new Square();
        r.setProperties(3.13f,2.16f);
        r.area();
        r.perimeter();
        s.setProperties(1.2f,5.3f);
        s.area();
        s.perimeter();

    }
}
