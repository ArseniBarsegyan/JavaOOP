package task09;

import java.util.ArrayList;

public class Zoo {
    public ArrayList<Animal> animals = new ArrayList<Animal>();

    void addAnimal(Animal animal) {
        animals.add(animal);
    }

    void releaseAllAnimals() {
        animals.clear();
        System.out.println("Животные устроили хаос!");

    }
}
