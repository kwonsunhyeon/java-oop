package chapter08;

public class SmartPhoneMain {
    public static void main(String[] args) {

        SmartPhone sp = new SmartPhone();
        sp.name = "갤럭시";
        sp.color = "black";
        sp.company = "samsung";

        System.out.println(sp.name);
        System.out.println(sp.color);
        System.out.println(sp.company);

        sp.call();
        sp.receive();
        sp.installApp();
    }
}
