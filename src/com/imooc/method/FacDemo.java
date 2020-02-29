package com.imooc.method;

public class FacDemo{
    public int fac(int n) {
        int s=1;
        for(int i=1;i<n;i++){
            s*=i;
        }
        return s;
    }
    public static void main(String[] args) {
        FacDemo myFacDemo = new FacDemo();
        int value = myFacDemo.fac(10);
        System.out.println("10!="+value);
        // 计算多个阶乘
        int sum =0;
        for(int i=1;i<=5;i++){
            sum += myFacDemo.fac(i);
        }
        System.out.println("1!+2!+3!+4!="+sum);
    }
}
// 10!=362880
// 1!+2!+3!+4!=34