class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalgas = 0;
        int totalcost = 0;

        for(int i = 0; i < gas.length; i++){
            totalgas += gas[i];
            totalcost += cost[i];
        }

        if(totalgas < totalcost){
            return -1;
        }

        int gasi = 0;
        int start = 0;

        for(int i = 0; i < gas.length; i++){
            gasi = gasi + gas[i] - cost[i];

            if(gasi < 0){
                gasi = 0;
                start = i + 1;
            }
        }

        return start;
    }
}