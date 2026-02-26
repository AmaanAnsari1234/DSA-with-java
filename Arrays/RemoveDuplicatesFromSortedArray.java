// Leet Code Problem No : 26
// Remove Duplicates from Sorted Array (the entered array must be sorted)

import java.util.*;

public class P17 {

    // You will write this method
    public static int removeDuplicates(int[] nums) {
        // write your logic here
        int unique = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1])
            {
                unique = unique+1;
                nums[unique-1] = nums[i];
            }
        }
        return unique;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int k = removeDuplicates(nums);

        // Print k (number of unique elements)
        System.out.println("No of unique Elements : "+k);

        // Print first k elements of array
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}

