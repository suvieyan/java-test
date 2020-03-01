# Java零基础入门

[toc]



## 1.Java基础语法

### 1.Java初识

#### 1.历史

- 原本sun, 后期oracle

#### 2.java概念辨析

- **Java编译执行流程**:.java - 编译器变成字节码(.class)- 解释执行(JVM)- 机器指令
- JVM:Java虚拟机,
- JDK:Java语言的软件开发工具包

  - javac: 编译器, 将源程序转换成字节码
  - java 运行编译后的java程序(.class后缀的)
  - 附带JRE

- JRE:java运行时环境

  - Java虚拟机(JVM)
  - java核心类库和支持文件

- JRE和JDK的区别

  - 只需运行Java程序, JRE即可. 面向使用者
  - 开发Java软件, 需要JDK. 面向开发者

- JRE = JVM+JavaSE标准类库
- JDK = JRE+开发工具集(javac等)

#### 3.Java平台

- JAVASE: 开发桌面, Java标准版
- JAVAEE: web程序, JAVA企业版
- JAVAME: 移动设备, over了

#### 4.执行流程

- javac 文件名.java
- java 文件名

#### 5.Java程序的结构

包名:域名的反写
一般的Java的程序的结构:

``` java
package com.imooc;

public class HelloImooc {
    // HelloImooc 类名
    public static void main(String[] args){
        // 主方法, 
        System.out.println("Hello, Imooc");
    }
}
```

#### 6.基本语法

- 大小写敏感：Java 是大小写敏感的，这就意味着标识符 Hello 与 hello 是不同的。
- 类名：对于所有的类来说，类名的首字母应该大写。如果类名由若干单词组成，那么每个单词的首字母应该大写，例如 MyFirstJavaClass 。
- 方法名：所有的方法名都应该以小写字母开头。如果方法名含有若干单词，则后面的每个单词首字母大写。
- 源文件名：源文件名必须和类名相同。当保存文件的时候，你应该使用类名作为文件名保存（切记 Java 是大小写敏感的），文件名的后缀为 .java。（如果文件名和类名不相同则会导致编译错误）。
- 主方法入口：所有的 Java 程序由 public static void main(String []args) 方法开始执行。

### 2.Java 常量与变量

#### 1.标识符:

- 字母/数字/下划线美元符号组成
- 严格区分大小写
- 不能是关键字和保留字
- 标识符不能数字开始, 不包含空格
- 有一定意义

#### 2.关键字,保留字

- package
- public
- void
- class

#### 3.变量

- 变量三元素: 变量类型, 变量名, 变量值
- 变量名命名规则:

  - 标识符
  - 驼峰法命名方式
  - 见名知意
  - 长度不限制

- 类命名规则:Pascal命名规则:类名的所有单词的首字母都大写

#### 4.数据类型

- 基本数据类型

  - 数值

    - 整数类型:byte(1字节)/short(2字节)/int(4字节)/long(8字节)

      - 整形字面值及变量声明

        - 整形字面值:

          - 八进制, 0开头
          - 十六进制, 0x或者0X表示

        - L: **0x123L 是一个长整型**
        - 变量声明:数据类型 变量名;
        - int n;声明整形变量n
        - 变量赋值 ; 变量初始化

    - 浮点类型:float(4字节)/double(8字节), 单精度默认是1位, 双精度默认是保留2位

      - 浮点型的字面值

        ``` java
        // 报错的声明方式
        float f=123.43;
        ```

        - 123.43d 或者123.43D表示double类型
        - 123.4f或者123.4F

  - 字符(char, 2字节)

    - 字符型字面值

      单引号的单个字符才是字符型

      char a = 'a';

      ``` java
      package com.imooc;
      
      public class HelloImooc {
          // HelloImooc 类名
          public static void main(String[] args){
              // 主方法,
              double d = 123;
              System.out.println("d="+d);
              char a ='a';
              System.out.println("a="+a);
              // char自动识别ASCII码值
              char ch = 65;
              System.out.println("ch="+ch);  // ch=A
              // 如果字面值超出char类型表示的数据范围,需要强制类型转换
              char ch1 = (char)65536;
              System.out.println("ch1="+ch1);
      
          }
      }
      ```

      - 单引号的单个字符才是字符型

  - 布尔型(Boolean, 1字节)

    - 布尔值的字面量

      - 只支持true,false

