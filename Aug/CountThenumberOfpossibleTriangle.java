package Aug;

public class CountThenumberOfpossibleTriangle {

      public static boolean isvaliedtringli(int arr[]){
            int n = arr.length;
       if (n < 3) return false;
          // Check all combinations of 3 sides
    for (int i = 0; i < n - 2; i++) {
        for (int j = i + 1; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                // Triangle inequality check
                if (arr[i] + arr[j] > arr[k] &&
                    arr[i] + arr[k] > arr[j] &&
                    arr[j] + arr[k] > arr[i]) {
                    System.out.println("Valid triangle: " + arr[i] + ", " + arr[j] + ", " + arr[k]);
                    return true;
                }
            }
        }
    }

    return false;
}



      public int countTriangles(int arr[]) {
            // code here
              int n = arr.length;
            int count =0;
             
       if (n < 3) return 0;
          // Check all combinations of 3 sides
    for (int i = 0; i < n - 2; i++) {
        for (int j = i + 1; j < n - 1; j++) {
            for (int k = j + 1; k < n; k++) {
                // Triangle inequality check
                if (arr[i] + arr[j] > arr[k] &&
                    arr[i] + arr[k] > arr[j] &&
                    arr[j] + arr[k] > arr[i]){
                        count++;
                    }
                        return count;
                  }
  
        
    }
      public static void main(String[] args) {
            
      }
}
