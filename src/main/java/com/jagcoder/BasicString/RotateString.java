package com.jagcoder.BasicString;

public class RotateString {
    public static boolean rot(String s,String goal){
        if(s.length() != goal.length()){
            return false;
        }
//        for(int i=0;i<s.length();i++){
//            String rotated = s.substring(i)+s.substring(0,i);
//            if(goal.contains(rotated)){
//                return true;
//            }
//        }
//        return false;
        String roated = s+s;
        if(roated.contains(goal)){
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        String s = "srsghu";
        String goal = "ghusrs";
        boolean ans =  rot(s,goal);
        if(ans){
            System.out.println("its there");

        }
        else {
            System.out.println("not there");
        }

    }
}
