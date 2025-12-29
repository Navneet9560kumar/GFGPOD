package Dec;

public class Dec_27_POD {


       public int kthSmallest(int[][] mat, int k) {
        // code here
         

    }
       public static void main(String[] args) {

        int[] arr = {10, 40, 20, 50, 30};

        Integer firstMax = null;
        Integer secondMax = null;
        Integer thirdMax = null;

        for (int num : arr) {

            // ignore duplicates
            if ((firstMax != null && num == firstMax) ||
                (secondMax != null && num == secondMax) ||
                (thirdMax != null && num == thirdMax)) {
                continue;
            }

            if (firstMax == null || num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;

            } else if (secondMax == null || num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;

            } else if (thirdMax == null || num > thirdMax) {
                thirdMax = num;
            }
        }

        System.out.println("First Max: " + firstMax);
        System.out.println("Second Max: " + secondMax);
        System.out.println("Third Max: " + thirdMax);
    }
}


