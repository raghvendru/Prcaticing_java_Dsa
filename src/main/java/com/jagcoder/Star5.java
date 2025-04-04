package com.jagcoder;

public class Star5 {
    public static void pat(int n){
        for(int i=0;i<n;i++){
            for(char j ='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        pat(5);
    }
}
