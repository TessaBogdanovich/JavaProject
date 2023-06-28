import java.util.ArrayList;
import java.util.List;

public class Homework_3 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);
        numbers.add(8);
        numbers.add(15);
        numbers.add(3);
        numbers.add(20);

        System.out.println("Список: " + numbers);

        numbers.removeIf(number -> number % 2 == 0);
        System.out.println("Список после удаления четных чисел: " + numbers);

        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if (number < min) {
                min = number;
            }
        }
        System.out.println("Минимальное значение: " + min);

        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Максимальное значение: " + max);

        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = sum / numbers.size();
        System.out.println("Среднее значение: " + average);
    }
}