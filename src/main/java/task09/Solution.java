package task09;

import java.util.ArrayList;

/*
 Зоопарк

 - Почитай про модификаторы доступа в Java (public, private, protected)
 - Почитай про конструктор и инициализацию переменных в конструкторе
   (присвоение начальных значений)

 Создай программу, которая будет создавать зоопарк, наполненный различными животными.
 Для этого нужно создать сам зоопарк, различных животных для него, и поместить животных в зоопарк.

 Для начала создай базовый класс животного, от которого будут наследоваться все остальные классы.
 - Создай в пакете класс Animal с полем int id (подумай про модификатор доступа этого поля)
 - Создай в нем метод getInfo, который будет выводить на экран надпись "Я - животное"

 Создай конкретные реализации этого класса - конкретных животных.
  - Создай класс Elephant
  - Создай класс Panda
  - Создай класс Crocodile
  - Создай класс Spider

 - Реализуй наследование (подумай какие классы должны наследоваться от каких)
 - Переопредели во всех классах метод getInfo(), чтобы он возвращал информацию о текущем животном
 в виде "Я - слон" и т.п.

 - Создай класс Zoo. Этот класс должен "хранить" всех добавляемых в него животных в каком-то контейнере.
 В данном случае будем хранить всех животных в ArrayList.

   - внутри этого класса создай поле с именем animals. подумай, какой тип должен хранить этот ArrayList
   и какой модификатор доступа должен иметь.
   - создай конструктор класса Zoo
   - в конструкторе инициализируй поле animals (инициализация - присвоение
   - добавь в класс следующие методы:
     - void addAnimal(Animal animal) - добавляет одно животное в зоопарк
     (добавляет передаваемое в метод животное в ArrayList)
     - void releaseAllAnimals() - высвободить всех животных из зоопарка
     (очистить ArrayList и вывести на экран "Животные устроили хаос!")
   - Реализуй методы добавления и высвобождения всех животных из зоопарка.

- В классе Solution создай метод main и в нем создай по одному животному каждого вида
- Создай зоопарк
- Запихни всех животных в зоопарк
- Освободи всех животных

 */

public class Solution {
    public static void main(String[] args) {

        Animal crocodile = new Crocodile();
        Animal elephant = new Elephant();
        Animal panda = new Panda();
        Animal spider = new Spider();

        Zoo zoo = new Zoo();

        zoo.addAnimal(crocodile);
        zoo.addAnimal(elephant);
        zoo.addAnimal(panda);
        zoo.addAnimal(spider);

        zoo.releaseAllAnimals();


    }
}
