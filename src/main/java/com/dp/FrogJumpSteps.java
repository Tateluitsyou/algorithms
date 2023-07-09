package com.dp;

import java.util.Scanner;

/**
 * @program: Algorithms
 * @description: 青蛙跳台阶问题
 * @author: TATE.LU
 * @create: 2020-10-16 18:02
 **/
public class FrogJumpSteps {

    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        int n=scanner.nextInt();
        int[] fn=new int[n+1];
        fn[0]=0;
        fn[1]=1;
        fn[2]=2;
        if(n<=2){
            System.out.println(fn[n]);

        }
        for(int i=3;i<=n;i++){
            fn[i]=fn[i-1]+fn[i-2];
        }
        System.out.println(fn[n]);
    }
}
