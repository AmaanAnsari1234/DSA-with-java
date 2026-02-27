// Leet Code Problem NO : 485.
// Max Consecutive Ones

import java.util.*;

import static java.lang.Math.max;

public class P18 {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int currentCount = 0;
        int maxCount = 0;

        for (int num : nums)
        {
            if (num==1)
            {
                currentCount++;
                maxCount = Math.max(maxCount,currentCount);
            }
            else currentCount=0;
        }
        return maxCount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(nums);
        System.out.println(result);

        sc.close();
    }
}

