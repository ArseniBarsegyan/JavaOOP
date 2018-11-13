package task06;

/* Fly, Run, Swim для классов Duck, Penguin, Toad
1) Есть интерфейсы Fly(летать), Swim(плавать), Run(бегать).
2) Добавь эти интерфейсы классам Duck(утка), Penguin(пингвин), Toad(жаба)
*/
public class Solution {

    public interface Fly {
        void fly();
    }

    public interface Flyable {
        void fly();
    }

    public interface Run {
        void run();
    }

    public interface Swim {
        void swim();
    }

    public class Duck implements Fly, Swim, Run {
        public void fly() {
        }

        public void swim() {
        }

        public void run() {
        }
    }

    public class Penguin implements Swim, Run {
        public void swim() {
        }

        public void run() {
        }
    }

    public class Toad implements Swim {
        public void swim() {
        }
    }
}
