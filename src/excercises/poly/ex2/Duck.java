package excercises.poly.ex2;

import excercises.poly.ex1.Animal;

public class Duck extends AbstractAnimal {
    @Override
    public void move() {
        System.out.println("오리가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("꽥꽥꽥꽥");

    }
}
