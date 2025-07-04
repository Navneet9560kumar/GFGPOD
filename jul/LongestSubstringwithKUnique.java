package jul;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringwithKUnique {

      public static int longestKSubstr(String s, int k) {
        // code here
         int maxLen = -1;
        int n = s.length();

        // Loop through all substrings
        for (int i = 0; i < n; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < n; j++) {
                set.add(s.charAt(j));
                if (set.size() > k) break;

                if (set.size() == k) {
                    int len = j - i + 1;
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;
    }
      public static void main(String[] args) {
            
      }
}
