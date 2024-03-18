package excercises.poly.ex5;

public class CastingMain3 {
    public static void main(String[] args) {
        Parent parent =  new Child();
        Child child = (Child) parent;   // down casting
        child.childMethod();

        Parent parent1 = new Parent();
        Child child1 = (Child) parent1;  // ClassCastException
        child1.childMethod();
    }
}
