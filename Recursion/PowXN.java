// pow (x^n)

import java.util.*;

public class P14 {

    public static double myPow(double x, int n) {

        long power = n;      // use long to avoid overflow
        double result = 1.0;

        // handle negative power
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        // fast power (binary exponentiation)
        while (power > 0) {

            if (power % 2 == 1) {   // if power is odd
                result = result * x;
            }

            x = x * x;              // square the base
            power = power / 2;      // halve the power
        }

        return result;
    }

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        double x = sc.nextDouble();
//        int n = sc.nextInt();
//
//        double ans = myPow(x, n);
//        System.out.println(ans);
//        sc.close();


        System.out.println(power(2, 5));

    }
    public static double power(double x, int n) {

        long nn = n;
        double ans = 1.0;

        // handle negative power
        if (nn < 0) {
            x = 1 / x;
            nn = -nn;
        }

        while (nn > 0) {

            if (nn % 2 == 1) {     // odd
                ans = ans * x;
                nn = nn - 1;
            } else {               // even
                x = x * x;
                nn = nn / 2;
            }
        }

        return ans;
    }
}

