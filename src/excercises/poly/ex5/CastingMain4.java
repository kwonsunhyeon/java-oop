    package excercises.poly.ex5;

public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        System.out.println("parent 호출");
        call(parent);

        Parent parent1 = new Parent();
        System.out.println("parent1 호출");
        call(parent1);
    }
    private static void call(Parent parent){
        parent.parentMethod();
        if(parent instanceof Child){ //Child 인스턴스가 왼쪽 parent에 대입이 되는가?
            System.out.println("Child 인스턴스가 맞음");
            Child child = (Child) parent;
            child.childMethod();
        }
    }
}
