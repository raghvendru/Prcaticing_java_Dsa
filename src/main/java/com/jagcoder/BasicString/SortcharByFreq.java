package com.jagcoder.BasicString;
import java.util.*;
public class SortcharByFreq {
//    public class Pair{
//        int freq;
//        char ch;
//        public Pair(int f,char c){
//            this.freq = f;
//            this.ch = c;
//        }
//
//    }
//    public List<Character> frequencySort(String s){
//        int n = s.length();
//        Pair[] freq = new Pair[26];
//        for(int i=0;i<26;i++){
//            freq[i] = new Pair(0,(char)(i+'a'));
//        }
//
//        for(char c:s.toCharArray()){
//            freq[c-'a'].freq++;
//        }
//
//        Arrays.sort(freq,(p1,p2)->{
//            if(p1.freq != p2.freq) return p2.freq-p1.freq;
//            return p1.ch-p2.ch;
//
//        });
//        List<Character> res = new ArrayList<>();
//        for(Pair p:freq){
//            if(p.freq>0){
//                res.add(p.ch);
//            }
//        }
//        return res;
//    }
   //above solution is for only small letters,for all follow below
    public List<Character> frequencySort(String s){
        Map<Character,Integer> mp = new HashMap<>();
        for(char ch:s.toCharArray()){
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }

        List<Character> res = new ArrayList<>(mp.keySet());
        res.sort((c1,c2)->{
            int f1 = mp.get(c1);
            int f2 = mp.get(c2);
            if(f1 !=f2) return f2-f1;
            return c1-c2;
        });
        return res;

    }

    public static void main(String[] args) {
        SortcharByFreq sol = new SortcharByFreq();
        String s = "TTtree";
        List<Character> result = sol.frequencySort(s);
        System.out.println(result);
    }
}