- 引用数据类型

  - 类
  - 接口
  - 数组

#### 7.局部变量的存储方式

- 栈
- 堆
- 常量池
- int n=100;发生了什么:
- 在栈中开辟int字节大小的空间, 存放100, n 是存放100 的地址的别名

#### 9.Unicode编码

能表示所有字符集, "\u"开始的4位字符

``` java
// char 是4位
char c ='\u005d';
System.out.println("c="+c);  // ]
```



- 能表示所有字符集, "\u"开始的4位字符 

#### 11.字符串字面量

String 声明, 双引号引起来的

``` java
package com.imooc;

public class HelloImooc {
    // HelloImooc 类名
    public static void main(String[] args){
        // 主方法,
        // 定义空串
        String s1="";
        System.out.println("s1="+s1);
        // 定义hello的字符串
        String s2="Hello";
        System.out.println("s2="+s2);
        // 定义Unicode的字符串
        String s3="\u005d\u005f";
        System.out.println("s3="+s3);
        // 定义Unicode和
        String s4="A\u005d\u005fB";
        System.out.println("s4="+s4);
        // 空格占一个字符
        String s5="\u005d   \u005f";
        System.out.println("s5="+s5);
    }
}

```



- String 声明, 双引号引起来的

#### 12.科学计数法表示

``` java
double d=1.23E5;
float f=1.23e5f;
double d1=.2;
System.out.println("d="+d); // d=123000.0
System.out.println("f="+f);  // f=123000.0
System.out.println("d1="+d1);  // d1=0.2
```



#### 13.类型转换

- 自动类型转换:隐式类型转换

  - 整形之间转换, 按长短
  - 单精度转双精度
  - char转int
  - long转float和double

- 强制类型转换. char c = (char)65535; // 会造成数据丢失

### 3.运算符

- 算术运算符

  - 加减乘除

- 关系运算符

  - ==; >=...

- 位运算符
- 逻辑运算符

  - &&; ||, !

- 赋值运算符
- 其他运算符

  - 条件运算符（?:）
  - instanceof 运算符

    - 等同于Python的isinstance

### 4.流程控制

- 1.选择结构

  - if-else
  - switch case

- 2.循环结构

  - while 循环
  - do…while 循环
  - for 循环

### 5.数组

数组是储存在堆上的对象，可以保存多个同类型变量

#### 1.一维数组

- 声明数组

  - double[] myList;         // 首选的方法
  - double myList[];         //  效果相同，但不是首选方法

- 创建数组

  - arrayRefVar = new dataType[arraySize];

    - 一、使用 dataType[arraySize] 创建了一个数组。
    - 二、把新创建的数组的引用赋值给变量 arrayRefVar。

  - dataType[] arrayRefVar = new dataType[arraySize];
  - dataType[] arrayRefVar = {value0, value1, ..., valuek};

- 遍历数组

  - for 循环遍历,索引遍历
  - for-each 遍历

    - // 打印所有数组元素
      for (double element: myList) {
       System.out.println(element);
      }

#### 2.二维数组

- type[][] typeName = new type[typeLength1][typeLength2];

#### 3.Arrays 类

- fill 给数组赋值
- sort  数组排序 升序
- equals 比较
- binarySearch  查找数组

### 6.Java方法

方法就是实现一类功能

方法声明：

```java
访问修饰符：public static
返回类型：void， 不返回任何数据
方法名：main
参数列表：args
方法体
public static void main(String[] args){
  System.out.println('helloworld');
}
```

