class Solution {
    public void setZeroes(int[][] matrix) {
        TreeSet<Integer> rows = new TreeSet<>();
        TreeSet<Integer> cols = new TreeSet<>();
        for (int i = 0 ; i < matrix.length; i++){
            for (int j = 0 ; j < matrix[i].length;j++){
                if(matrix[i][j]==0){
                    rows.add(i);
                    cols.add(j);
                }
            }
        }
        while(!rows.isEmpty()){
            int x = rows.pollFirst();
            for (int j = 0 ; j < matrix[0].length;j++){
                matrix[x][j]=0;
            }           
        }
        while(!cols.isEmpty()){
            int x = cols.pollFirst();
            for (int j = 0 ; j < matrix.length;j++){
                matrix[j][x]=0;
            }           
        }


    }
}