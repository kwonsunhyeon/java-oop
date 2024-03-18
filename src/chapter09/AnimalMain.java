package chapter09;

public class AnimalMain {
    public static void main(String[] args) {
        Animal eagle = new Eagle();
        System.out.println(eagle);

        eagle.sleep();
        eagle.eat();

        Eagle eagle1 = (Eagle) eagle;
        System.out.println(eagle1);
        eagle1.eat();


    }
}
