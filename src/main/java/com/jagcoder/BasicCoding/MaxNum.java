package com.jagcoder.BasicCoding;

import java.util.Scanner;

public class MaxNum {
    public int max(int n){
        if (n==0) return 0;
        int min = Integer.MIN_VALUE;
        while(n>0){
            int res = n%10;
            if(res>min){
                min = res;
            }
            n = n/10;
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int n = sc.nextInt();
        MaxNum m = new MaxNum();
        int res = m.max(n);
        System.out.println(res);
    }
}
