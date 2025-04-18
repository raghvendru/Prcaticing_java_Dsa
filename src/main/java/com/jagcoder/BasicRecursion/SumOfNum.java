package com.jagcoder.BasicRecursion;

public class SumOfNum {
    public static int sum(int n){
        if(n<10) return n;
        int sum = n%10 + sum(n/10);
        return sum;
    }
    public static void main(String[] args) {
        int n = 12345;
        System.out.println(sum(n));
    }
}
