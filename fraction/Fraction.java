package fraction;
import special_number.*;
import java.util.*;

public class Fraction extends SpecialNumber {
    //   base
    // --------
    // addition
    public Fraction() {
        base = 0;
        addition = 1;
    }

    //public void set();

    public void get() {
        System.out.println(base + "/" + addition);
    }

    int __gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return __gcd(b, a % b);
    }

    public Fraction simplify() {
        int commonDivisor = __gcd(base, addition);
        base /= commonDivisor;
        addition /= commonDivisor;
        return this;
    }

    public Fraction plus(Fraction other) {
        int commonMultiply = other.addition * addition;
        base = base * other.addition + other.base * addition;
        addition = commonMultiply;
        return this.simplify();
    }

    public Fraction minus(Fraction other) {
        int commonMultiply = other.addition * addition;
        base = base * other.addition - other.base * addition;
        addition = commonMultiply;
        return this.simplify();
    }

    public Fraction multiply(Fraction other) {
        base *= other.base;
        addition *= other.addition;
        return this.simplify();
    }

    public Fraction divide(Fraction other) {
        base *= other.addition;
        addition *= other.base;
        return this.simplify();
    }
}



