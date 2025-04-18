package com.jagcoder.BasicRecursion;

public class RevArray {
    public static int[] rev(int[] a){
         revHelper(a,0,a.length-1);
         return a;
    }
    public static void revHelper(int[] arr ,int left,int right){
        if(left>=right) return ;

        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
         revHelper(arr,left+1,right-1);

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] res = rev(a);
        for(int i:res){
            System.out.println(i);
        }
    }
}
