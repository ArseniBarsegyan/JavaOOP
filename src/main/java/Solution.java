import task01.Cat;
import task01.Dog;
import task01.Pet;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<Pet> pets = new ArrayList<Pet>();
        pets.add(new Cat());
        pets.add(new Dog());

        for (int i = 0; i < pets.size(); i++) {
            System.out.println(pets.get(i).getName());
        }
    }
}
