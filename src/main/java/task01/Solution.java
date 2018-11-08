package task01;

/* Метод getName в классе Cat
Используй наследование, чтобы программа скомпилировалась.
Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись «Я - кот».
*/
public class Solution {
    public static void main(String[] args) {
        Pet cat = new Cat();
        System.out.println(cat.getName());
    }
}
