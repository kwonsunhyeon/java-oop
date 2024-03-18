package chapter08.pkg2;

import chapter08.pkg1.Aclass;

public class Cclass extends Aclass {
    Cclass() {
        this.varA = "varA";
    //   this.varA2 = "varA2"; // X
        this.methodA();
    //    this.methodA2(); // default 접근제한자.(같은패키지 안에서 호출 허용)
    }
}
