package com.jagcoder.ArraysSorting;

public class SelectionSort {
    public static int[] selectionSort(int[] a){
        int n = a.length;
        for(int i =0;i<=n-2;i++){
          int  mini = i;
          for(int j=i;j<=n-1;j++){
              if(a[j]<a[mini]){
                  mini = j;
              }
              int temp= a[i];
              a[i] = a[mini];
              a[mini] = temp;

          }

        }
        return a;

    }
    public static void main(String[] args){
        int[] arr = {13,46,52,24,46,9};
        int[] ans = selectionSort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
