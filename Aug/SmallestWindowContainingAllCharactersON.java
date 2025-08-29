package Aug;

public class SmallestWindowContainingAllCharactersON {

    public static String smallestWindow(String s, String p) {
        if (s.length() < p.length()) {
            return "";
        }

        int[] patFreq = new int[256];
        for (char c : p.toCharArray()) {
            patFreq[c]++;
        }

        int[] strFreq = new int[256];
        int start = 0, startIndex = -1;
        int minLen = Integer.MAX_VALUE;
        int count = 0;

        for (int end = 0; end < s.length(); end++) {
            strFreq[s.charAt(end)]++;

            if (patFreq[s.charAt(end)] != 0 &&
                strFreq[s.charAt(end)] <= patFreq[s.charAt(end)]) {
                count++;
            }

            if (count == p.length()) {
                while (strFreq[s.charAt(start)] > patFreq[s.charAt(start)]
                       || patFreq[s.charAt(start)] == 0) {
                    if (strFreq[s.charAt(start)] > patFreq[s.charAt(start)]) {
                        strFreq[s.charAt(start)]--;
                    }
                    start++;
                }

                int windowLen = end - start + 1;
                if (windowLen < minLen) {
                    minLen = windowLen;
                    startIndex = start;
                }
            }
        }

        if (startIndex == -1) {
            return "";
        }

        return s.substring(startIndex, startIndex + minLen);
    }

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String p = "ABC";
        System.out.println(smallestWindow(s, p)); // Output: BANC
    }
}
