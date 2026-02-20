// any duplicate element
// if yes-> true
// if no-> false

import java.util.*;

public class P12 {

    static boolean containsDuplicate(int[] arr) {
        // write your logic here
        HashSet<Integer> set = new HashSet<>();
        for(int x: arr)
        {
            if (set.contains(x))
                return true;
            else {set.add(x);}
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(containsDuplicate(arr));
        sc.close();
    }
}

