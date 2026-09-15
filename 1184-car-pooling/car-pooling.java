class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int max = 0;

        for (int[] trip : trips) {
            max = Math.max(max, trip[2]);
        }
        
        int[] arr = new int[max + 1];
        
        for(int i=0; i<trips.length; i++){
            int start= trips[i][1];
            int end= trips[i][2];
            int c= trips[i][0];
            arr[start]= arr[start]+c;
            arr[end]= arr[end]-c;
        }

        int res=0;

        for(int i=0; i<arr.length; i++){
            res+= arr[i];
            if(res>capacity){
                return false;
            }
        }
        return true;
    }
}