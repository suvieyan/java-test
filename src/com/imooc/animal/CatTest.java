package com.imooc.animal;

/**
 * CatTest
 */
public class CatTest {

    public static void main(String[] args) {
        Cat one=new Cat();
        one.name="花花";
        one.month=9;
        one.weight=5.6;
        one.species="英国短毛猫";
        Cat two=one;
        two.name="凡凡";
        System.out.println("年龄："+one.month);
        System.out.println("昵称："+one.name);
        System.out.println("体重："+one.weight);
        System.out.println("品种"+one.species);
        System.out.println("--------------------");
        System.out.println("年龄："+two.month);
        System.out.println("昵称："+two.name);
        System.out.println("体重："+two.weight);
        System.out.println("品种"+two.species);

    }
}