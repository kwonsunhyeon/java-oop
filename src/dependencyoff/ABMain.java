package dependencyoff;

public class ABMain {
    public static void main(String[] args) {
        A a = new A("aClass");
        System.out.println(a.aField);
        System.out.println(a.aMethod());

        B b = new B("bClass");
        System.out.println(b.bField);
        System.out.println(b.bMethod());

    }


}
class A{
    String aField;
    public A(String aField){
        this.aField = aField;
    }
    class B{
        String bField;
        public B(String bField){
            this.bField = bField;
        }
    }
    String aMethod(){
    return "A.aMethod";
    }
    String bMethod(){
        return "B.bMethod";
    }
}
