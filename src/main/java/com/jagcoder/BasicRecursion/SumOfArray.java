package com.jagcoder.BasicRecursion;

public class SumOfArray {
    public static int sum(int[] arr){
        return sumHelper(arr,0);
    }

    public static int sumHelper(int[] arr,int x){
        if(x> arr.length-1) return 0;

        return arr[x]+sumHelper(arr,x+1);
    }
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,5};
        System.out.println(sum(arr));
    }
}
