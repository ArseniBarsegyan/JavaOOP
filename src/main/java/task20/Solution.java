package task20;

/*
 Вспомни, что такое факториал.
 Перепиши функцию, вычисляющую факториал, чтобы она корректно вычисляла факториал.
 Подсказка: данные задачи являются типовыми. Чаще всего их можно нагуглить за 2-3 минуты,
 написал в google "java factorial example" и т.п.
 Наиболее распространенный источник ответов - StackOverflow.
 По мере роста твоих навыков ты будешь находить ответы гораздо быстрее.
 Главное - правильно составить запрос.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(factorial(4)); // Should be 24
    }

    private static long factorial(int number) {
        int subNumber = number;
        for (int i = (number - 1); i > 1; i--) {
            subNumber = subNumber * i;
        }
        return subNumber;
    }
}
