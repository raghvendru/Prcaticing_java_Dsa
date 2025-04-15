package com.jagcoder.BasicCoding;

import java.util.Arrays;

public class printMultiplier {
    public static int[] mul(int n) {
        int[] res = new int[n];
        int j = 0 ;
        for(int i =1;i*i<=n;i++){
            if(n%i == 0){
              res[j++] = i;
              if(n/i != n && i!=n/i){
                  res[j++] = n/i;
              }
            }
        }
        return Arrays.copyOf(res,j);
    }
    public static void main(String[] args) {
       int[] ans = mul(36);
        System.out.println(Arrays.toString(ans));
    }
}
