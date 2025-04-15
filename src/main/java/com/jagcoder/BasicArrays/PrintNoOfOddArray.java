package com.jagcoder.BasicArrays;
import java.util.Arrays;
public class PrintNoOfOddArray {
    public static int[] odd(int[] arr){
//       int n = arr.length;
//       int[] res = new int[n];
      //  int j = 0 ;
//        for(int i=0;i<n;i++){
//            if(arr[i]%2 != 0){
//                res[j++] = arr[i];
//            }
//        }
//        return Arrays.copyOf(res,j);
       int i =0;
       int j=arr.length-1;
       while(i<j){
           int tmp = arr[i];
           arr[i] = arr[j];
           arr[j] = tmp;
           i++;
           j--;
       }
       return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,7,5};
        int[] res = odd(arr);
        System.out.println(Arrays.toString(res));
    }
}
