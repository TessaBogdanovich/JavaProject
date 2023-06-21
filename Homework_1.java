import java.util.Scanner;


public class Homework_1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean f = true;
        while(true){
            System.out.println("Укажите номер задачи:");
            System.out.println("1 - Задача 1:");
            System.out.println("2 - Задача 2:");
            System.out.println("0 - Завершение работы приложения");
            System.out.print("Введите номер задачи: ");

            int no = Integer.parseInt(scanner.nextLine());

            if (no == 1){
                sum(args);
            }
            else if (no == 2){
                numbers(args);
            }
            else if (no == 0){
                //f = false;
                System.out.println("Завершение работы приложения.");
                break;
            }
        }
    }
    // Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
    public static void sum(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Введите число: ");
            int numb = in.nextInt();
            int s=0;
            int f=1;
            for (int i = 1; i <= numb; i++) {                
               s+=i;
               f*=i;
            }
            System.out.println("Треугольного число: " + s);
            System.out.println("Факториал числа: " + f);
        }
    }


//Вывести все простые числа от 1 до 1000

    public static void numbers(String[] args) {
        boolean b = true;
        for (int q = 2; q <= 1000; q++) {
            for (int i = 2; i < q; i++) {
                if (q % i == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.println(q);
            else b = true;
        }
    }

}