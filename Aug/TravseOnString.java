package Aug;

public class TravseOnString {
      public static void main(String[] args) {
            String str  = "Navneet";
            String s = "Nav";
            int n = str.length();
            for (int i = 0; i < n; i++) {
                 if(str.charAt(i)==s.charAt(i)){
                  System.out.println("true ");
                 }else{
                  System.out.println("False");
                 }
            }
      }
}
