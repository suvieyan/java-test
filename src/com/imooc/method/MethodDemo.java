package com.imooc.method;

public class MethodDemo{
    // 打印输出*
    public void printStar(){
        System.out.println("**********************");
    }

    public static void main(String[] args) {
        // 创建对象
        MethodDemo myMethodDemo = new MethodDemo();
        // 对象调用方法
        myMethodDemo.printStar();
        System.out.println("欢迎来到Java世界");
        myMethodDemo.printStar();
    }

}

// **********************
// 欢迎来到Java世界
// **********************