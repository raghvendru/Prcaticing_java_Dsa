package com.jagcoder.AdvanceString;

public class CountAndSay {
    public static String countAndSay(int n){
        if(n==1) return "1";
        String  ans="";
        String s= countAndSay(n-1);
        int count = 1;
        int size = s.length();
        for(int i=1;i<size;i++){
            if(s.charAt(i) == s.charAt(i-1)){
                count++;
            }
            else {
                ans += (char)(count+'0');
                ans += s.charAt(i-1);
                count = 1;
            }

        }
        ans += (char)(count+'0');
        ans += s.charAt(size-1);
        return ans;

    }
    public static void main(String[] args) {
        int n  = 5;
        System.out.println(countAndSay(n));
    }
}
