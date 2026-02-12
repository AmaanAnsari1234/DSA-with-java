//  maximum number of steps you can jump forward
// Given an array where each element represents the maximum jump length from that index,
// find the minimum number of jumps required to reach the last index.
// Return -1 if it is not possible to reach the end.

import java.util.*;

public class P6 {

    static int minJumps(int[] arr) {

        int n = arr.length;

        // Edge cases
        if (n == 1)
            return 0;

        if (arr[0] == 0)
            return -1;

        int maxReach = arr[0];   // farthest index reachable
        int steps = arr[0];      // steps remaining in current jump
        int jumps = 1;           // we start with one jump

        for (int i = 1; i < n; i++) {

            // If we've reached the end
            if (i == n - 1)
                return jumps;

            // Update maxReach
            maxReach = Math.max(maxReach, i + arr[i]);

            steps--;

            // No more steps left
            if (steps == 0) {
                jumps++;

                // If we cannot move forward
                if (i >= maxReach)
                    return -1;

                // Reinitialize steps
                steps = maxReach - i;
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

        System.out.println(minJumps(arr));
        sc.close();
    }
}
