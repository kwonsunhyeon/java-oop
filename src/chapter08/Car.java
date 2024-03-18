package chapter08;

public class Car {
    String color;
    String name;

    public void go(){
        System.out.println("전진");
    }
    public void back(){
        System.out.println("후진");
    }
}
class Taxi extends Car{
    @Override
    public void go() {
        System.out.println("미터기 켜고 전진");
    }
}
