package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Выберите действие(Введите арифметический знак)");
        String act = in.next();
        System.out.println("Введите второе число");
        int num2 = in.nextInt();
        int ans;
        switch (act) {
            case "+":
                ans = num1 + num2;
                break;
            case "-":
                ans = num1 - num2;
                break;
            case "*":
                ans = num1 * num2;
                break;
            case "/":
                ans = num1 / num2;
                break;
            default:
                System.out.println("Ошибка! Проверьте вводимые данные");
                return;
        }
        System.out.println("Ответ: " + num1 + " " + act + " " + num2 + " = " + ans);
    }
}
