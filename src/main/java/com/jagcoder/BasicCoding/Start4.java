package com.jagcoder.BasicCoding;

public class Start4 {
    public static void pat(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=1;j<=(2*n-2*i);j++){
                System.out.print(" ");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pat(5);
    }
}
