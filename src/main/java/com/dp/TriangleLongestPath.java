package com.dp;

import java.util.Scanner;

/**
 * @program: Algorithms
 * @description: 三角形最长路径问题
 *          暴力解法：深度优先遍历 时间复杂度  空间复杂度O(logn)
 *          动态规划：时间复杂度O（n2） 空间复杂度O（1）
 *
 * @author: TATE.LU
 * @create: 2020-10-16 15:35
 **/
public class TriangleLongestPath {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int rows=scanner.nextInt();

        int[][] nums=new int[rows][rows];
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                nums[i][j]=scanner.nextInt();
            }
        }
        System.out.println(longestPath(nums));


    }
    public static int longestPath(int[][] nums){
        int row=nums.length;
        int col=nums[0].length;
        for(int i=row-1;i>0;i--){
            for(int j=0;j<i;j++){
                nums[i-1][j]=nums[i-1][j]+Math.max(nums[i][j],nums[i][j+1]);
            }
        }

        return nums[0][0];
    }
}
