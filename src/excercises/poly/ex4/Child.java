package excercises.poly.ex4;

public class Child extends Parent{
    public String name = "child";

    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
