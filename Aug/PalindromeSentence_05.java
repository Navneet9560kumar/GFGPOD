package Aug;

public class PalindromeSentence_05 {

    public static boolean isPalinSent(String s) {
        // code here
        s = s.toLowerCase().replaceAll("[^a-z0-9]", ""); // remove non-alphanumerics

        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

    }
}
