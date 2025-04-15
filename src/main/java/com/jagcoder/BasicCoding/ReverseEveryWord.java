package com.jagcoder.BasicCoding;
import java.util.*;
import java.lang.*;
public class ReverseEveryWord {
    public static String rev(String str){
        List<String> res = new ArrayList<>();
        int i=0;
        int start;
        int end;
        int n = str.length();
        while (i<n){
            while(i<n && str.charAt(i) == ' ')  i++;
            if(i>=n) break;
            start = i;
            while(i<n && str.charAt(i) != ' ') i++;
            end =i-1;
            String word= str.substring(start,end+1);
            res.add(word);
        }
        StringBuilder s = new StringBuilder();
        for(i=res.size()-1;i>=0;i--){
            s.append(res.get(i));
            if(i!=0) s.append(' ');
        }
        return s.toString();
    }
    public static void main(String[] args) {
    String s= " welcome to string  ";
    String res= rev(s);
        System.out.println(res);
    }
}
