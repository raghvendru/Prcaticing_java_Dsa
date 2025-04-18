package com.jagcoder.AdvanceString;

import java.util.ArrayList;
import java.util.List;

public class ReverseEachWOrdBrute {
    public static String rev(String s){
      int n = s.length();
      List<String> sb  = new ArrayList<>();
      int i = 0;
      int start,end;
      while(i<n){
          while(i<n && s.charAt(i) == ' ') i++;
          if(i>=n) break;
          start = i ;
          while(i<n && s.charAt(i) != ' ') i++;
          end = i-1;
          String ans = s.substring(start,end+1);
          sb.add(ans);
          }
      StringBuilder res = new StringBuilder();
      for(int j=sb.size()-1;j>=0;j--){
          res.append(sb.get(j));
          if(j!=0) res.append(' ');
      }
      return res.toString();
    }
    public static void main(String[] args) {
        String s = "  hi raghu upar ";
        System.out.println(rev(s));
    }
}
