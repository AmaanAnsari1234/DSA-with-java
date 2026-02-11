// check palindrome

import java.util.*;

public class P5 {

    static boolean isPalindrome(String s) {
        // write your logic here
        s= s.toLowerCase();
        int left = 0;
        int right = s.length()-1;

        while (left< right)
        {
            if (s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (isPalindrome(s))
            System.out.println("YES");
        else
            System.out.println("NO");

        sc.close();
    }
}
