package chapter08.poly;

public class Child extends Parent{
    String name;

    @Override
    void run() {
        System.out.println("자식이 달린다.");
    }
    void eat() {
        System.out.println("자식이 먹는다.");
    }
}
