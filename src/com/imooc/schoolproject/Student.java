package com.imooc.schoolproject;

/**
 * Student
 */
public class Student {

    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;
    private Subject studentSubject;

    public Student() {
    }

    public Student(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
        this.SsettudentNo(studentNo);
        this.setStudentName(studentName);
        this.setStudentSex(studentSex);
        this.setStudentAge(studentAge);
        this.setStudentSubject(studentSubject);
    }

    public String getStudentNo() {
        return this.studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return this.studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return this.studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public int getStudentAge() {
        return this.studentAge;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String info() {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
                + this.getStudentSex() + "\n年龄:" + this.getStudentAge();

        return str;
    }

    public String info(Subject mySubject) {
        String str = "学生信息如下：\n姓名：" + this.getStudentName() + "\n学号：" + this.getStudentNo() + "\n性别："
                + this.getStudentSex() + "\n年龄:" + this.getStudentAge()+"\n专业:"+ mySubject.getSubjectName();

        return str;
    }

    public Subject getStudentSubject() {
        return studentSubject;
    }

    public void setStudentSubject(Subject studentSubject) {
        this.studentSubject = studentSubject;
    }


}