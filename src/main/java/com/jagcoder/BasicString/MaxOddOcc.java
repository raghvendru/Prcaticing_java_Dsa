package com.jagcoder.BasicString;
import java.util.Arrays;
public class MaxOddOcc {
    public static String odd(String str){
        int ind = -1;
        int n = str.length();
        for(int i=n-1;i>=0;i--){
            if(str.charAt(i)%2 == 1){
                ind = i;
                break;
            }
        }
        if(ind == -1 ) return "";
        int i = 0;
        while(i<=ind && str.charAt(i)=='0' ) i++;

        return str.substring(i,ind+1);


    }

    public static void main(String[] args) {
        String str = "0000012345897898";
        String ans = odd(str);
        System.out.println(ans);
    }
}
