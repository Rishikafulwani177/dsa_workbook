class Solution {

    public int fun(int i, int s, int[] coins, int amount, HashMap<String, Integer> dp) {

        if (s > amount) {
            return Integer.MAX_VALUE;
        }

        if (s == amount) {
            return 0;
        }

        if (i == coins.length) {
            return Integer.MAX_VALUE;
        }

        String key = i + "," + s;

        if (dp.containsKey(key)) {
            return dp.get(key);
        }

        // Take current coin (can take again)
        int c1 = fun(i, s + coins[i], coins, amount, dp);

        if (c1 != Integer.MAX_VALUE) {
            c1 = c1 + 1;
        }

        // Skip current coin
        int c2 = fun(i + 1, s, coins, amount, dp);

        int ans = Math.min(c1, c2);

        dp.put(key, ans);

        return ans;
    }

    public int coinChange(int[] coins, int amount) {

        HashMap<String, Integer> dp = new HashMap<>();

        int res = fun(0, 0, coins, amount, dp);

        if (res == Integer.MAX_VALUE) {
            return -1;
        }

        return res;
    }
}