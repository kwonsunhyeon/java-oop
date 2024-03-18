package chapter10.interfacePkg;

public class OuterMain {
    public static void main(String[] args) {
        
        Outer out = new Outer();
        out.setIe(new InterfaceExImple());
        out.outerMethod();
        out.setIe(new InterfaceExImple2());
        out.outerMethod();
    }
}
/*
OuterMain 클래스는 Outer클래스의 outerMethod()을 호출하는 메인 클래스입니다.
Outer 클래스는 InterFaceEx 인터페이스를 구현하는 객체를 참조할 수 있는 ie 필드를 가짐
outerMethod()은 ie 필드가 참조하는 객체의 메소드를 호출합니다.
 */
