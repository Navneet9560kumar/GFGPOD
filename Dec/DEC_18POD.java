package Dec;

import java.util.ArrayList;
import java.util.Collections;

public class DEC_18POD {


      public static ArrayList<Integer> odd(int[]arr){
            int n = arr.length;

            
            ArrayList<Integer> oddList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                  if(arr[i]%2!=0){
                   oddList.add(arr[i]);
                  }
            }
            Collections.sort(oddList, Collections.reverseOrder());
      
   
            System.out.println("Odd numbers in Desc: " + oddList);
            return oddList;
     }

      public static ArrayList<Integer> even(int[]arr){
            int n = arr.length;

            ArrayList<Integer> evenList = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                  if(arr[i]%2==0){
                     evenList.add(arr[i]);
                  }
            }
               
      
                System.out.println("Odd numbers in inc order: " + evenList);
                return evenList;
   
     }

      public static void merge(ArrayList<Integer> odd, ArrayList<Integer> even) {
        ArrayList<Integer> finalResult = new ArrayList<>();
        finalResult.addAll(odd);
        finalResult.addAll(even);
        
        System.out.println("Final Merged List: " + finalResult);
    }

      
      public static void main(String[] args) {
            int[]arr = {1, 2, 3, 5, 4, 7, 10};
           ArrayList<Integer> oddPart = odd(arr);
        ArrayList<Integer> evenPart = even(arr);

        merge(oddPart, evenPart);
      }
}

