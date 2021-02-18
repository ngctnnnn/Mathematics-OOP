package complex;
import special_number.*;
import java.util.*;

public class Complex extends SpecialNumber {
    //base + (addition)i

    public Complex() {
        base = 0;
        addition = 0;
    }

    public void get() {
        if (base == 0)
            System.out.println(addition + "i");
        else { 
            if (addition >= 0)
                System.out.println(base + "+" + addition + "i");
            else 
                System.out.println(base + "" + addition + "i");
        }
    }
    
    public Complex plus(Complex other) {
        base += other.base;
        addition += other.addition;
        return this;
    }

    public Complex minus(Complex other) {
        base -= other.base;
        addition -= other.addition;
        return this;
    }

    public Complex multiply(Complex other) {
        base = (base * other.base) - (addition * other.addition);
        addition = (base * other.addition) + (other.base * addition);
        return this;
    }
}
