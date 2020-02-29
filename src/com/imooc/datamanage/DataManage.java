package com.imooc.datamanage;

import java.util.InputMismatchException;
import java.util.Scanner;

import sun.security.util.Length;

/**
 * DataManage
 * 从键盘接收数据存放到数组中， 并对数组中的数据进行管理
 * @author yan
 */
public class DataManage {

    /**
     * 从键盘获取数据插入数组
     * @return 数组
     */
    public int[] insertDate() {
        int[] a=new int[10];
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<a.length-1;i++){
            System.out.println("请输入第"+(i+1)+"个数据：");
            try{
                a[i] = sc.nextInt();
                
            }catch(InputMismatchException e){
                System.out.println("输入的数据格式有误，不能为非数字！");
                sc.next();// 此处会加， 需要减
                i--;
            }
            
        }
        return a;
    }

    /**
     * 显示数组当中的内容
     * @param a：数组
     * @param length：要显示的数组长度
     */
    public void showData(int[] a,int length) {
        for(int i=0;i<length;i++){
            System.out.print(a[i]+"    ");
        }
        System.out.println();
    }

    /**
     * 从键盘接收一个数据插入到数组的指定位置
     * @param a：要插入的数据的数组
     * @param n：要插入的数据
     * @param k：要插入的位置，从0开始
     */
    public void insertAtArray(int[] a,int n, int k) {
        for(int i=a.length-1; i>=k;i--){
            a[i]=a[i-1];
        }
        a[k] = n;
    }

    /**
     * 输出数组中能被3整除的元素
     * @param a
     */
    public void divThree(int[] a) {
        String str="";
        int count=0;
        for(int n:a){
            if(n%3==0){
                str = str+n+"   ";
                count++;
            }
        }
        if(count==0){
            System.out.println("数组中没有能被3整除的元素！");
        }else{
            System.out.println("数组中能被3整除的元素为:"+str);
        }
        
    }

    /**
     * 提示信息
     */
    public void notice() {
        System.out.println("*******************************");
        System.out.println("        1--插入数据");
        System.out.println("        2--显示所有数据");
        System.out.println("        3--在指定位置插入数据");
        System.out.println("        4--查询能被3整除的数据");
        System.out.println("        0--退出");
        System.out.println("*******************************");
    }

    public static void main(String[] args) {
        DataManage dm=new DataManage();
        Scanner sc = new Scanner(System.in);
        int input=0;
        int [] a=null;

        while(true){
            dm.notice();
            System.out.println("请输入对应的数字进行操作：");
            try {
                input =sc.nextInt();
            } catch (InputMismatchException e) {
                //TODO: handle exception
                System.out.println("输入的数据格式有误，不能为非数字！");
                sc.next();
            }
            
            if(input==0){
                System.out.println("退出程序！");
                break;
            }
            switch(input){
                case 1:
                    a = dm.insertDate();
                    System.out.println("数据元素为：");
                    dm.showData(a, a.length-1);
                    break;
                case 2:
                    // 数组没有值
                    if(a!=null){
                        System.out.println("数组元素为：");
                        if(a[a.length-1]==0){
                            // 还没有插入数据， 只有9个值
                            dm.showData(a, a.length-1);
                        }else{
                            dm.showData(a, a.length);
                        }

                    }else{
                        System.out.println("还没在数组中插入数组， 请重新选择");
                    }
                    break;
                case 3:
                    // 数组没有值
                    if(a!=null){
                        if(a[a.length-1]==0){
                            Scanner sc1 = new Scanner(System.in);
                            System.out.println("请输入要插入的数据：");
                            try {
                                int n=sc1.nextInt();
                                System.out.println("请输入要插入的数据的位置：");
                                int k=sc1.nextInt();
                                dm.insertAtArray(a, n, k);
                            } catch (java.util.InputMismatchException e) {
                                System.out.println("输入的数据格式有误，不能为非数字！");
                                sc1.next();
                                break;
                            }
                            dm.showData(a, a.length);
                            
                        }else{
                            // 不能插入数据了
                            System.out.println("已经插入数据了， 请重新选择");
                        }

                    }else{
                        System.out.println("还没在数组中插入数组， 请重新选择");
                    }
                    break;
                case 4:
                // 查询能被3整除的数据
                    if(a!=null){
                        dm.divThree(a);
                    }else{
                        System.out.println("还未在数组中插入数据， 请重新选择");
                    }
                    break;
            }

        } 
    }
    
}