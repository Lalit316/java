package constructor;

import result.CalculateMarks;

/**
 * Created by lalit on 2/14/17.
 */
public class MainSum {
    public static void main(String[] args) {
        Calculation c = new Calculation();
        c.sum(10,20);
        c.sum(20,40,50);
        c.sum();
    }
}
