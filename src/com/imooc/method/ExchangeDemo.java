package com.imooc.method;

public class ExchangeDemo{
    public void swap(int a, int b) {
        int temp;
        System.out.println("交换前：a="+a+",b="+b);
        temp=a; a=b; b=temp;
        System.out.println("交换后：a="+a+",b="+b);
        
    }
    public static void main(String[] args) {
        ExchangeDemo myExchangeDemo = new ExchangeDemo();
        int m=3, n=6;
        // 不会改变主方法的值
        System.out.println("交换前：m="+m+",n="+n);
        myExchangeDemo.swap(m, n);
        System.out.println("交换后：m="+m+",n="+n);
    }
}
// 交换前：m=3,n=6
// 交换前：a=3,b=6
// 交换后：a=6,b=3
// 交换后：m=3,n=6