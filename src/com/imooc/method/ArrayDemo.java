package com.imooc.method;

public class ArrayDemo{
    public void update(int[] arr) {
        arr[3]=15;
        System.out.print("数组中元素为：");
        for(int n:arr){
            System.out.print(n+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr1={1,2,3,4,5};
        System.out.print("方法调用前数组中的元素为：");
        for(int n:arr1){
            System.out.print(n+"  ");
        }
        System.out.println();

        ArrayDemo myArrayDemo=new ArrayDemo();
        myArrayDemo.update(arr1);
        System.out.print("方法调用后数组中的元素为：");
        for(int n:arr1){
            System.out.print(n+"  ");
        }
        System.out.println();

    }
}
// 方法调用前数组中的元素为：1  2  3  4  5  
// 数组中元素为：1  2  3  15  5  
// 方法调用后数组中的元素为：1  2  3  15  5  