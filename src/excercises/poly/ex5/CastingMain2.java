package excercises.poly.ex5;

public class CastingMain2 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;   //업 캐스팅
        Parent parent1 = child;   // child 앞에 (Parent) 생략되어 있지만 적지 않음 자연스럽게 업 캐스팅하기 때문에

        parent.parentMethod();
        parent1.parentMethod();
    }
}
