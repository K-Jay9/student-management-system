package com.example.studentmanagement;

import java.time.LocalDate;

public class Student
{

    private String RegNo;
    private String CourseName;
    private String CourseCode;
    private String HallName;
    private int HallNumber;
    private LocalDate dob;
    private String Email;
    private LocalDate joining;
    private LocalDate graduation;

    public Student() {
    }

    public Student(String regNo, String courseName, String courseCode, String hallName, int hallNumber, LocalDate dob, String email, LocalDate joining, LocalDate graduation) {
        RegNo = regNo;
        CourseName = courseName;
        CourseCode = courseCode;
        HallName = hallName;
        HallNumber = hallNumber;
        this.dob = dob;
        Email = email;
        this.joining = joining;
        this.graduation = graduation;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RegNo='" + RegNo + '\'' +
                ", CourseName='" + CourseName + '\'' +
                ", CourseCode='" + CourseCode + '\'' +
                ", HallName='" + HallName + '\'' +
                ", HallNumber=" + HallNumber +
                ", dob=" + dob +
                ", Email='" + Email + '\'' +
                ", joining=" + joining +
                ", graduation=" + graduation +
                '}';
    }

    public String getRegNo() {
        return RegNo;
    }

    public void setRegNo(String regNo) {
        RegNo = regNo;
    }

    public String getCourseName() {
        return CourseName;
    }

    public void setCourseName(String courseName) {
        CourseName = courseName;
    }

    public String getCourseCode() {
        return CourseCode;
    }

    public void setCourseCode(String courseCode) {
        CourseCode = courseCode;
    }

    public String getHallName() {
        return HallName;
    }

    public void setHallName(String hallName) {
        HallName = hallName;
    }

    public int getHallNumber() {
        return HallNumber;
    }

    public void setHallNumber(int hallNumber) {
        HallNumber = hallNumber;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public LocalDate getJoining() {
        return joining;
    }

    public void setJoining(LocalDate joining) {
        this.joining = joining;
    }

    public LocalDate getGraduation() {
        return graduation;
    }

    public void setGraduation(LocalDate graduation) {
        this.graduation = graduation;
    }
}
