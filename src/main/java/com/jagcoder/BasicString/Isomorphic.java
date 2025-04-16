package com.jagcoder.BasicString;

public class Isomorphic {
    public boolean iso(String s,String t){
       int[] m1 = new int[256];
       int[] m2 = new int[256];
       int n = s.length();
       for(int i=0;i<n;i++){
           if(m1[s.charAt(i)] != m2[t.charAt(i)]) return false;
           m1[s.charAt(i)] = i+1;
           m2[t.charAt(i)] = i+1;
       }
       return true;
    }
    public static void main(String[] args) {
        Isomorphic i = new Isomorphic();
        String s = "eabre";
        String t = "title";
        if(i.iso(s,t)){
            System.out.println("these are iso");
        }
        else {
            System.out.println("NOT");
        }

    }
}
