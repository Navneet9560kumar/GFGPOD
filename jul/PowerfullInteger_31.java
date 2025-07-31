package jul;

public class PowerfullInteger_31 {

       public int powerfulInteger(int[][] intervals, int k) {
        // code here
        int max = 0;
        for(int[] interval : intervals) {
            max = Math.max(max, interval[1]);
        }
        int[]diff  = new int[max + 2];
            for(int[] interval : intervals) {
                  int start = interval[0];
                  int end = interval[1];
                  diff[start] += 1;
                  if(end+1 <diff.length){
                        diff[end + 1] -= 1;
                  }
            }
            int active = 0;
            int maxpowerful = -1;
            for(int i=1;i<diff.length;i++){
                  active += diff[i];
                  if(active >= k){
                        maxpowerful = i;
                  }
            }
            return maxpowerful;
    }


      public static void main(String[] args) {
            PowerfullInteger_31 obj = new PowerfullInteger_31();
            int[][] intervals = {{1, 4}, {2, 3}, {4, 6}};
            int k = 2;
            int result = obj.powerfulInteger(intervals, k);
            System.out.println("The powerful integer is: " + result);
      }

      }
}
