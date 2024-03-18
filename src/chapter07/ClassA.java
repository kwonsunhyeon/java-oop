package chapter07;

public class ClassA {
    public static void main(String[] args) {

        ClassA ca = new ClassA();
        ClassB cb = new ClassB();
        ca.print();
        cb.print();
    }

    private void print() {
        System.out.println("여기는 classA");
    }
}
    class ClassB{
        void print() {
        System.out.println("여기는 ClassB");
    }
}
