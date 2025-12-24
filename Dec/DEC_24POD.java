package Dec;

public class DEC_24POD {
      

      public int countLessEqual(int[] arr, int x) {
    int count = 0;

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] <= x) {
            count++;
        }
    }
    return count;
}

      
      public static void main(String[] args) {
            
      }
}
