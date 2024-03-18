package excercises.poly.ex2;

import excercises.poly.ex1.Animal;

public class Cat extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("고양이가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("야옹야옹");

    }

}
