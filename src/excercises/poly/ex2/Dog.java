package excercises.poly.ex2;

import excercises.poly.ex1.Animal;

public class Dog extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("멍멍멍멍");

    }
}
