public class LexicographicallyLargest_24 {

    public static String maxSubseq(String s, int k) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            while (ans.length()>00 && k>0 && ans.charAt(ans.length()-1)< currentChar) {
                  ans.deleteCharAt(ans.length()-1);
                  k--;
            }
            ans.append(currentChar);
        }
        while (k>0) {
            ans.deleteCharAt(ans.length()-1);
            k--;
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String s1 = "ritz";
        int k1 = 2;
        System.out.println(maxSubseq(s1, k1)); // Output: "tz"

        String s2 = "zebra";
        int k2 = 3;
        System.out.println(maxSubseq(s2, k2)); // Output: "zr"
    }
}
