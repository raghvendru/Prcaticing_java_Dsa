package com.jagcoder.BasicHashing;

public class HighOcc {
    public static int occ(int[] arr){
        int maxCnt =0;
        int n = arr.length;
        int ele = -1;
        boolean[] vis = new boolean[n];
        for(int i=0;i<n;i++){
            int cnt = 0;
            if(vis[i]) continue;
            for(int j=i;j<n;j++){
                if(arr[i] == arr[j]){
                    cnt++;
                    vis[j] = true;
                }
            }
            if(cnt>maxCnt){
                maxCnt = cnt;
                ele = arr[i];
            } else if (cnt == maxCnt) {
                Math.min(arr[i],ele);

            }
        }
        return ele;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,2,3,3,4,4,5,4};
        int res = occ(arr);
        System.out.println(res);
    }
}
