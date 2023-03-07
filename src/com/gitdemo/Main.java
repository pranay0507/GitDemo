package com.gitdemo;

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

    public static void main(String[] args) {
        System.out.println(Main.show(3));
    }
}
