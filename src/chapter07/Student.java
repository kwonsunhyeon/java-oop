package chapter07;

public class Student {

    //필드
    String name;
    int grade;
    String department;

    //생성자 overloading
    //기본 생성자

    Student() {

    }
    Student(String n) {
        name = n;
    }
    Student(String n, int g) {
        name = n;
        grade =g;
    }
    Student(String n, int g, String d) {
        name = n;
        grade = g;
        department = d;
    }

    //학과와 학년을 매개변수로 받는 생성자(에러 발생)  -> 매개 변수 타입 순서를 지켜야함
    Student(int g , String d) {
        department =d;
        grade =g;
    }

}

