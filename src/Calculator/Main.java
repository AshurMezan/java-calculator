package Calculator; // Создал пакет

import java.util.Scanner; // Импортировал класс Scanner для запроса данных от пользователя

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Напиши 1-e число.\n");
        while (!in.hasNextInt()) { // добавляем проверку на тип вводимых данных
            System.out.print("Неверный формат ввода. Введите целое число.\n");
            in.next();
        }
        int numb1 = in.nextInt();
        in.nextLine(); // съедаем символ новой строки

        System.out.print("Напиши 2-е число.\n");
        while (!in.hasNextInt()) {
            System.out.print("Неверный формат ввода. Введите целое число.\n");
            in.next();
        }
        int numb2 = in.nextInt();
        in.nextLine();

        int resultOutcome;
        System.out.print("Действие: ");
        String action = in.nextLine();

        switch (action) {
            case "+":
                resultOutcome = numb1 + numb2;
                System.out.print("Результат: " + resultOutcome);
                break;
            case "-":
                resultOutcome = numb1 - numb2;
                System.out.print("Результат: " + resultOutcome);
                break;
            case "*":
                resultOutcome = numb1 * numb2;
                System.out.print("Результат: " + resultOutcome);
                break;
            case "/":
                if (numb2 == 0) {
                    System.out.print("Ошибка: на ноль делить может только Чак Норрис.");
                } else {
                    resultOutcome = numb1 / numb2;
                    System.out.print("Результат: " + resultOutcome);
                }
                break;
            default:
                System.out.print("Что-то пошло не так.\nПопробуй ещё раз, но с меньшими числами и без процентов.");
        }
    }
}