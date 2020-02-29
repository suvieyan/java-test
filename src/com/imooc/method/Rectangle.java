package com.imooc.method;
public class Rectangle{
    // 求长方形面积
    public int area() {
        int length=10;
        int width=5;
        int area = length*width;
        return area;
    }
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        int area=rectangle.area();
        System.out.println("长方形面积为："+area);
    }
}