#### 1.无参无返回值

```java
package com.imooc.method;

public class MethodDemo{
    // 打印输出*
    public void printStar(){
        System.out.println("**********************");
    }

    public static void main(String[] args) {
        // 创建对象
        MethodDemo myMethodDemo = new MethodDemo();
        // 对象调用方法
        myMethodDemo.printStar();
        System.out.println("欢迎来到Java世界");
        myMethodDemo.printStar();
    }

}

// **********************
// 欢迎来到Java世界
// **********************
```



#### 2.无参有返回值

```java
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
```



#### 3.有参有返回值

```java
package com.imooc.method;

public class MaxDemo{
    public void max(float a, float b) {
        float max;
        if(a>b){
            max=a;
        }else{
            max=b;
        }
        System.out.println("两个数"+a+"和"+b+"的最大值为："+max);
    }

    public static void main(String[] args) {
        MaxDemo myMaxDemo = new MaxDemo();
        float a=10;
        float b=12;
        myMaxDemo.max(a, b); 
        float m=5.6f, n=8.9f;
        myMaxDemo.max(m, n);
    }
}
// 两个数10.0和12.0的最大值为：12.0
// 两个数5.6和8.9的最大值为：8.9
```



#### 4.有参无返回值

```java
package com.imooc.method;

public class FacDemo{
    public int fac(int n) {
        int s=1;
        for(int i=1;i<n;i++){
            s*=i;
        }
        return s;
    }
    public static void main(String[] args) {
        FacDemo myFacDemo = new FacDemo();
        int value = myFacDemo.fac(10);
        System.out.println("10!="+value);
        // 计算多个阶乘
        int sum =0;
        for(int i=1;i<=5;i++){
            sum += myFacDemo.fac(i);
        }
        System.out.println("1!+2!+3!+4!="+sum);
    }
}
// 10!=362880
// 1!+2!+3!+4!=34
```



#### 5.数组作为方法参数

```java
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
```

#### 6.方法重载

方法名相同， 方法参数不同, 无论是数量还是类型

```java
package com.imooc.method;

public class MathDemo{
    public int plus(int[] arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
        return sum;
    }
    
    public double plus(double m, double n){
        return m+n;
    }
    public int plus(int m, int n){
        return m+n;
    }
    public static void main(String[] args) {
        int m=5,n=3;
        int[] arr={1,2,3,4,5};
        MathDemo myMathDemo = new MathDemo();
        System.out.println("int类型的和："+myMathDemo.plus(m, n));
        System.out.println("double类型的和："+myMathDemo.plus(4.3, 5.6));
        System.out.println("arr类型的和："+myMathDemo.plus(arr));
    }
}

// int类型的和：8
// double类型的和：9.899999999999999
// arr类型的和：15
```

#### 7.参数传递

```java
package com.imooc.method;

public class ExchangeDemo{
    public void swap(int a, int b) {
        int temp;
        System.out.println("交换前：a="+a+",b="+b);
        temp=a; a=b; b=temp;
        System.out.println("交换后：a="+a+",b="+b);
        
    }
    public static void main(String[] args) {
        ExchangeDemo myExchangeDemo = new ExchangeDemo();
        int m=3, n=6;
        // 不会改变主方法的值
        System.out.println("交换前：m="+m+",n="+n);
        myExchangeDemo.swap(m, n);
        System.out.println("交换后：m="+m+",n="+n);
    }
}
// 交换前：m=3,n=6
// 交换前：a=3,b=6
// 交换后：a=6,b=3
// 交换后：m=3,n=6
```



#### 8.数组传值

会改变数组中的值

```java
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
```

#### 9.可变参数列表

```java
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
```

#### 10.可变参数列表作为方法参数的重载问题

