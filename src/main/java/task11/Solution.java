package task11;

/*
 Конструкторы.
 Можешь прочитать все, а можешь только начало страницы.
 http://developer.alexanderklimov.ru/android/java/constructor.php

  Конструктор по умолчанию
  - Создай в пакете класс Demo, в нем создай конструктор public Demo() {}
  - В классе Solution создай новый объект класса Demo.

  - Создай в пакете класс Panda, в нем создай конструктор public Panda() {}
  - В конструкторе выведи на экран сообщение "Панда построена"
  - В классе Solution создай новый объект класса Panda.

  - Создай в пакете класс Spaceship, в нем создай конструктор public Spaceship() {}
  - В конструкторе выведи на экран сообщение "Космический корабль построен"
  - В классе Solution создай новый объект класса Spaceship.

  - Создай в пакете класс StarDestroyer, в нем создай конструктор public StarDestroyer() {}
  - В конструкторе выведи на экран сообщение "Уничтожитель миров построен"
  - В классе Solution создай новый объект класса StarDestroyer.

  - Запусти класс Solution.
  - На экран должно вывести
   "Панда построена"
   "Космический корабль построен"
   "Уничтожитель миров построен"
   - Разберись что произошло
 */
public class Solution {
    public static void main(String[] args) {
        Demo demo = new Demo();
        Panda panda  = new Panda();
        SpaceShip spaceShip  = new SpaceShip();
        StarDestroyer starDestroyer = new StarDestroyer();
            }
}
