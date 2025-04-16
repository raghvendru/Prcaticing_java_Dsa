package com.jagcoder.BasicCoding;
import java.util.*;
public class PrimeUptoN2 {
    public static int[] isPrime(int n){
        boolean[] isPrime = new boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i<=n;i++){
            if(isPrime[i]){
                for(int j=2*i;j<=n;j=j+i){
                    isPrime[j] = false;
                }
            }
        }
        int[] res = new int[n];
        int j = 0;
        for(int i=0;i<=n;i++){
            if(isPrime[i]){
                res[j++] = i;
            }
        }
        return Arrays.copyOf(res,j);
    }


    public static void main(String[] args) {
        int n = 20;
        int[] res = isPrime(n);
        System.out.println(Arrays.toString(res));
    }
}
