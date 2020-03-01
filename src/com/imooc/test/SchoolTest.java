package com.imooc.test;
import com.imooc.schoolproject.Subject;
 
/**
 * SchoolTest
 */
public class SchoolTest {

    public static void main(String[] args) {
        // 测试类
        Subject sub1 = new Subject("计算机科学与技术", "53001", 4);
        System.out.println(sub1.info());
    }
}