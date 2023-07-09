package com.dp;

/**
 * @program: Algorithms
 * @description: 最少硬币问题
 * @author: TATE.LU
 * @create: 2020-10-16 15:01
 **/
public class CoinsForChange {
    public static void main(String[] args){
        int[] coins=new int[]{2,3,5};
        int sum=11;
        System.out.println(minCoins(coins,sum));
    }

    public static int minCoins(int[] coins,int sum){
        int[] dp=new int[sum+1];
        for(int i=0;i<=sum;i++){
            dp[i]=i;
        }

        for(int i=1;i<=sum;i++){
            for(int j=0;j<coins.length;j++){
                if(i>=coins[j]){
                    dp[i]=Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[sum];

    }
}
