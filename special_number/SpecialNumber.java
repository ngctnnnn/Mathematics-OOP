package special_number;
import java.util.*;

public class SpecialNumber {
    protected int base;
    protected int addition;

    public SpecialNumber() {
        base = 0;
        addition = 0;
    }

    public void set() {
        Scanner sc = new Scanner(System.in);
        base = sc.nextInt();
        addition = sc.nextInt();
    }

    public void get() {
        //abstract
    }

    public SpecialNumber plus(SpecialNumber other){
        base += other.base;
        return this;
    }
    public SpecialNumber minus(SpecialNumber other){
        base -= other.base;
        return this;
    }
    public SpecialNumber multiply(SpecialNumber other){
        base *= other.base;
        return this;
    }
    public SpecialNumber divide(SpecialNumber other){
        base /= other.base;
        return this;
    }
}