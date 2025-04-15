package com.jagcoder.Arrays;
import java.util.*;
public class SumOfArray {
    public  int sum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum = sum+arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER SIZE");
        int n = sc.nextInt();
        System.out.println("ENter elemenets");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
             arr[i] = sc.nextInt();
        }
        SumOfArray s = new SumOfArray();
       int ans =  s.sum(arr);
        System.out.println(ans);


    }
}
