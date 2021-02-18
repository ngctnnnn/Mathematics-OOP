import special_number.*;
import fraction.*;
import complex.*;

public class main{
    public static void main(String[] args){
        //Fraction
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f1.set(); f2.set();
        Fraction f3 = new Fraction();
        f3 = f1.plus(f2);
        f3.get();

        //Complex
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.set(); c2.set();
        (c1.plus(c2)).get();
        (c1.minus(c2)).get();
        (c1.multiply(c2)).get();
    }
}