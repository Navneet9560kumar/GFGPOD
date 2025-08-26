package Aug;

public class CheckIfStringisSubsequenceofOther {
      public boolean isSubSeq(String s1, String s2) {
        // code here'
         
       if (isSubsequence(s1, s2)){
            return true;
       }else return false;
        
    }
    public static boolean isSubsequence(String s1, String s2){
      int i=0,j=0;
      while (i<s1.length() &&  j< s2.length()) {
            if(s1.charAt(i)==s2.charAt(j)){
                  j++;
            }
            i++;
      }
      return j== s2.length();
    }
      public static void main(String[] args) {
            
      }
}
