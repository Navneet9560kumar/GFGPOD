package Aug;

import java.util.*;

public class TywinWarStarategy_13 {

       public int minSoldiers(int[] arr, int k) {
            int n = arr.length;
            int req = (n+1)/2;
            int luckyCount =0;
            List<Integer>cost = new ArrayList<>();

            for(int soldier:arr){
                  if(soldier%k ==0){
                        luckyCount++;
                  }else{
                        cost.add((k-soldier%k)%k);
                  }
            }
            if (luckyCount >= req) {
            return 0;
        }
        Collections.sort(cost);
        int totalCost =0;
        int needed = req -luckyCount;
        for(int i=0; i< needed; i++){
            totalCost += cost.get(i);
        }
        return totalCost;
       }
      public static void main(String[] args) {
            
      }
}
