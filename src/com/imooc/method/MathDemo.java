package com.imooc.method;

public class MathDemo{
    public int plus(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
        return sum;
    }
    
    public double plus(double m, double n){
        return m+n;
    }
    public int plus(int m, int n){
        return m+n;
    }
    public static void main(String[] args) {
        int m=5,n=3;
        int[] arr={1,2,3,4,5};
        MathDemo myMathDemo = new MathDemo();
        System.out.println("int类型的和："+myMathDemo.plus(m, n));
        System.out.println("double类型的和："+myMathDemo.plus(4.3, 5.6));
        System.out.println("arr类型的和："+myMathDemo.plus(arr));
    }
}

// int类型的和：8
// double类型的和：9.899999999999999
// arr类型的和：15