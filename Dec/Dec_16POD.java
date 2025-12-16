package Dec;

public class Dec_16POD {

      public boolean areRotations(String s1, String s2) {
         // step 1: jab null check

      //    if(s1 == null || s2 == null) return false;

      //    // step 2 : le
      //       if(s1.length() != s2.length()){
      //             return false;
      //       }

      //         // Step 3: rotation check
      //        String temp = s1 + s1;
      //       return temp.contains(s2);

      // method 2 


         if(s1.length() != s2.length()) return false;
        s1=s1+s1;
        return s1.lastIndexOf(s2)>=0;



        
    }
      public static void main(String[] args) {
            
      }
}
