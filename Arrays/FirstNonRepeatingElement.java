// First Non-Repeating Element (HashMap)

import java.util.*;
public class P11 {

    static int firstNonRepeating(int[] arr) {
        // write your logic here
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int x : arr)
        {
            map.put(x, map.getOrDefault(x,0)+1);
        }

        // Step 2: first element with frequency 1
        for (int x : arr) {
            if (map.get(x) == 1) {
                return x;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(firstNonRepeating(arr));
        sc.close();
    }
}
