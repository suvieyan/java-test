package com.imooc.operator;

public class MathDemo {
    public static void main(String[] args){
        int num1=10,num2=5;
        int result;
        result=num1+num2;
        // 加法运算
        System.out.println(num1+"+"+num2+"="+result);
        // 字符串连接运算
        System.out.println(""+num1+num2);
        // 分子分母都是整数，结果也是整数， 否则， 结果保留小数点
        System.out.println(10.0/5);// 2.0
        System.out.println(13/5);// 2
        System.out.println(13.0/5);//2.6
        System.out.println(13%5);//2.6

    }
}
