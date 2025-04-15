package com.jagcoder.BasicCoding;
import java.util.*;
public class PrimeUptoN {
    public static boolean isPriem(int n){
        int cnt = 0;
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
        }else {
            return false;
        }
    }
//    public static  int[] primeUptoN(int n){
//        int cnt = 0;
//        int[] result = new int[n];
//        int j = 0 ;
//        for(int i = 2;i<=n;i++){
//            if(isPriem(i)){
//               result[j++] = i;
//
//            }
//        }
//        return Arrays.copyOf(result,j);
    public static List<Integer> primeUptoN(int n){
        List<Integer> res = new ArrayList<>();
        int cnt = 0 ;
        for(int i=2;i<=n;i++){
            if (isPriem(i)){
                res.add(i);
            }
        }
        return res;
    }
    public static void main(String[] args) {
      List<Integer> res = primeUptoN(10);
        System.out.println(res);
    }
}
