package com.jagcoder;
public class Gcd {
//    public static int gcd(int n1,int n2){
//        int min = Math.min(n1,n2);
//        int gcd =1;
//        for(int i = min;i>0;i--){
//            if(n1%i==0 && n2%i == 0){
//                gcd = i ;
//                break;
//            }
//        }
//        return gcd;
//    }
    public static int gcd(int n1,int n2){
        while (n1>0 && n2>0){
            if(n1>n2){
                n1 = n1%n2;
            }
            else {
                n2 = n2%n1;
            }
        }
        if(n1 == 0) return n2;
        return n1;

    }
    public static void main(String[] args) {
        int ans = gcd(8,16);
        System.out.println(ans);
    }
}
