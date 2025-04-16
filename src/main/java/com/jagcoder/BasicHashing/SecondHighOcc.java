package com.jagcoder.BasicHashing;
import java.util.*;
public class SecondHighOcc {
//    public static int occ(int[] arr){
//        int maxfre = 0 ;
//        int n = arr.length;
//        int secMaxfreq= 0;
//        int maxEle = -1;
//        int secMaxele = -1;
//        boolean[] vis = new boolean[n];
//        for(int i=0;i<n;i++){
//            if(vis[i]) continue;
//                int cnt = 0;
//                for(int j=i;j<n;j++){
//                    if(arr[i] == arr[j]){
//                     cnt++;
//                     vis[j] = true;
//                    }
//
//                    if(cnt>maxfre){
//                        secMaxfreq = maxfre;
//                        maxfre = cnt;
//                        secMaxele = maxEle;
//                        maxEle = arr[i];
//                    }
//
//                    else if (cnt == maxfre) {
//                        maxEle  = Math.min(maxEle,arr[i]);
//                    }
//
//                    else if(cnt > secMaxfreq){
//                      secMaxfreq = cnt;
//                      secMaxele = arr[i];
//                    }
//
//                    else if (cnt == secMaxfreq) {
//                        secMaxele = Math.min(secMaxele,arr[i]);
//                    }
//                }
//
//        }
//        return secMaxele;
//    }

    public static int occ(int[] arr){
        Map<Integer,Integer> mp = new HashMap<>();
        int maxFreq=0;
        int maxEle =-1;
        int secMaxEle = -1;
        int secmaxFreq  = 0;
        int n = arr.length;
        for(int i=0;i<n;i++){
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mpp:mp.entrySet()){
            int cnt = mpp.getValue();
            int ele = mpp.getKey();
            if(cnt>maxFreq){
                secmaxFreq = maxFreq;
                maxFreq = cnt;
                secMaxEle = maxEle;
                maxEle = ele;
            } else if (cnt == maxFreq) {
                maxEle = Math.min(maxEle,ele);
            } else if (cnt>secmaxFreq) {
                secmaxFreq = cnt;
                secMaxEle = ele;
            } else if (cnt == secmaxFreq) {
                secMaxEle = Math.min(secMaxEle,ele);
            }
        }
        return secMaxEle;

    }


    public static void main(String[] args) {
        int[] arr ={1,2,2,3,3,3};
        int res  = occ(arr);
        System.out.println(res);
    }
}
