package com.jagcoder.BasicString;

import java.util.*;

public class ReverseString {
    public static List<Character> rev(List<Character> a){
//        Stack<Character> st = new Stack<>();
//        for(char c:a){
//            st.push(c);
//        }
//        for(int i=0;i<a.size();i++){
//            a.set(i,st.pop());
//        }
//        return a;
        int s = 0;
        int e = a.size()-1;
        while(s<e){
            char c = a.get(s);
            a.set(s,a.get(e));
            a.set(e,c);
            s++;
            e--;

        }
        return a;
    }

    public static void main(String[] args) {
        List<Character> l = new ArrayList<>(Arrays.asList('h','e','l','l'));
        List<Character> ans = rev(l);
        System.out.println(ans);

    }
}
