import java.util.*;

public class LongestSubstringWithoutRepeat {

    public static void main(String[] args) {
        String name = "abcacbaa";

        Solution sol = new Solution();  // create object
        int result = sol.lengthOfLongestSubstring(name);

        System.out.println(result); // prints the answer
    }
}

// separate Solution class
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
}




