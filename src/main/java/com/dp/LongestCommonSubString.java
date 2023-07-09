package com.dp;

import java.util.Scanner;

/**
 * @program: Algorithms
 * @description: 最长公共子序列
 * @author: TATE.LU
 * @create: 2020-10-16 16:57
 **/
public class LongestCommonSubString {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str1=scanner.nextLine();
        String str2=scanner.nextLine();
        System.out.println(cal(str1,str2));
    }
    public static int cal(String str1,String str2){
        int[][] dp=new int[str1.length()+1][str2.length()+1];
        dp[0][0]=0;
        for(int i=1;i<=str1.length();i++){
            for(int j=1;j<=str2.length();j++){
                if(str1.charAt(i-1)==str2.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }

        return dp[str1.length()][str2.length()];

    }
}
