package task03;

/* Что это? «Кот», «Тигр», «Лев», «Бык», «хз»
1) Допиши метод getObjectType(Object o), который определяет, какой объект передали в него.
2) Для этого используй специальный оператор в языке Java - instanceof - который опеределяет тип объекта.
3) Подсказка: допиши условную конструкцию If-else.
Программа должна выводить на экран:
«Кот», «Тигр», «Лев», «Бык», «хз».
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        //Допиши тут свой код

        if (o instanceof Cat) {
            return "Кот";
        } else if (o instanceof Tiger) {
            return "Тигр";
        } else if (o instanceof Lion) {
            return "Лев";
        } else if (o instanceof Bull) {
            return "Бык";
        } else {
            return "хз";
        }
    }

    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
