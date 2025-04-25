package com.jagcoder.ArraysSorting;

public class InsertionSort {
    public static int[] insertion(int[] a){
        int n = a.length;
        for(int i =0;i<n;i++){
            int j = i;
            while(j>0 && a[j]<a[j-1]){
                int temp = a[j];
                a[j] = a[j-1];
                a[j-1] = temp;
                j--;
            }
        }
        return a;
    }

    public static void main(String[] args){
        int[] arr = {13,46,52,24,46,9};
        int[] ans = insertion(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
