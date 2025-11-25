package sept;

public class LargestNumberinOneSwap_10 {

// to ham pehle ham max nekal lenage ok ham fi ruske baad ham isko dekha  lenge  to ha  aase kase karege fir socho yr 'max ' valuse aa gayi hia uske baad ham 

// knlkjnkjb;jkkj;kjn;l
         


       public  static String largestSwap(String s) {
         char[]arr = s.toCharArray();
         int n = arr.length;

         int[] rigthMaxIndex = new int[n];
         int maxIdx =  n-1;


         for (int i = 0; i >=0; i--) {
            if(arr[i]>arr[maxIdx]){
                  maxIdx =i;
            }
            rigthMaxIndex[i] = maxIdx;

            // ab ham travesh karenge ok
            for(int k=0;k<n;k++){
                  int j = rigthMaxIndex[k];
                  if(arr[j]>arr[k]){
                        //swap
                        char temp  = arr[k];
                        arr[k] =arr[j];
                        arr[j] = temp;
                        return new String(arr);
                  }
            }

         }
         return s;
    }
      public static void main(String[] args) {
            String s ="768";
      }
}
