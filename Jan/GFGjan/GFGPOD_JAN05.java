package Jan.GFGjan;

public class GFGPOD_JAN05 {

      // yo max sum ka karna to mere demag mai phela method aaya hai ke sliding window aaya hai ok usko implemment karna hai 

//        public static int maxSubarraySum(int[] arr, int k) {
//         // Code here
//         int windowSum =0;
//         int maxsum =0;

//         for (int i = 0; i < arr.length; i++) {
//             windowSum += arr[i]; // add next element

//             if(i>=k-1){
//                   maxsum = Math.max(maxsum, windowSum);
//                   windowSum -= arr[i - (k - 1)]; // remove the element going out of the window
//             }
//         }

//         return maxsum;
//     }
     // is se kaam chal rhaa ho gaya 

     // but ab brout force se bhi kar sakte hai 


      public static int maxSubarraySum(int[] arr, int k){
             int n = arr.length;
             int maxsum  = Integer.MIN_VALUE;
             for(int i=0; i<=n;i++){
                  int sum =0;
                  for(int j=i;j< i+k && j<n;j++){
                        sum += arr[j];
                  }
                  maxsum = Math.max(maxsum, sum);
             }
             return maxsum;
      }
      public static void main(String[] args) {
            
      }
}
