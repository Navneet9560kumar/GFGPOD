package jul;

public class setMartixZero {

       public void setMatrixZeroes(int[][] mat) {
            int rows =mat.length;
            int cols = mat.length;
            boolean[] rowZero = new boolean[rows];
       boolean[] colZero = new boolean[cols];


           for (int i = 0; i < rows; i++) {
             for (int j = 0; j < cols; j++) {
                  if(mat[i][j] ==0){
                        rowZero[i] =true;
                        colZero[j] = true;
                  }
             }
           }
        // code here
          for(int i=0; i< rows;i++){
                  if(rowZero[i]){
                        for (int j = 0; j < cols; j++) {
                              mat[i][j] =0;
                        }
                  }
          }

          for(int j=0;j< cols;j++){
            if(colZero[j]){
                  for(int i=0;i< rows;i++){
                        mat[i][j] =0;
                  }
            }
          }
    }
      public static void main(String[] args) {
            
      }
}
