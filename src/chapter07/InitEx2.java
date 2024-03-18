package chapter07;

public class InitEx2 {
    //static 변수
    static int sVar;
    //static 메서드
    static  void sMethod(){}  //static 메소드에서 this 사용 불가!!!!! & 인스턴스 변수, 메소드 사용 불가!!!!
    //static 메서드2
    static void sMethod2(){}

    //인스턴스 변수
    int var;
    //인스턴스 메서드
    void method(){}

    //static 초기화 블럭
    static {
        sVar = 0; //static 변수
        sMethod(); //static 메서드
    }
}

