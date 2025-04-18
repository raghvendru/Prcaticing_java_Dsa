package com.jagcoder.BasicRecursion;
import java.util.*;
public class CheckPali {
    public static boolean pal(String s){
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
               sb.append(Character.toLowerCase(c));
            }
        }
        return palHelper(sb.toString()
                ,0,sb.length()-1);
    }

    public static boolean palHelper(String s,int left,int right){
        if(left>=right) return true;

        if(s.charAt(left) != s.charAt(right)){
            return false;
        }
        return palHelper(s,left+1,right-1);
    }

    public static void main(String[] args) {
        String s = "a man nam a";
        System.out.println(pal(s));
    }
}
