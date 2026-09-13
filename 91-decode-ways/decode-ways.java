class Solution {
    public int fun(int i, String s, int[] dp){
        if(i==s.length()){
            return 1;
        }

        if(i>s.length()){
            return 0;
        }

        if(dp[i] != -1){
            return dp[i];
        }

        int c1=0;
        int c2=0;
        if(s.charAt(i) != '0'){
            c1= fun(i+1, s,dp);
            if(i+1<s.length()){
                //String two = s.substring(i, i + 2);
                int num = Integer.parseInt(s.substring(i, i + 2));

                if (num <= 26) {
                    c2 = fun(i + 2, s, dp);
                }
            }
        }
        return dp[i]= c1+c2;
    }

    public int numDecodings(String s) {
        int[] dp= new int[s.length()+1];
        Arrays.fill(dp,-1);
        return fun(0,s,dp);
    }
}