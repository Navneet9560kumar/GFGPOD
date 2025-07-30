package jul;

public class SubArryasumfork30 {

      public int subArraySum(int[] arr, int k) {
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                  int sum = 0;
                  for (int j = i; j < arr.length; j++) {
                  sum += arr[j];
                  if (sum == k) {
                        count++;
                  }
                  }
            }
            return count;
      }
	  public static void main(String[] args) {
            SubArryasumfork30 obj = new SubArryasumfork30();
            int[] arr = {1, 2, 3, 4, 5};
            int k = 5;
            int result = obj.subArraySum(arr, k);
            System.out.println("Number of subarrays with sum " + k + ": " + result);
        }
}
