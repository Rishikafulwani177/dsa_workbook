class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int res=0;
        int[][] diff= new int[costs.length][costs.length];
        for(int i=0; i<costs.length; i++){
            int d=  costs[i][0] - costs[i][1];
            diff[i][0]= d;
            diff[i][1]= i;
        }

        Arrays.sort(diff, (a,b) -> Integer.compare(a[0],b[0]));
        for(int i=0; i<(costs.length/2); i++){
            int a= diff[i][1];
            res+= costs[a][0];
        }
        for(int i=(costs.length)/2; i<costs.length; i++){
            int b= diff[i][1];
            res+= costs[b][1];
        }
        return res;
    }
}