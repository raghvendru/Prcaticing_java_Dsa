package com.jagcoder.BasicCoding;

public class Prime {
    public static boolean prime(int n){
        int cnt = 0;
        if(n == 1) {
            return false;
        }
        for(int i=1;i*i<=n;i++){
            if(n%i == 0){
                cnt++;
                if(n%i != i){
                    cnt++;
                }
            }
        }
        if(cnt == 2 ){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int n = 29;
        boolean b = prime(n);
        System.out.println(b);

    }
}
