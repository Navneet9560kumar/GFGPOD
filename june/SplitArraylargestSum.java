public class SplitArraylargestSum {
      public int splitArray(int[] arr, int k) {
        int maxElem=arr[0]; int totalsum=0;
        for(int a:arr){
            maxElem=Math.max(maxElem,a);
            totalsum+=a;
        }
        
        int result=0;
        int l=maxElem;
        int r=totalsum;
        
        while(l<=r){
            int mid=l+(r-l)/2;
            
            if(isValid(mid,arr,k)){
                result=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        
        return result;
    }
    
    private boolean isValid(int target,int[] arr,int k){
        int sum=0,count=1;
        
        for(int i=0;i<arr.length;i++){
            if (arr[i] > target) {
                return false;
            }
            
            sum+=arr[i];
            if(sum>target){
                sum=arr[i];
                count++;
            }
        }
        
        return count<=k;
    }

      public static void main(String[] args) {
            SplitArraylargestSum solution = new SplitArraylargestSum();
            int[] arr = {7, 2, 5, 10, 8};
            int k = 2;
            int result = solution.splitArray(arr, k);
            System.out.println("The minimum largest sum is: " + result); // Output: 18
      }
}
