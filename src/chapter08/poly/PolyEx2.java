package chapter08.poly;

public class PolyEx2 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.run();

        Child c = (Child) p;
        c.eat();


//       Parent p1 = new Parent();
//        p1.run();
//        Child c1 = (Child) p1; // ClassCastException 발생한다

}
    }
