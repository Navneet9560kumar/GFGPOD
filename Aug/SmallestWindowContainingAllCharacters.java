package Aug;

public class SmallestWindowContainingAllCharacters {

    public static boolean hasAllChars(String sub, String p) {
        int[] count = new int[256];

        // Count chars of p
        for (int i = 0; i < p.length(); i++) {
            count[p.charAt(i)]++;
        }

        // Reduce count if sub contains char
        for (int i = 0; i < sub.length(); i++) {
            if (count[sub.charAt(i)] > 0) {
                count[sub.charAt(i)]--;
            }
        }

        // Check if any char still missing
        for (int i = 0; i < 256; i++) {
            if (count[i] > 0) {
                return false;
            }
        }
        return true;
    }

    public static String smallestWindow(String s, String p) {
        int n = s.length();
        int minLen = Integer.MAX_VALUE;
        String res = "";

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {  // <-- yaha fix kiya (j=i se start)
                String sub = s.substring(i, j + 1);
                if (hasAllChars(sub, p)) {
                    int currlen = sub.length();
                    if (currlen < minLen) {
                        minLen = currlen;
                        res = sub;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String s = "zoomlazapzo";
        String p = "oza";
        System.out.println(smallestWindow(s, p));  // Output: "BANC"
    }
}


// BFS
