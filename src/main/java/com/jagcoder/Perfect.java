package com.jagcoder;

public class Perfect {
    public static boolean perf(int n){
        int sum = 0 ;
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                sum = sum + i;

            if(i != n/i && n/i != n){
                sum = sum+n/i;
            }}
        }
        if(n == sum) return true;
        return false;

    }

    public static void main(String[] args) {
       boolean res =  perf(28);
        System.out.println(res);

    }
}
