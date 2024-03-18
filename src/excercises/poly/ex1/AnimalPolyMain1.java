package excercises.poly.ex1;

public class AnimalPolyMain1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Duck duck = new Duck();
        Animal[] animals = {dog, cat, duck};
        for (Animal animal : animals) {

            System.out.println("동물 소리 테스트 시작");
            animal.sound();
            System.out.println("동물 소리 테스트 종료");

        }
    }

}
