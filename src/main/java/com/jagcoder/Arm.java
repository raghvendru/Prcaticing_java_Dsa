package com.jagcoder;

public class Arm {
    public  static  boolean arm(int n){
        int cnt = 0 ;
        int ans = n;
        int answer=0;
        int res1 = n;
        while(n>0){
            int res = n%10;
            cnt++;
            n = n/10;
        }
        while(ans>0){
            int res = ans%10;
            int arm = 1;
            for(int i = 1;i<=cnt;i++){
                arm = arm*res;
            }
            answer = answer+arm;
            ans = ans/10;
        }
        if(res1 == answer) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int n = 153;
        boolean res = arm(n);
        System.out.println(res);
    }
}
