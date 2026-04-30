/*
LeetCode 278 - First Bad Version
Pattern: Binary Search
Time Complexity: O(log n)
Space Complexity: O(1)
*/

public class FirstBadVersion {

    // change this to simulate where "bad" starts
    static int firstBad = 4;

    // Given API
    public static boolean isBadVersion(int version) {
        return version >= firstBad;
    }

    // function
    public static int firstBadVersion(int n) {
        int left = 1, right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid;      // keep mid (maybe first bad)
            } else {
                left = mid + 1;   // discard mid
            }
        }

        return left;
    }

    public static void main(String[] args) {
        int n = 10;

        int ans = firstBadVersion(n);

        System.out.println("First Bad Version: " + ans);
    }
}
