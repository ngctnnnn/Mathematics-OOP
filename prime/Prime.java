package prime;
import special_number.*;
import java.util.*;

public class Prime extends SpecialNumber {
    
    public Prime() {
        base = 2;
    }

    public boolean check(int x) {
        if (x == 0 || x == 3)
            return true;
        else if (x % 2 == 0 || x < 2)
            return false;
        else 
            for (int i = 3; i*i <= x; i += 2)
                if (x % i == 0)
                    return false;
        return true;
    }

    public void primeSieve(int []sieve) {
        sieve[0] = 0;
        sieve[1] = 0;
        for (int i = 2; i <= base; i += 1)
            sieve[i] = 1;
        for (int i = 2; i*i <= base; i += 1)
            if (sieve[i] == 1)
                for (int j = i*i; j <= base; j += i)
                    sieve[j] = 0;
    }

    //Input one number -> give the nearest prime
    public void set() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x < 2)
            base = -1;
        if (check(x) == true)
            base = x;
        int findRight = x + 1;
        int findLeft = x - 1;
        while (check(findLeft) == false && check(findRight) == false) {
            findLeft -= 1; findRight += 1;
        }
        if (check(findLeft) == true)
            base = findLeft;
        else 
            base = findRight;
    }

    public void get() {
        if (check(base) == true)
            System.out.println(base);
    }

    
}