package square_number;
import special_number.*;
import java.util.*;
import java.lang.Math;

public class SquareNumber extends SpecialNumber {
    
    public SquareNumber() {

    }

    //if not an square number, return its square form
    //return its, else
    public void set() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double trunc = Math.floor(Math.sqrt(x));
        if (trunc * trunc == x)
            base = x;
        else 
            base = x*x;
    }

    public void get() {
        System.out.println(base);
    }
}