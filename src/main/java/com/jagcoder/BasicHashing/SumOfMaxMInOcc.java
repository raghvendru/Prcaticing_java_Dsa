package com.jagcoder.BasicHashing;
import java.util.*;
public class SumOfMaxMInOcc {
    public static int occ(int[] arr){
        int n = arr.length;
        int max = 0;
        int min = n;
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(int freq:mp.values()){
            max = Math.max(max,freq);
            min = Math.min(min,freq);
        }
        return max+min;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,4,4,5};
        int res = occ(arr);
        System.out.println(res);
    }
}
