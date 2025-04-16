package com.jagcoder.BasicHashing;

import java.util.HashMap;
import java.util.Map;

public class HighOcc {
//    public static int occ(int[] arr){
//        int maxCnt =0;
//        int n = arr.length;
//        int ele = -1;
//        boolean[] vis = new boolean[n];
//        for(int i=0;i<n;i++){
//            int cnt = 0;
//            if(vis[i]) continue;
//            for(int j=i;j<n;j++){
//                if(arr[i] == arr[j]){
//                    cnt++;
//                    vis[j] = true;
//                }
//            }
//            if(cnt>maxCnt){
//                maxCnt = cnt;
//                ele = arr[i];
//            } else if (cnt == maxCnt) {
//                Math.min(arr[i],ele);
//
//            }
//        }
//        return ele;
//    }

    public static int occ(int[] arr){
        int maxCount = 0;
        int  maxEle = -1;
        Map<Integer,Integer> mp = new HashMap<>();
        int  n= arr.length;
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mpp :mp.entrySet()){
            int ele  = mpp.getKey();
            int cnt = mpp.getValue();
            if(cnt>maxCount){
                maxEle = ele;
                maxCount = cnt;
            }
            if(cnt == maxCount){
                maxEle = Math.min(ele,maxEle);
            }
        }
        return maxEle;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,3,4,4,5,4};
        int res = occ(arr);
        System.out.println(res);
        int n = 123567;
        System.out.println((int)Math.log10(n)+1);
    }
}
