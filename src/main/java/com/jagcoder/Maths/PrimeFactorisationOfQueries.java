package com.jagcoder.Maths;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorisationOfQueries {

    public static List<Integer> primeHelp(int n){
        List<Integer> ans =new ArrayList<>();
        while(n%2 == 0){
            ans.add(2);
            n=n/2;
        }

        for(int i=3;i<=Math.sqrt(n);i=i+2){
            while(n%i ==0 ){
                ans.add(i);
                n=n/i;

            }
        }

        if(n>2) ans.add(n);
        return ans;
    }

    public static List<List<Integer>> primeFact(int[] quer){
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<quer.length;i++){
            ans.add(primeHelp(quer[i]));

        }
        return ans;
    }

    public static void main(String[] args) {
        int[] queries = {2,3,5,20};

        List<List<Integer>> ans = primeFact(queries);
        for(int i =0;i<ans.size();i++){
            System.out.println("prirm fact of" + queries[i]+"is :");
            for(int j=0;j<ans.get(i).size();j++){
                System.out.println(ans.get(i).get(j)+" ");

            }
        }
    }
}
