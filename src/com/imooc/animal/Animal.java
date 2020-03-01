package com.imooc.animal;

/**
 * Animal
 */
public class Animal {
    private String name;  // 默认值null
    private int month;// 默认值0
    private double weight;// 默认值0.0
    private String species;

    public Animal(String name, int month, double weight, String species) {
        this.name = name;
        this.month = month;
        this.weight = weight;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
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