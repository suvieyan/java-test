package com.imooc.method;

/**
 * 关于可变参数列表和重载的问题
 * ArgsDemo1
 * @author yan
 */
public class ArgsDemo1 {

    public int plus(int a, int b) {
        System.out.println("不带可变参数的方法被调用");
        return a+b;
        
    }
    // 可变参数列表所在方法是最后被调用的
    public int plus(int... a) {
        System.out.println("带可变参数的方法被调用");
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;   
    }

    public static void main(String[] args) {
        ArgsDemo1 ad=new ArgsDemo1();
        System.out.println("和为："+ad.plus(1, 2));
        
    }
}

// 不带可变参数的方法被调用
// 和为：3
// javadoc -d doc ArgsDemo1.java