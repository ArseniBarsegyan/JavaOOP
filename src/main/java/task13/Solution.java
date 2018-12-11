package task13;

/*
 Конструкторы с параметрами. Сохранение состояния
 - В предыдущем примере ты выводил iq панды на экран, но состояние панды не сохранял.
 Проще говоря, ты создавал панду с разными iq, но все создаваемые панды были с iq = 0;
 Чтобы убедиться, скопируй класс Panda в этот пакет
 (не забудь поменять package в скопированном классе на package task13;),
 скопируй код из метода main task12 в метод main этого задания.
 - Из конструктора класса Panda убери строчку System.out.println("IQ панды " + iq);
 - Добавь вместо нее строчку System.out.println("IQ панды " + this.iq);
 - Запусти метод main.
 - Ты увидишь, что iq всех созданных тобой панд = 0;

 - Почитай про ключевое слово this в Java
 - Исправь программу, чтобы iq панды сохранялся в поле класса.
 */
public class Solution {
    public static void main(String[] args) {
        Panda panda1 = new Panda(10);
        Panda panda2 = new Panda(20);
        Panda panda3 = new Panda(30);
        Panda panda4 = new Panda(50);
        Panda panda5 = new Panda(90);
        Panda panda6 = new Panda(120);
        Panda panda7 = new Panda(150);
    }
}

