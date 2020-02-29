package com.imooc.method;

import java.util.Scanner;

public class ArrayMethod{

    public void printArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }

    public boolean search(int n, int[] arr) {
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            if (n==arr[i]){
                flag=true;
                break;
            }
        }
        return flag;
    }
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50};
        ArrayMethod mySArrayMethod = new ArrayMethod();
        mySArrayMethod.printArray(arr);

        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的数据");
        int n1 =sc.nextInt();
        boolean flag = mySArrayMethod.search(n1, arr);
        if(flag){
            System.out.println("找到了");
        }else{
            System.out.println("没找到");
        }
    }
}
// 10   20   30   40   50   
// 请输入要查找的数据
// 30
// 找到了