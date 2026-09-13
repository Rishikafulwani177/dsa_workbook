class Solution {
    public long fun(int i, char last, int n, HashMap<String,Long> dp){
        if(i==n){
            return 1;
        }

        String key = i + "" + last;
        if(dp.containsKey(key)){
            return dp.get(key);
        }

        long c1=0;
        long c2=0;
        long c3=0;
        long c4=0;
        long c5=0;
        
        if(last=='a'){
            c1= fun(i+1, 'e', n, dp);
        }

        if(last=='e'){
            long r= fun(i+1, 'a', n ,dp);
            long s= fun(i+1, 'i', n ,dp);
            c2= r+s;
        }

        if(last=='i'){
            long p= fun(i+1, 'a',n, dp);
            long q= fun(i+1, 'e',n, dp);
            long x= fun(i+1, 'o',n, dp);
            long y= fun(i+1, 'u',n, dp);
            c3= p+q+x+y;
        }

        if(last=='o'){
            long l= fun(i+1, 'i', n ,dp);
            long k= fun(i+1, 'u', n ,dp);
            c4= l+k;
        }

        if(last=='u'){
            c5= fun(i+1,'a', n, dp);
        }
        
        long ans = (c1 + c2 + c3 + c4 + c5) % 1000000007;
        dp.put(key, ans);
        return ans;
    }

    public int countVowelPermutation(int n) {
        HashMap<String, Long> dp= new HashMap<>();

        long c1=fun(1, 'a', n , dp);
        long c2=fun(1, 'e', n , dp);
        long c3=fun(1, 'i', n , dp);
        long c4=fun(1, 'o', n , dp);
        long c5=fun(1, 'u', n , dp);
        return (int)((c1 + c2 + c3 + c4 + c5) % 1000000007);
    }
}