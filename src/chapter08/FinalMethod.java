package chapter08;

public class FinalMethod {
    void method(){

    }
    final void method2(){

    }
    class SubFinalMethod extends FinalMethod{
        @Override
        void method() {
            System.out.println("method() 재정의 가능");
        }
    //    void method2()
    }
}
