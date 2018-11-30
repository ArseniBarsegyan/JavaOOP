package task08;

import java.util.ArrayList;

/* Полиморфизм в действии
1) Создай в пакете интерфейс Shape(фигура) с методом getSquare()
2) Создай в пакете классы Triangle(треугольник), Rectangle(прямоугольник)
3) Реализуй интерфейс в этих классах:
 - Метод getSquare() в каждом реализуемом им классе должен выводить
   на экран информацию о площади фигуры, описываемым этим классом, к примеру
   в классе Triangle метод getSquare() должен выводить на экран фразу "площадь треугольника",
   в классе Rectangle метод getSquare() должен выводить на экран фразу "площадь прямоугольника".
4) Создай в классе Main два объекта интерфейса:
 - Первый объект Shape rectangle = new Rectangle();
 - Второй объект Shape triangle = new Triangle();
5) Создай ArrayList, который может содержать в себе только объекты интерфейса Shape.
 Подсказка: для этого используй ArrayList<Shape>.
6) Добавь созданные объекты в ArrayList.
7) Пройдись по всему ArrayList с помощью конструкции foreach и для каждого элемента вызови его метод getSquare();

На экран должно вывестись "площадь треугольника","площадь прямоугольника"
*/
public class Solution {
    public static void main(String[] args) {

        Shape triangle = new Triangle();
        Shape rectangle = new Rectangle();

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(triangle);
        shapes.add(rectangle);

        for (Shape i : shapes) {
            i.getSquare();
        }

}
