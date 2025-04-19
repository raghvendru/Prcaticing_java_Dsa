package com.jagcoder.AdvanceString;

public class MinReversalTobeBalanced {
    public static int minRev(String s){
        int n = s.length();
        if(n%2==1) return -1;
        int open = 0;
        int close= 0;
        for(char c: s.toCharArray()){
            if(c =='('){
                open++;
            }
            else{
                if(open>0) open--;
                else close++;
            }
        }
        return (open/2)+(open%2)+(close/2)+(close%2);
    }
    public static void main(String[] args) {
        String s = "((((()";
        System.out.println(minRev(s));
    }
}