```java
package com.imooc.method;

/**
 * 关于可变参数列表和重载的问题
 * ArgsDemo1
 * @author yan
 */
public class ArgsDemo1 {

    public int plus(int a, int b) {
        System.out.println("不带可变参数的方法被调用");
        return a+b;
        
    }
    // 可变参数列表所在方法是最后被调用的
    public int plus(int... a) {
        System.out.println("带可变参数的方法被调用");
        int sum=0;
        for(int i:a){
            sum+=i;
        }
        return sum;   
    }

    public static void main(String[] args) {
        ArgsDemo1 ad=new ArgsDemo1();
        System.out.println("和为："+ad.plus(1, 2));
        
    }
}

// 不带可变参数的方法被调用
// 和为：3
// javadoc -d doc ArgsDemo1.java
```



#### 11.文档注释

```java
javadoc -d doc ArgsDemo1.java
```



#### 12.方法调试



### 7.数组位移与统计

定义一个类， 对数组中的数据进行管理

```java
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
```



## 2.java面向对象

### 1.面向对象思想



#### 1.思想

对象：类的实例化表现

面向对象：根据事物特征进行处理

类：模型

属性和方法：





#### 2.面向对象demo1

##### 1.Cat.java

```java
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
```

##### 2.CatTest.java

```java
package com.imooc.animal;

/**
 * CatTest
 */
public class CatTest {

    public static void main(String[] args) {
        Cat one=new Cat();
        one.run();
        one.eatFish();
        System.out.println("年龄："+one.month);
        System.out.println("昵称："+one.name);
        System.out.println("体重："+one.weight);
        System.out.println("品种"+one.species);
        one.name="alex";
        one.run(one.name);

    }
}
```

##### 3.面向对象设计原则：单一职责原则

##### 4.new关键字意义

声明对象就是class 定义一个对象

Cat one; // 声明对象只是在内存栈开辟一块内存空间

new Cat();// 实例化对象， 在内存堆当中开辟一块内存空间

二者通过赋值符号进行关联， 把堆空间的内存地址存放到栈当中

```java
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
```



##### 5.构造方法

- 构造方法的方法名与类名相同

- 构造方法无返回值
- 只能在对象实例化时调用

##### 6.this 关键字， 当前对象， 谁调用就是谁

最好不使用和构造方法同名的方法

```java
package com.imooc.animal;

import sun.print.resources.serviceui;

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
```



### 2.封装

因此对象的

#### 1.方法封装

```java
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
```



#### 2.创建包

```java
package com.imooc.animal;  // 定义当前文件存放在这个包
```

#### 3.导入包

```java
package com.imooc.test;  // 定义包
import com.imooc.animal.Cat;  // 导入包
import com.imooc.* ; // 只能找到直接的包名

/**
 * Test
 */
public class Test {
    public static void name() {
        Cat cat = new Cat();
        // 直接导入 com.imooc.animal.CatTest
        com.imooc.animal.CatTest ct = new com.imooc.animal.CatTest();
    }

    
}
```

#### 4.static 关键字， 静态信息

static 修饰的为静态成员， 类成员， 无论实例化多少对象共用同一个内存空间

static： 静态属性/类属性； 静态方法/类方法

对象名.静态方法（）

类名.静态方法（）

class： public， abstract， finnal

static 不能修饰局部变量

静态方法中只能直接调用静态成员

构造代码块顺序执行, 构造代码块实例化的时候就会执行

静态代码块先于构造代码块执行， 静态代码块只执行一次



### 3.继承

Extends 关键字实现继承， 必须单继承

方法重载： 同一个类， 相同方法名， 参数列表不同

方法重写：有继承关系的子类中， 方法名， 方法参数列表类型顺序个数必须相同， 返回值相同。 方法的参数名无关



### 4.单例



### 5.多态

## 3.java常用工具类

### 1.异常

### 2.包装类

### 3.字符串

### 4.集合

### 5.集合排序

### 6.泛型

### 7.多线程

### 8.输入输出流

