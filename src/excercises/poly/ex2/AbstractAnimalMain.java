package excercises.poly.ex2;

public class AbstractAnimalMain {
    public static void main(String[] args) {

       //추상클래스 생성 불가 AbstractAnimal animal = new AbstractAnimal()

       Dog dog = new Dog();
       Duck duck = new Duck();
       Cat cat =  new Cat();

       cat.sound();
       cat.move();
       duck.move();
       duck.sound();
       dog.move();
       dog.sound();

    }
}
