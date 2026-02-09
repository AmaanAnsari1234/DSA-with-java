// isSorted
// enter the size of array, values in the array
// if Sorted returns -> yes
//      else returns -> No

import java.util.*;

public class P3 {

    static boolean isSorted(int[] arr) {

        // An array with 0 or 1 element is always sorted
        if (arr.length <= 1) {
            return true;
        }

        // Check adjacent elements
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;   // not sorted
            }
        }

        return true; // sorted
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean result = isSorted(arr);

        if (result) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }
}
