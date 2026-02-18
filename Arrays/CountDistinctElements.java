// count of distinct elements

import java.util.*;

public class P9 {

    static int countDistinct(int[] arr) {

        // approach 1 (sort then compare)
        // Arrays.sort(arr);
        // int count = 1;
        // for (int i = 0; i < arr.length - 1; i++) {
        //     if (arr[i] != arr[i + 1])
        //         count++;
        // }
        // return count;

        // approach 2 (using HashSet)
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {   // fixed here
            set.add(arr[i]);
        }

        int count = set.size();
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(countDistinct(arr));
        sc.close();
    }
}
