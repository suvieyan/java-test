package com.imooc.animal;

/**
 * Dog
 */
public class Dog extends Animal{
    private double weight;

    public Dog() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run() {
        System.out.println(this.getName()+"在奔跑");
    }
    

    
}