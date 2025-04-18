package com.jagcoder.BasicCoding;

public class StarPract2 {
    public static void patt(int n){
        for(int i = n-1;i>=0;i--){
            for(char ch = (char)('A'+i);ch<(char) ('A'+n);ch++){
                System.out.print(ch);
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        int n = 6 ;
        patt(n);
    }
}
