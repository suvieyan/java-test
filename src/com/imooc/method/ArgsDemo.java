package com.imooc.method;

/**
 * ArgsDemo
 */
public class ArgsDemo {
    // 可变参数， 可以传任意多个整形参数
    public void sum(int... n) {
        int sum=0;
        // 获取n当中的每一个值i
        for(int i:n){
            sum+=i;
        }
        System.out.println("sum="+sum);
        
    }

    public void search(int n, int... a) {
        boolean flag=false;
        for(int i:a){
            if (n==i){
                flag=true;
                break;
            }
        }
        if(flag){
            System.out.println("找到了"+n);
        }else{
            System.out.println("没有找到"+n);
        }
        
    }
    public static void main(String[] args) {
        ArgsDemo ad =new ArgsDemo();
        ad.sum(1);
        ad.sum(1,2);
        ad.sum(1,2,3);

        ad.search(6, 3,5,7,9);  // 第一个参数匹配的情况下， 其他都在可变参数当中
        ad.search(9, 3,5,7,9);  // 第一个参数匹配的情况下， 其他都在可变参数当中
        // 可变参数列表兼容了数组
        int[] a={1,2,3,4,5,6,7,8};
        ad.search(6, a);
    }
    
}

// sum=1
// sum=3
// sum=6
// 没有找到6
// 找到了9
// 找到了6