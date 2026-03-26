/*
LeetCode 3 - Longest Substring Without Repeating Characters

Approach:
Sliding Window + HashMap

Key Idea:
- Use a HashMap to store last index of each character
- If duplicate found, move left pointer to (last index + 1)
- Always maintain a window with unique characters
*/

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);

            // If character already seen, move left pointer
            if (map.containsKey(current)) {
                left = Math.max(left, map.get(current) + 1);
            }
            // Update latest index of character
            map.put(current, right);

            // Calculate max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";

        int result = lengthOfLongestSubstring(s);
        System.out.println("Longest Length: " + result);
    }
}
