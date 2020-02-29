package com.imooc.method;

public class MaxDemo{
    public void max(double a, double b) {
        double max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        System.out.println("两个数"+a+"和"+b+"的最大值为："+max);
    }
    public void max(float a, float b) {
        float max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        System.out.println("两个数"+a+"和"+b+"的最大值为："+max);
    }

    public static void main(String[] args) {
        MaxDemo myMaxDemo = new MaxDemo();
        float a=10;
        float b=12;
        myMaxDemo.max(a, b); 
        float m=5.6f, n=8.9f;
        myMaxDemo.max(m, n);

        myMaxDemo.max(12.9, 23.6);
    }
}
// 两个数10.0和12.0的最大值为：12.0
// 两个数5.6和8.9的最大值为：8.9