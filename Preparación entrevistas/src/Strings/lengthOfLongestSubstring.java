package Strings;

import java.util.HashMap;

// Given a string s, find the length of the longest substring without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// // Output: 1
// // Explanation: The answer is "b", with the length of 1.
// // Example 3:

// // Input: s = "pwwkew"
// // Output: 3
// // Explanation: The answer is "wke", with the length of 3.
// // Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

// Constraints:

// 0 <= s.length <= 5 * 104
// s consists of English letters, digits, symbols and spaces.
public class lengthOfLongestSubstring {

    

    public static int lengthOfLongestSubtring(String s)
    {
        if(s == null)
        {
            return 0;
        }
        int large = s.length();
        if(large<=1)
        {
            return large;
        }
        int longest = 0;
        HashMap<Character, Integer> map = new HashMap<>(); 
        for (int j = 0, i = 0; j < large; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            longest = Math.max(longest, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return longest;
         
    }
    public static void main(String[] args) throws Exception {
        String string = "pwwkew";
        System.out.println(lengthOfLongestSubtring(string));
    }

    
}
