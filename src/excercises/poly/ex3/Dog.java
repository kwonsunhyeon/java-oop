package excercises.poly.ex3;

import excercises.poly.ex2.AbstractAnimal;

public class Dog implements InterfaceAnimal {
    @Override
    public void move() {
        System.out.println("강아지가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("멍멍멍멍");

    }
}
