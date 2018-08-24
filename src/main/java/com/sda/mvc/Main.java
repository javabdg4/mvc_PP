package com.sda.mvc;

public class Main {
    public static void main(String[] args) {

        Student student = new Student("Zenek", "Kebabowy", "234");

        StudentView studentView = new StudentView();

        StudentController studentController = new StudentController(studentView,student);

        studentController.updateView();
        studentController.setStudentName("Heniek");
        studentController.updateView();

    }
}
