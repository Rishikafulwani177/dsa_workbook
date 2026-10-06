class Solution {
    public int reverse(int x) {
        boolean neg= false;
        if(x<0){
            neg= true;
            if (x == Integer.MIN_VALUE) {
                return 0;
            }
            x= x*-1;
        }

        int res=0;
        while(x>0){
            int n= x % 10;
            if (res > Integer.MAX_VALUE / 10 ||
            (res == Integer.MAX_VALUE / 10 && n > 7)) {
                return 0;
            }
            res= (res*10) + n;
            x= x/10;
        }

        if(neg == true){
            return res*-1;
        }
        return res;
    }
}