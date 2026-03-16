// LeetCode 11 – Container With Most Water.

// Input array: --> [1,8,6,2,5,4,8,3,7]
// Output -->> Maximum Water = 49

import java.util.*;

public class P28 {

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;

        int maxWater = 0;

        while (left < right) {

            int width = right - left;

            int h = Math.min(height[left], height[right]);

            int area = width * h;

            maxWater = Math.max(maxWater, area);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {

        int[] height = {1,8,6,2,5,4,8,3,7};

        int result = maxArea(height);

        System.out.println("Maximum Water = " + result);
    }
}


