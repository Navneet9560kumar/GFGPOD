package jul;
import java.util.*;
public class MejortyElementMoreThannBY3 {


      //  agr map ke help se frequebnce find karni ho to 
      public static void freq(int[]arr){
            Map<Integer, Integer> freeMap = new HashMap<>();
            for(int num :arr){
                  freeMap.put(num,freeMap.getOrDefault(num, 0) +1);
            }
            // print frequence
            for(Map.Entry <Integer,Integer >entry:freeMap.entrySet()){
                  System.out.println("Element" + entry.getKey() + "Frequency"+ entry.getValue());
            }
      }



       public ArrayList<Integer> findMajority(int[] arr) {
        // Code here
         Map<Integer, Integer> freqMap  = new HashMap<>();
            for(int num :arr){
                  freqMap .put(num,freqMap .getOrDefault(num, 0) +1);
            }

              for (int freq : freqMap.values()) {
            if (freq == 1 || freq == 2) {
                return new ArrayList<>(); // return empty list
            }
        }
         // Step 3: Otherwise, return elements whose freq >= 3
        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() >= 3) {
                result.add(entry.getKey());
            }
        }

        return result;
    }

      public static void main(String[] args) {
            int[] arr = {2, 2, 3, 1, 3, 2, 1, 1};
            freq(arr);
      }
}
