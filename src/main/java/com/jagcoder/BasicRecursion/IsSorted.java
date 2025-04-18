package com.jagcoder.BasicRecursion;

import java.util.ArrayList;
import java.util.List;

public class IsSorted {
    public static boolean isSort(List<Integer> al){
      return   isSortHelper(al,0,1);
    }
    public static boolean isSortHelper(List<Integer> al,int left,int right){
        if(right>=al.size()){
            return true;
        }
        if(al.get(left)>al.get(right)) return false;

        return isSortHelper(al,left+1,right+1);
    }
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>(List.of(1,2,3,4));
        System.out.println(isSort(al));
    }
}
