package Dec;

public class DEC_29POD {

      public static int merge(int[] arr1, int[] arr2, int k){
           int n1 = arr1.length;
        int n2 = arr2.length;
        
        // 1. Merge sorted arrays (Logic: )
        int[] merged = new int[n1 + n2];
        int i = 0, j = 0, index = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] <= arr2[j]) {
                merged[index++] = arr1[i++];
            } else {
                merged[index++] = arr2[j++];
            }
        }

        // Bache hue elements copy karein
        while (i < n1) merged[index++] = arr1[i++];
        while (j < n2) merged[index++] = arr2[j++];

        // 2. K-th index value return karein
        // Note: k valid range mein hona chahiye
        if (k >= 0 && k < merged.length) {
            return merged[k];
        } else {
            return -1; // Error case
        }
    }

            //
      
      public static void main(String[] args) {
            
      }     
}
