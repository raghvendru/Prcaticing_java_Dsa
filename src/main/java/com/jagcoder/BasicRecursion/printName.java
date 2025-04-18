package com.jagcoder.BasicRecursion;

public class printName {
    public static void print(String name,int n){
        if(n==0) return ;

        System.out.println("raghu");
        print(name,n-1);
        
    }
    public static void main(String[] args) {
        String name = "raghu";
        int n = 10;
        print(name,10);
    }
}
