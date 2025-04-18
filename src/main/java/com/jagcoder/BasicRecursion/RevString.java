package com.jagcoder.BasicRecursion;

import java.util.Vector;

public class RevString {
    public static Vector<Character> rev(Vector<Character> s){
         revHelper(s,0,s.size()-1);
         return s;
    }
    public static void revHelper(Vector<Character> s,int left,int right){
        if(left>=right) return;

        char temp = s.get(left);
        s.set(left,s.get(right));
        s.set(right,temp);

        revHelper(s,left+1,right-1);
    }

    public static void main(String[] args) {
        Vector<Character> s = new Vector<>();
        s.add('h');
        s.add('e');
        s.add('l');
        System.out.println(rev(s));
    }
}
