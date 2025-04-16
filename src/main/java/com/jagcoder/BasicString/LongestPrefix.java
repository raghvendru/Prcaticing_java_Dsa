package com.jagcoder.BasicString;

import java.util.Arrays;

public class LongestPrefix {

    public static String pref(String[] str){
        Arrays.sort(str);
        int n= str.length;
        String f = str[0];
        String l = str[n-1];
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<=Math.min(f.length(),l.length());i++){
            if(f.charAt(i) != l.charAt(i)){
                return ans.toString();
            }
            ans.append(f.charAt(i));
        }
        return ans.toString();

    }

    public static void main(String[] args) {
        String[] str = {"flower","floaw","float","flowmmf"};
        String ans = pref(str);
        System.out.println(ans);
    }
}
