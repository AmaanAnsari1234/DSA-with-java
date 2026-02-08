// Counts of vowel

import java.util.*;

public class P2 {

    static int countVowels(String s) {
        // write your logic here
        int count=0;
        String s1 = s.toLowerCase();
        for (char ch : s1.toCharArray())
        {
           if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
               count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int result = countVowels(s);
        System.out.println(result);

        sc.close();
    }
}
