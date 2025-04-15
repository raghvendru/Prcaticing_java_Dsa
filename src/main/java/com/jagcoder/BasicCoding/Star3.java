package com.jagcoder.BasicCoding;

public class Star3 {
    public static void pat(int n){
        for(int i=1;i<n;i++){
            int start = 1;
            if(i%2==0) start = 0;
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start = 1- start;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       pat(5);
    }
}
