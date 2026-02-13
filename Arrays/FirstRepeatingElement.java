// first repeating element (by index)

import java.util.*;

public class P7 {

    static int firstRepeating(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        int result =-1;

        for (int i = arr.length-1; i>= 0; i--) {
            if (set.contains(arr[i]))
                result = arr[i];
            else set.add(arr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(firstRepeating(arr));
        sc.close();
    }
}
