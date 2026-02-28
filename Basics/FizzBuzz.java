// Leet Code Problem NO : 412.
// Fizz Buzz


import java.util.*;

public class P19 {

    public static List<String> fizzBuzz(int n) {

        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i%3==0 && i %5 ==0)
                result.add("FizzBuzz");
            else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            }
            else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<String> ans = fizzBuzz(n);

        for (String s : ans) {
            System.out.print(s + " ");
        }

        sc.close();
    }
}

