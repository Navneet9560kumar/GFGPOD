package Jan.GFGjan;

public class GFGPOD_JAN_23 {

       public static int maxVisiblePeople(int[] arr) {
            int n = arr.length;
            int ans =0;
            for(int i=0;i<n;i++){
                  int count =1;

                  for (int j = i+1; j < n; j++) {
                       if(arr[j]<arr[i]){
                        count++;
                       } else{
                        break;
                       }
                  }
                  for (int j = i-1; j < n; j++) {
                        if(arr[j]<arr[i]){
                              count++;
                        }else{
                              break;
                        }
                  }
                  ans = Math.max(ans,count);
            }
            return ans;
       }
      public static void main(String[] args) {
            
      }
}
