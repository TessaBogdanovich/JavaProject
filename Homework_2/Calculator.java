package Homework_2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Calculator {

    static File logFile = null;
    static FileWriter fileWriter= null;
    static FileReader fileReader= null;

    public static void main(String[] args) {

        try{
            logFile = new File("log.txt");
            fileWriter = new FileWriter(logFile);

            for (int i = 0; i < 5; i++){
                fileWriter.write("hello " + i + '\n');
            }
            
            
            

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите первое число: ");
            double x = Double.parseDouble(scanner.nextLine());
            System.out.print("Введите операцию (+ - / *): ");
            char operation = scanner.nextLine().charAt(0);
            System.out.print("Введите второе число: ");
            double y = Double.parseDouble(scanner.nextLine());

            if (operation == '+'){
                System.out.println(x + " + " + y + " = " + plus(x, y));
                System.out.printf("%.2f + %.2f = %.2f\n", x, y, plus(x, y));
            }
            if (operation == '-'){
                System.out.println(x + " - " + y + " = " + minus(x, y));
                System.out.printf("%.2f - %.2f = %.2f\n", x, y, minus(x, y));
            }
            if (operation == '/'){
                System.out.println(x + " / " + y + " = " + divide(x, y));
                System.out.printf("%.2f / %.2f = %.2f\n", x, y, divide(x, y));
            }
            if (operation == '*'){
                System.out.println(x + " * " + y + " = " + multiplication(x, y));
                System.out.printf("%.2f * %.2f = %.2f\n", x, y, multiplication(x, y));
            }
            fileWriter.close();
        }
        catch(Exception e){

        }
    }

    static double plus(double a, double b){
        try{
            fileWriter.write("12344");
        }
        catch(Exception ex){

        }
        return a + b;
    }

    static double minus(double a, double b){
        try{
            fileWriter.write("12344");
        }
        catch(Exception ex){

        } return a - b;
    }

    static double divide(double a, double b){
        try{
            fileWriter.write("12344");
        }
        catch(Exception ex){

        }
        return a / b;
    }
    
    static double multiplication(double a, double b){
        try{
            fileWriter.write("12344");
        }
        catch(Exception ex){

        }
        return a * b;
    }
}
