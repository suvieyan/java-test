package com.imooc.animal;
/**
 * 宠物猫类
 * Cat
 */
public class Cat {
    // 属性：昵称，年龄， 体重， 品种
    String name;  // 默认值null
    int month;// 默认值0
    double weight;// 默认值0.0
    String species;

    public Cat() {
        System.out.println("我是无参构造方法");
    }

    // 方法， 跑， 吃
    public void run() {
        System.out.println("小猫快跑");
    }

    public void run(String name) {
        System.out.println(name+"快跑");
    }

    public void eatFish() {
        System.out.println("小猫吃鱼");
        
    }

    public static void main(String[] args) {
        
    }
}