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