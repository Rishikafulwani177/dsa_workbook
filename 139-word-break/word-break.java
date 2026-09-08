class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> set= new HashSet<>();
        boolean[] dp= new boolean[s.length()+1];
        dp[0]= true;

        int maxlen=0;
        for(int i=0; i<wordDict.size(); i++){
            set.add(wordDict.get(i));
            int n= wordDict.get(i).length();
            maxlen= Math.max(maxlen,n);
        }

        for(int i=1; i<=s.length(); i++){
            for(int j= i-1; j>= Math.max(0, i-maxlen); j--){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}