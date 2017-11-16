package abstract_class;

/**
 * Created by lalit on 2/16/17.
 */
public abstract class Bank {
    float interest;
    int b;
    public abstract void interest();
    public abstract void totalBusiness();
    public void setData(float i){
        interest = i;
    }
}
