package task05;

/* Fly, Run, Climb для классов Cat, Dog, Tiger, Duck
--- !!!ПОЧИТАЙ, ЧТО ТАКОЕ ИНТЕРФЕЙС!!! ---

ССЫЛКИ:
https://ru.stackoverflow.com/questions/136909/%D0%98%D0%BD%D1%82%D0%B5%D1%80%D1%84%D0%B5%D0%B9%D1%81%D1%8B-%D0%B2-%D0%9E%D0%9E%D0%9F-java-%D0%BF%D0%BE-%D0%BF%D1%80%D0%BE%D1%81%D1%82%D0%BE%D0%BC%D1%83

1. Внутри класса Solution создай интерфейс public interface Fly(летать) с методом void fly().
2. Внутри класса Solution создай интерфейс public interface Climb(лазить по деревьям) с методом void climb().
3. Внутри класса Solution создай интерфейс public interface Run(бегать) с методом void run().
4. Подумай логически, какие именно интерфейсы нужно добавить для каждого класса.
5. Добавь интерфейсы классам Cat(кот), Dog(собака), Tiger(тигр), Duck(Утка).
*/
public class Solution {

    public interface Fly {
        void fly();
    }

    public interface Climb {
        void climb();
    }

    public interface Run {
        void run();
    }

    public class Cat implements Climb, Run {
        public void climb() {
        }

        public void run() {
        }
    }

    public class Dog implements Run {
        public void run() {
        }
    }

    public class Tiger extends Cat implements Climb, Run {
        public void climb() {
        }

        public void run() {
        }
    }

    public class Duck implements Fly, Run {
        public void fly() {
        }

        public void run() {
        }
    }
}
