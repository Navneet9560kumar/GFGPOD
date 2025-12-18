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

// second method
     public void sortIt(int[] arr) {
        ArrayList<Integer> oddList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();

        // 1. Single Loop mein divide karo
        for (int x : arr) {
            if (x % 2 != 0) oddList.add(x);
            else evenList.add(x);
        }

        // 2. Odd ko Descending aur Even ko Ascending (as per standard problem)
        Collections.sort(oddList, Collections.reverseOrder());
        Collections.sort(evenList);

        // 3. Bina extra merge function ke, direct original array mein overwrite karo
        int index = 0;
        
        // Pehle Odd numbers bharo
        for (int num : oddList) {
            arr[index++] = num;
        }
        
        // Phir Even numbers bharo
        for (int num : evenList) {
            arr[index++] = num;
        }
    }

      
      public static void main(String[] args) {
            int[]arr = {1, 2, 3, 5, 4, 7, 10};
           ArrayList<Integer> oddPart = odd(arr);
        ArrayList<Integer> evenPart = even(arr);

        merge(oddPart, evenPart);
      }
}

