package Dec;

public class colwishtravesh {

      public static int col(String[] strs) {
            int rows = strs.length;
            int cols = strs[0].length(); // sab strings same length ki maan rahe hain
            int count = 0;

            // String[] columns = new String[cols];

            // for (int j = 0; j < cols; j++) {
            //       StringBuilder sb = new StringBuilder();

            //       for (int i = 0; i < rows; i++) {
            //             sb.append(strs[i].charAt(j));
            //       }

            //       columns[j] = sb.toString();


            

            // Print result
            // for (String col : columns) {
            // System.out.println(col);
            // }


             for (int j = 0; j < cols; j++) {          // column-wise
            for (int i = 0; i < rows - 1; i++) {  // row comparison
                if (strs[i].charAt(j) > strs[i + 1].charAt(j)) {
                    count++;
                    break; // move to next column
                }
            }
        }
        return count;
}

      

    

      public static void main(String[] args) {

      }

}


//strs = ["abc", "bce", "cae"] 
// a  b  c
// b  c  a
// c  e  e
// ↑  ↑  ↑
// |  |  |
// abc bca cee
