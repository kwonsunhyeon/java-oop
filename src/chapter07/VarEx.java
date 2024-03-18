package chapter07;

public class VarEx {
    public static void main(String[] args) {
        // static으로 선언된 클래스변수는 객체 생성하지 않고 클래스명.변수
        System.out.println("Avante 제조사 : " + Avante.company);

        // Avante를 만든 인스턴스(객체)인 a1
        Avante a1 = new Avante(); // a1 : 0x001
        Avante a2 = new Avante(); // a2 : 0x002

        a1.color = "화이트"; // 0x001
        a2.color = "블랙"; // 0x002

        //인스턴스 변수 출력
        System.out.println("a1 색상 : " +a1.color);
        System.out.println("a2 색상 : " + a2.color);

        //클래스 변수를 인스턴스 객체로 출력
        System.out.println("a1 제조사 :  " + a1.company);
        System.out.println("a2 제조사 :  " + a2.company);

        //클래스 변수의 값 변경
        a1.company = "기아";

        //클래스 변수의 값 변경 후 클래스 변수 출력
        System.out.println("Avante 제조사 : " + Avante.company);

        //클래스 변수의 값 변경 후 인스턴스 변수 출력
        System.out.println("a1 제조사 : " + a1.company);
        //a2.company ? "기아"? : "현대"?
        System.out.println("a2 제조사: "  + a2.company);
    }
}
