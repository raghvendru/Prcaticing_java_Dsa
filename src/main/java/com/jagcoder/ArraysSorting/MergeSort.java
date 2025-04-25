package com.jagcoder.ArraysSorting;

import java.util.*;

public class MergeSort {
    public static int[] mergeSort(int[] a){
        int n = a.length;
        mergeSortHelper(a,0,n-1);
        return a;
    }

    public static void mergeSortHelper(int[] a,int low,int high){
     int mid = (low+high)/2;
     if(low == high) return ;
     mergeSortHelper(a,low,mid);
     mergeSortHelper(a,mid+1,high);
     merge(a,low,mid,high);
    }
    public static   int[] merge(int[] a,int low,int mid,int high){
        List<Integer> ans = new ArrayList<>();
        int left = low ;
        int right = mid+1;
        while(left<=mid && right<=high){
            if(a[left]<=a[right]){
                ans.add(a[left]);
                left++;
            }
            else{
                ans.add(a[right]);
                right++;

            }
        }
        while(left<=mid){
            ans.add(a[left]);
            left++;
        }
        while(right<=high){
            ans.add(a[right]);
            right++;
        }
        for(int i = low;i<=high;i++){
            a[i] = ans.get(i-low);
        }
        return a;
    }
    public static void main(String[] args){
        int[] arr = {13,46,52,24,46,9};
        int[] ans = mergeSort(arr);
        for(int i=0;i<ans.length;i++){
            System.out.println(ans[i]);
        }
    }
}
