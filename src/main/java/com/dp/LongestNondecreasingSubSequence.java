package com.dp;

import java.util.Scanner;

/**
 * @program: Algorithms
 * @description: 最长非递减子序列
 *              暴力解法： 时间复杂度O(n*2n方)  空间复杂度O(1)  每个数取和不取，再判断当前序列是否是非递减序列
 *  *          动态规划：时间复杂度O（n2） 空间复杂度O（1）
 * @author: TATE.LU
 * @create: 2020-10-16 16:23
 **/
public class LongestNondecreasingSubSequence {
    public static void main(String[] args){
        int[] nums=new int[]{3,5,1,4,5,2,4,5,6,7,5};
        System.out.println(longestSubSeq(nums));

    }
    public static int longestSubSeq(int[] nums){
        int[] dp=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            dp[i]=1;
        }
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>=nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
        }
        return dp[nums.length-1];
    }
}
