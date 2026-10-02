class Solution {
    public void setZeroes(int[][] matrix) {
        HashMap<Integer,Integer> mapi = new HashMap<>();
        HashMap<Integer,Integer> mapj= new HashMap<>();

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j]==0){
                    mapi.put(i, mapi.getOrDefault(i,0)+1);
                    mapj.put(j, mapj.getOrDefault(j,0)+1);
                }

            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(mapi.getOrDefault(i,0)>0 || mapj.getOrDefault(j,0)>0){
                    matrix[i][j]=0;
                }
            }

        }
        
    }
}