package com.jagcoder.AdvanceString;
import java.util.*;

public class IndexStartOfMatchingPatt1 {
   public static List<Integer> search(String pat,String text){
       int n = pat.length();
       int m= text.length();
       int pRight =1;
       int pLeft = 1;
       int p = 7;
       int mod = 101;
       int hashPat = 0;
       int hashText = 0;
       List<Integer> ans = new ArrayList<>();
       for(int i=0;i<n;i++){
           hashPat = (hashPat + ((pat.charAt(i)-'a'+1)*pRight)%mod)%mod;
           hashText = (hashText+((text.charAt(i)-'a'+1)*pRight)%mod)%mod;
           pRight = (pRight*p)%mod;
       }

       for(int i = 0;i<=m-n;i++){
           if(hashPat==hashText){
              // if(text.substring(i,i+n).equals(pat)){
                   ans.add(i);

               //}
           }
           if(i<m-n){
               hashText = (hashText - ((text.charAt(i)-'a'+1)*pLeft)%mod+mod)%mod;
               hashText = (hashText + ((text.charAt(i+n)-'a'+1)*pRight)%mod)%mod;
               hashPat = (hashPat*p)%mod;
               pLeft = (pLeft*p)%mod;
               pRight =(pRight*p)%mod;
           }
       }
       return ans;
   }

    public static void main(String[] args) {
        String text = "gabcdeabc";
        String pat  = "abc";
        System.out.println(search( pat,text));  // prints [1, 6]
    }
}
