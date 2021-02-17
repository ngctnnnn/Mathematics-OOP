package fraction;
import java.util.*;

public class Fraction {
    private int numerator;
    private int demorator;
    
    public Fraction() {
        numerator = 0;
        demorator = 1;
    }

    public void set() {
        Scanner sc = new Scanner(System.in);
        numerator = sc.nextInt();
        demorator = sc.nextInt();
    }

    public void get() {
        System.out.println(numerator + "/" + demorator);
    }

    int __gcd(int a, int b) {
        if (b == 0)
            return a;
        else
            return __gcd(b, a % b);
    }

    public Fraction simplify() {
        int commonDivisor = __gcd(numerator, demorator);
        numerator /= commonDivisor;
        demorator /= commonDivisor;
        return this;
    }

    public Fraction plus(Fraction other) {
        int commonMultiply = other.demorator * demorator;
        numerator = numerator * other.demorator + other.numerator * demorator;
        demorator = commonMultiply;
        return this.simplify();
    }

    public Fraction minus(Fraction other) {
        int commonMultiply = other.demorator * demorator;
        numerator = numerator * other.demorator - other.numerator * demorator;
        demorator = commonMultiply;
        return this.simplify();
    }

    public Fraction multiply(Fraction other) {
        numerator *= other.numerator;
        demorator *= other.demorator;
        return this.simplify();
    }

    public Fraction divide(Fraction other) {
        numerator *= other.demorator;
        demorator *= other.numerator;
        return this.simplify();
    }
}



