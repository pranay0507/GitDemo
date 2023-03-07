package com.gitdemo;

import java.util.Arrays;

public class Main {

    public static int show(int p){
        int a[] = {1,2,3,4,5};
        for(int i=0;i<=a.length;i++){
            if(p==a[i]){
                return i;
            }
        }
        return 0;
    }

    public static void insert(int p, int k){
        int b[] = {1,2,3,5,8,9};
         for(int i=b.length-1;i>p;i--){
             b[i]=b[i-1];
         }
         b[p]=k;
        System.out.println(Arrays.toString(b));
    }

    public static void main(String[] args) {
        System.out.println(Main.show(5));
        Main.insert(3,2);
    }
}
