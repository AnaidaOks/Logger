package BuilderPattern;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер списка: ");
        int arraySize = scanner.nextInt();
        System.out.println("Введите верхнюю границу для значений: ");
        int maxValue = scanner.nextInt();
        logger.log("Создаем и наполняем список");

        ArrayList<Integer> al = new ArrayList<>();
        Random random = new Random();
        while (arraySize != 0) {
            al.add(random.nextInt(maxValue));
            arraySize--;
        }

        System.out.println("Вот случайный список: " + al.toString());
        logger.log("Просим пользователя ввести входные данные для фильтрации");

        System.out.println("Введите порог для фильтра: ");
        int f = scanner.nextInt();

        Filter filter = new Filter(f);

        List<Integer> filteredArray = filter.filterOut(al);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + filteredArray.toString());
        logger.log("Завершаем программу");
    }
}