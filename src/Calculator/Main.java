package Calculator; // Создал пакет

import java.util.Scanner; // Импортировал класс Scanner для запроса данных от пользователя

public class Main { //точка входа в документ
    public static void main(String[] args) { // основное тело класса

        try (Scanner in = new Scanner(System.in)) {
            System.out.print("Напиши 1-e число.\n"); // сообщение к пользователю на ввод информации
            int numb1 = in.nextInt(); // вот сюда эта информация сохраняется
            System.out.print("Напиши 2-е число.\n"); // сообщение к пользователю на ввод информации
            int numb2 = in.nextInt(); // вот сюда эта информация сохраняется
            int resultOutcome; // создаю переменную результат
            System.out.print("Действие: "); // Вывод сообщения на экран, что будем делать: делить или умножать
            String action = in.nextLine(); // вот сюда мы помещаем символ математической операции
            action = in.nextLine();

            //Дальше использовал схему switch\case — здесь удобнее чем прописывать всё в операторе if

            switch (action) {
                case "+": // Здесь всё просто: если action соответствует знаку +, то складываются две переменные. Дальше расписывать не буду
                    resultOutcome = numb1 + numb2;
                    System.out.print("Результат: " + resultOutcome);
                    break; // вот эта запись прекращает работу программы.
                case "-":
                    resultOutcome = numb1 - numb2;
                    System.out.print("Результат: " + resultOutcome);
                    break;
                case "*":
                    resultOutcome = numb1 * numb2;
                    System.out.print("Результат: " + resultOutcome);
                    break;
                case "/": //Здесь применил if, потому что появилось условие
                    if (numb2 == 0) {
                        System.out.print("Ошибка: на ноль делить может только Чак Норрис.");
                    } else {
                        resultOutcome = numb1 / numb2;
                        System.out.print("Результат: " + resultOutcome);
                    }
                    break;
                default: // Используется если пользователь поведёт себя вне рамок соответствия продукта. Например, поставит на шаге "Действие" процент.
                    System.out.print("Что-то пошло не так.\nПопробуй ещё раз, но с меньшими числами и без процентов.");
            }
        }
    }
}