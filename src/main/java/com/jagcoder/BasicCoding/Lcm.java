package com.jagcoder.BasicCoding;

public class Lcm {
//    public static int gcd(int n1,int n2){
//        while (n1>0 && n2>0){
//            if(n1>n2){
//                n1 = n1%n2;
//            }
//            else {
//                n2 = n2%n1;
//            }
//        }
//        if(n1 == 0) return n2;
//        return n1;
//
//    }

    public static int lcm(int n1,int n2){
       int max = Math.max(n1,n2);
       int mul = 1;
       int lcm ;
       int i = 1;
      while (true){
          mul = max*i;
          if(mul%n1 ==0 && mul%n2 ==0){
              lcm = mul;
              break;
          }
          i++;
      }
      return lcm;
    }
    public static void main(String[] args) {
      int res = lcm(4,6);
        System.out.println(res);
    }
}
