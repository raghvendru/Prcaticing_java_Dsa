package com.jagcoder.BasicRecursion;

public class IsPrime {
    public static boolean isPrime(int n){
        return isPrimeHelper(n,2);
    }

    public static boolean isPrimeHelper(int n,int x){
        if(x>Math.sqrt(n)) return true;

        if(n%x == 0){
            return false;
        }

        return isPrimeHelper(n,x+1);
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println(isPrime(n));
    }
}
