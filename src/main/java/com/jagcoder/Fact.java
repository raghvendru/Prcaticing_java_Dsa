package com.jagcoder;

public class Fact {
    public static int fact(int n){
        if (n==0) return 1;
        int fact = 1;
            for(int i=1;i<=n;i++){
                fact = fact*i;
            }

        return fact;
    }

    public static void main(String[] args) {
        int n = 6 ;
        int res = fact(n);
        System.out.println(res);
    }
}
