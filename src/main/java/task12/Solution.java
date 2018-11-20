package task12;

/*
 Основы StreamAPI.
 Перед заданием почитай эту главу https://metanit.com/java/tutorial/10.1.php
 - Разберись, что делает программа.
 - Измени программу так, чтобы на экран выводились только положительные числа.
 (Подсказка: все очень просто).
 */

import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        int[] numbers = {-5, 2, 4, 5, -10, 10, 0, 24};

        int[] positiveNumbers = IntStream.of(numbers).filter(n -> n < 0).toArray();
        for (int i : positiveNumbers) {
            System.out.println(i);
        }
    }
}
