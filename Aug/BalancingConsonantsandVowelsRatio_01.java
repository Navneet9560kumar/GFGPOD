package Aug;

public class BalancingConsonantsandVowelsRatio_01 {


      public static int countBalanced(String[] arr) {
        // code here
        int ans =0;
        int n = arr.length;
          for(int i=0;i<n;i++){
            int cons =0, vow =0;
            for (int j = 0; j < n; j++) {
                  StringBuilder cur =  new StringBuilder();
                  cur.append(arr[j]).toString();
                  for(char ch : cur.toString().toCharArray()){
                        if(isVowel(ch)){
                              vow++;
                        } else {
                              cons++;
                        }
                        if(cons == vow){
                              ans++;
                        }
                  }
            }
          }
          return ans;
    }

    static boolean isVowel(char ch){
            return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U';
    }
      public static void main(String[] args) {
            
      }
}
