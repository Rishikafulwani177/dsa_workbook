class Solution {
    public int sumDecoded(long[] nums) {
        long ans=0;
        for(int i=0; i<nums.length; i++){
            long n= nums[i];
            long l= n%10;
            long d = n / 10;

            int digits = 0;
            long temp = d;
            
            while(temp > 0){
                digits++;
                temp /= 10;
            }
            
            long x = d / (long)Math.pow(10, digits - l);
            long y = d % (long)Math.pow(10, digits - l);
            long r = 1;
            long base = x;
            
            while(y > 0){
                if(y % 2 == 1){
                    r = (r * base) % 1000000007;
                }
            
                base = (base * base) % 1000000007;
                y /= 2;
            }
            ans = (ans + r) % 1000000007;
        }
        return (int)ans;
    }
}