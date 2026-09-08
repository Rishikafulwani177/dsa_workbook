class Solution {
    public int valid(int i, int j, String s){
        int m=i;
        int n=j;
        while(i<j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            } else {
                return -1;
            }
        }
        return n-m+1;
    }

    public String longestPalindrome(String s) {
        int res=1;
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i=0; i<s.length()-1; i++){
            for(int j=i+1; j<s.length(); j++){
                int ans= valid(i, j, s);
                if(ans > res){
                    sb.setLength(0);              // delete everything
                    sb.append(s.substring(i, j+1)); // append new substring
                    res=ans;
                }
            }
        }
        return sb.toString();
    }
}