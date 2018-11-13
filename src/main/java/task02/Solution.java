package task02;

/* Три класса
1) Создай в пакете task02 базовый класс - Animal.
2) Унаследуй класс Duck от Animal.
3) По аналогии с классом Duck(утка) создай классы Cat(кошка) и Dog(собака).
4) Подумай, что должен возвращать метод toString в классах Cat и Dog и допиши этот метод.
5) В методе main создай по два объекта каждого класса и выведи их на экран.
Объекты класса Duck уже созданы и выводятся на экран.
*/
public class Solution {
    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat cat1 = new Cat();
        Cat cat2 = new Cat();
        System.out.println(cat1);
        System.out.println(cat2);

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        System.out.println(dog1);
        System.out.println(dog2);


    }
}
