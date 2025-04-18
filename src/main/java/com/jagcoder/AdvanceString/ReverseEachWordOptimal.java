package com.jagcoder.AdvanceString;

public class ReverseEachWordOptimal {

    public static char[] reverse(char[] arr,int start,int end){
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;

    }
    public static String rev(String s){
        char[] arr = s.toCharArray();
        int n= arr.length;
        reverse(arr,0,arr.length-1);
        int i=0,j=0,start=0,end=0;
        while(j<n){
            while (j<n && arr[j]==' ') j++;
            start = i;
            while(j<n && arr[j]!=' '){
                arr[i] = arr[j];
                i++;
                j++;
            }
            end = i-1;
            reverse(arr,start,end);
            if(i<n) arr[i++] = ' ';
        }

        return new String(arr).substring(0,end+1);
    }

    public static void main(String[] args) {
        String s="  hi  raghu  up ";
        System.out.println(rev(s));
    }
}
