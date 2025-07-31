package jul;




// yr 31 gfgf ke leye ham kar rahe hai ok usko sekhne ke leye ye quyestion hia 
public class FrequencyCountingwithfullrange_31 {

       public static int powerfulInteger(int[][] intervals, int k){
            int max = intervals[0][1];
            int n = intervals.length;
            for (int i = 0; i < n; i++) {
                  max = Math.max(max, intervals[i][1]);
                  
            }
            int[] count = new int[max +1];
             // Count occurrences of each 
        // integer in the intervals
        for(int i=0; i<n;i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            for(int j =start; j <= end; j++){
                  count[j]++;
            }
        }
         int ans = -1;
        // Find the powerful integer
        // with freq >=k
        for(int i=0; i<= max; i++){
            if(count[i]>=k){
                  ans =i;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1, 4}, {2, 3}, {4, 6}};
        int k = 2;
        int result = powerfulInteger(intervals, k);
        System.out.println("The powerful integer is: " + result);
    }
}
