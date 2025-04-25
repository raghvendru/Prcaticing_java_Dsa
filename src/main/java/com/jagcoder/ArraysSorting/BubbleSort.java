package com.jagcoder.ArraysSorting;

public class BubbleSort {
    public static int[] bubbleSort(int[] a){
        int n = a.length;
        for(int i =n-1;i>=1;i--){
            for(int j =0;j<i;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }

            }
        }
        return a;
    }

    public static void main(String[] args){
        int[] arr = {13,46,52,24,46,9};
        int[] ans = bubbleSort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
