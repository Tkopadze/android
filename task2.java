import java.util.Arrays;

class CoinChange {
    public static int minSplit(int amount) {
        int[] coins = {50, 20, 10, 5, 1};

        
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);

  
        dp[0] = 0;

      
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return dp[amount];
    }

    public static void main(String[] args) {
        int amount = 27; 
        int minCoins = minSplit(amount);
        System.out.println("Minimum number of coins to make " + amount + " tetri: " + minCoins);
    }
}
