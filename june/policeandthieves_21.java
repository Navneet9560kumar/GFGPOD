import java.util.LinkedList;
import java.util.Queue;

public class policeandthieves_21 {


       public int catchThieves(char[] arr, int k) {
        // code here
        Queue<Integer> police=new LinkedList<>(),thieves=new LinkedList<>();
        int caught=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='P') police.offer(i);
            else thieves.offer(i);
        }
        while(!police.isEmpty() && !thieves.isEmpty()){
            if(Math.abs(police.peek()-thieves.peek())<=k){
                caught++;
                police.poll();
                thieves.poll();
            }else if(police.peek()<thieves.peek()) police.poll();
            else thieves.poll();
        }
        return caught;
    }
      public static void main(String[] args) {
            int[]arr = {'p','t','p'};
            int k = 1;
      }
}
