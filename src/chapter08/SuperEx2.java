package chapter08;

public class SuperEx2 {
}

class Parent2 {
    String name;

    public Parent2(String name) {
        this.name = name;
    }
}

class Child2 extends Parent2 {
    public Child2(String name) {
        super(name);  // 부모생성자 실행 : 부모클래스 객체가 먼저 생성되고 자식 객체가 생성되므로
    }
}
