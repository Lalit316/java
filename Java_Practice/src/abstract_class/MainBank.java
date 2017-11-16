package abstract_class;

/**
 * Created by lalit on 2/16/17.
 */
public class MainBank {
    public static void main(String[] args) {
        Bank b;
        b= new SBI();
       // b= new GlobalIme();
        b.setData(7);
        b.interest();
        b.totalBusiness();

    }
}
