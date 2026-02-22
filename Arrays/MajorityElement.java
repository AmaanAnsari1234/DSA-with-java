// Majority element ||

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P13 {

    public static void main(String[] args) {

        HashMap<Integer,Integer> map =  new HashMap<>();

        int[] arr = {1, 2, 2, 2, 5};
        int n = arr.length;

        for (int x : arr) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        System.out.println(map);

        // ✅ Changed loop to avoid duplicate printing
        for (int key : map.keySet()) {
            if (map.get(key) > (n / 2)) {
                System.out.println(key);
            }
        }
    }

    // (Keeping your Solution class as it is)
    class Solution {
        public List<Integer> majorityElement(int[] nums) {

            List<Integer> result = new ArrayList<>();
            HashMap<Integer, Integer> map = new HashMap<>();

            // 1. Count frequency
            for (int x : nums) {
                map.put(x, map.getOrDefault(x, 0) + 1);
            }

            // 2. Threshold
            int limit = nums.length / 3;

            // 3. Collect elements appearing more than n/3 times
            for (int key : map.keySet()) {
                if (map.get(key) > limit) {
                    result.add(key);
                }
            }

            return result;
        }
    }
}
