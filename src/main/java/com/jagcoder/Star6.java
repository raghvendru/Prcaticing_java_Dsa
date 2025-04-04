package com.jagcoder;

public class Star6 {
    public static void pat(int n){
      for(int i=0;i<=n;i++){
          for(int j=0;j<=(n-i);j++){
              System.out.print("*");
          }
          for(int j=0;j<=2*i;j++){
                System.out.print(" ");
          }


          for(int j=0;j<=(n-i);j++){
              System.out.print("*");
          }
          System.out.println("");
      }
    }

    public static void main(String[] args) {
        pat(4);
    }
}
