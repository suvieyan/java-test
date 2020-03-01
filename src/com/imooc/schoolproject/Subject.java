package com.imooc.schoolproject;

/**
 * Subject
 */
public class Subject {

    private String subjectName;
    private String subjectNo;
    private int subjectLife;
    private Student[] myStudents;

    public Subject() {

    }

    public Subject(String subjectName, String subjectNo, int subjectLife) {
        this.subjectName = subjectName;
        this.subjectNo = subjectNo;
        this.subjectLife = subjectLife;
    }

    public String info() {
        String str="专业信息如下：\n专业名称："+this.getSubjectName()+"\n专业编号："+ this.getSubjectNo()+"\n专业年限："+this.getSubjectLife();
        return str; 
    }

    public String getSubjectName() {
        return this.subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectNo() {
        return this.subjectNo;
    }

    public void setSubjectNo(String subjectNo) {
        this.subjectNo = subjectNo;
    }

    public int getSubjectLife() {
        return this.subjectLife;
    }

    public void setSubjectLife(int subjectLife) {
        this.subjectLife = subjectLife;
    }

    public Subject(String subjectName, String subjectNo, int subjectLife, Student[] myStudents) {
        this.subjectName = subjectName;
        this.subjectNo = subjectNo;
        this.subjectLife = subjectLife;
        this.myStudents = myStudents;
    }

    public Student[] getMyStudents() {
        return myStudents;
    }

    public void setMyStudents(Student[] myStudents) {
        this.myStudents = myStudents;
    }

    public void addStudent(Student student) {
        
    }

}