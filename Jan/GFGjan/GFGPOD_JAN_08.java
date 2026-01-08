package Jan.GFGjan;

public class GFGPOD_JAN_08 {

      public int countSubarrays(int[] arr, int k) {
        // code here
                return countAtMost(arr, k) - countAtMost(arr, k - 1);

    }

    public int countAtMost(int[]arr, int k){
      int left =0, oddcount =0, result =0;

      for(int right =0;right <arr.length;right++){
            if(arr[right]%2 ==1){
                  oddcount++;
            }
            while (oddcount>k) {
                  if(arr[left]%2 ==1){
                        oddcount--;
                  }
                  left++;
            }
            result += (right -left +1);
      }
      return result;
    }


      public static void main(String[] args) {
            
      }
}
