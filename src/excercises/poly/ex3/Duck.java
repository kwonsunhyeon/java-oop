package excercises.poly.ex3;

import excercises.poly.ex2.AbstractAnimal;

public class Duck implements InterfaceAnimal {
    @Override
    public void move() {
        System.out.println("오리가 움직입니다.");
    }

    @Override
    public void sound() {
        System.out.println("꽥꽥꽥꽥");

    }
}
