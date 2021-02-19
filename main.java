import special_number.*;
import fraction.*;
import complex.*;
import prime.*;

public class main{
    public static void main(String[] args){
        //Fraction
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        f1.set(); f2.set();
        Fraction f3 = new Fraction();
        f3 = f1.plus(f2);
        f3.get();
        f3 = f1.minus(f2);
        f3.get();
        f3 = f1.multiply(f2);
        f3.get();
        f3 = f1.divide(f3);
        f3.get();

        // //Complex
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.set(); c2.set();
        (c1.plus(c2)).get();
        (c1.minus(c2)).get();
        (c1.multiply(c2)).get();

        //Prime
        Prime p1 = new Prime();
        p1.set(); p1.get();
    }
}