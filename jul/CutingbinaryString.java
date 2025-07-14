package jul;

import java.util.HashSet;

public class CutingbinaryString {

      void f(String str, HashSet<String>set, int psf,int ans[]) {
		if(str.length()==0) {
			ans[0]=Math.min(ans[0], psf);
			return;
		}
		
		for(int i=0;i<str.length();i++) {
			String pre=str.substring(0,i+1);
			if(set.contains(pre)) {
				f(str.substring(i+1),set,psf+1,ans);
			}
		}	
		
	} 

        public int cuts(String s) {
        HashSet<String> set =new HashSet<>();
		long temp=1;
		set.add("1");
		for(int i=0;i<13;i++) {
			temp=temp*5;
			String str=Long.toBinaryString(temp);
			set.add(str);
		}
	
		int ans[]= {Integer.MAX_VALUE};
		f(s,set,0,ans);
    	return ans[0]==Integer.MAX_VALUE?-1:ans[0]; 
        
    }


       public static void main(String[] args) {
            
        String[] testCases = {
            "101101101",   // Expected: 3 (101=5, 101=5, 101=5)
            "1111101",     // Expected: 1 (1111101 = 125)
            "00000",       // Expected: -1 (cannot start with 0)
            "1010",        // Expected: -1 (no valid power of 5)
            "1",           // Expected: 1
            "11001",       // Expected: 1 (11001 = 25)
        };

		CutingbinaryString obj = new CutingbinaryString();
		for (String test : testCases) {
			int result = obj.cuts(test);
			System.out.println("Binary string: " + test + " => Cuts: " + result);
		}
       }
}
