package dependencyoff;

public class ABMain {
    public static void main(String[] args) {
        A a = new A("aClass");
        System.out.println(a.aField);
        System.out.println(a.aMethod());

    }


}
class A{
    String aField;
    public A(String aField){
        this.aField = aField;
    }

    String aMethod(){
    return "A.aMethod";
    }
}
