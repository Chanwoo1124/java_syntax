package chanwoo;

import java.util.ArrayList;

public class maindd {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        animal[] 동물병원 = {cat,dog};
        for (animal animal : 동물병원) {
            animal.run();
        }


    }
}
