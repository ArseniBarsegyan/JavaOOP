package task04;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «Корова», «Животное»
1) Напиши метод, который определяет, какой объект передали в него (по аналогии с task03).
2) Программа должна выводить на экран:
«Кот», «Тигр», «Лев», «Бык», «Корова», «Животное».
Замечание: постарайся определять тип животного как можно более точно.
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    //TODO - implement your solution
    public static String getObjectType(Object o) {
        if (o instanceof Tiger) {
            return "Тигр";
        } else if (o instanceof Lion) {
            return "Лев";
        } else if (o instanceof Cat) {
            return "Кот";
        } else if (o instanceof Bull) {
            return "Бык";
        } else if (o instanceof Cow) {
            return "Корова";
        } else if (o instanceof Animal) {
            return "Животное";
        } else {
            return "хз";
        }
    }


    public static class Cat extends Animal {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
