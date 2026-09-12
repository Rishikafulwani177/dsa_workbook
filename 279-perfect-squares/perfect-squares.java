class Solution {
    public int fun(int i,int sum, List<Integer> sq, int n,int target, int[][] dp){
        if(i==sq.size()){
            return Integer.MAX_VALUE;
        }

        if(sum==target){
            return 0;
        }

        if(sum>target){
            return Integer.MAX_VALUE;
        }

        if(dp[i][sum] != -1){
            return dp[i][sum];
        }

        int num= sq.get(i);
        int c1= Integer.MAX_VALUE;
        if(num <= n){
            int r= fun(i,sum+num,sq,n-num,target,dp);
            if(r!= Integer.MAX_VALUE){
                c1=1+r;
            }
        }
        int c2= fun(i+1, sum, sq, n,target,dp);
        return dp[i][sum]= Math.min(c1,c2);
    }

    public int numSquares(int n) {
        List<Integer> sq= new ArrayList<>();
        if(n==1 || n==0){
            return n;
        }

        for(int i=1; i<n; i++){
            int s= i*i;
            if(s<=n){
                sq.add(s);
            } else {
                break;
            }
        }
        Collections.reverse(sq);

        int[][] dp= new int[sq.size()][n+1];
        for(int i=0; i<dp.length; i++){
            Arrays.fill(dp[i],-1);
        }

        return fun(0,0,sq,n,n,dp);
    }
}