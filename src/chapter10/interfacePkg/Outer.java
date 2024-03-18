package chapter10.interfacePkg;

public class Outer {
    interface InterfaceEx{
        void method();
    }
    InterfaceEx ie;

    public void setIe(InterfaceEx ie) {
        this.ie = ie;
    }
    void outerMethod(){
        ie.method();
    }
}

