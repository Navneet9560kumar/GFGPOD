package Aug;

public class maxnonoverlapingPalidrom {


     public  static String getPalindrome(String s){
      String st = s.toLowerCase();
      int start=0;
      int end = st.length()-1;

      while (start<end) {
            if(st.charAt(start)!= st.charAt(end)){
                  return "";
            }
            start++;
            end--;
      }
      return s;
     }

      public static int maxSum(String s) {
        int count =0;
        
        
    }

      public static void main(String[] args) {
            
      }
}
