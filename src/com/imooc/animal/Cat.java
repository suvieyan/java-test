package com.imooc.animal;

import sun.print.resources.serviceui;

/**
 * 宠物猫类
 * Cat
 */
public class Cat {
    // 属性：昵称，年龄， 体重， 品种
    // private 只能在当前类内访问
    private String name;  // 默认值null
    private int month;// 默认值0
    private double weight;// 默认值0.0
    private String species;

    public Cat() {
        System.out.println("我是无参构造方法");
    }
    public Cat(String name) {
        System.out.println("我是有参构造方法");
    }
    public Cat(String name, int month, double weight, String species) {
        this(); // 调用自己的无参构造方法
        // 就近原则
        this.name=name;
        this.month = month;
        this.weight=weight;
        this.species=species;
    }
    public setName(String name) {
        this.name=name;
    }
    public String getName(){
        return this.name;
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

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month<=0){
            System.out.println("输入信息错误， 年龄必须大于0");
        }
        this.month = month;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}