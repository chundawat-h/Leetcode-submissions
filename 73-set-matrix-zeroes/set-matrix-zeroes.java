class Solution {
    public void setZeroes(int[][] matrix) {
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0 ; j < matrix[i].length;j++){
                if( visited[i][j] == false && matrix[i][j]==0){
                    visited[i][j]= true;
                    int k = 0;
                    while(k< matrix[i].length){
                        if(matrix[i][k]!=0){
                            visited[i][k] = true;
                        }
                        matrix[i][k]=0;
                        k++;
                    }
                    k = 0;
                    while(k< matrix.length){
                        if(matrix[k][j]!=0){
                            visited[k][j] = true;
                        }
                        matrix[k][j]=0;
                        k++;
                    }
                }
            }
        }
    }
}