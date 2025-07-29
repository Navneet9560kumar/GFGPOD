package jul;

import java.util.ArrayList;
import java.util.Arrays;

public class AsciRangeSum {


          public ArrayList<Integer> asciirange(String s){
            int []frist = new int[26], last = new int[26];
            Arrays.fill(frist, -1); 
            Arrays.fill(last, -1);
            ArrayList<Integer> res =  new ArrayList<>();
            int n = s.length();
            for(int i=0;i<n;i++){
                  int idx = s. charAt(i)-'a';
                  if(frist[idx]==-1) frist[idx] =i;
                  last[idx] =i;
            }
            for (int c = 0; c < 26; c++) {
            if (frist[c] != -1 && frist[c] < last[c]) {
                int sum = 0;
                for (int i = frist[c] + 1; i < last[c]; i++)
                    sum += s.charAt(i);
                if (sum != 0) res.add(sum);
            }
        }

        return res;
    }
          
      public static void main(String[] args) {
            
      }
}
