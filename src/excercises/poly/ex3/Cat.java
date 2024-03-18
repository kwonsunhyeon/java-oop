package excercises.poly.ex3;

import excercises.poly.ex2.AbstractAnimal;

public class Cat implements InterfaceAnimal {
    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("야옹야옹");

    }

}
