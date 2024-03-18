package chapter08;

public class ChildEx extends ParentEx{
    ChildEx(){
        this(1);
        System.out.println("(3)");
    }

    public ChildEx(int i) {
        System.out.println("(4)");
    }
}
