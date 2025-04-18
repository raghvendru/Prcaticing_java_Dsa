package com.jagcoder.BasicCoding;

public class StarPract {
    public static void patt(int n){
        for(int i=1;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            char ch = 'A';
            for(int j =1;j<=2*i-1;j++){
                System.out.print(ch);

                if(j<i) ch=(char)(ch+1);
                else ch=(char)(ch-1);
            }


            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args){
        int n = 5;
        patt(n);
    }
}
