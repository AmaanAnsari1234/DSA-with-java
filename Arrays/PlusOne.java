/*
LeetCode 66 - Plus One
Pattern: Array Simulation
Time Complexity: O(n)
Space Complexity: O(1)
*/

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        
        for (int i = digits.length - 1; i >= 0; i--) {
            
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            
            digits[i] = 0;
        }
        
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        
        return result;
    }

    public static void main(String[] args) {
        
        int[] digits = {2, 9, 9};
        
        int[] result = plusOne(digits);
        
        System.out.println("Result: " + Arrays.toString(result));
    }
}
