package com.jagcoder;

public class Star2 {
public void pat(int n) {
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    for (int i = n - 1; i >= 1; i--) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}

    public static void main(String[] args) {
        Star2 star = new Star2();
        star.pat(5);
    }

}
