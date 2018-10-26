//You are given an m x n 2D image matrix where each integer represents a pixel. Flip it in-place along its horizontal axis.
public static void flipHorizontalAxis(int[][] matrix) {
  
  int pom = 0,i=0,j=0;
  int licz =0;
  
  j = matrix.length-1;                              //wielkosc tablicy matrix
       
        for(i = 0 ; i< j ; i++ ){
            for(licz = 0;licz < matrix[0].length; licz++){
                    pom = matrix[i][licz];
                    matrix[i][licz] = matrix[j][licz];
                    matrix[j][licz] = pom;
            }
            j--;
        }
}
