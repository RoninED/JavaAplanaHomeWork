import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("1 - Калькулятора "
                + "\n2 - Поиск максимально длиного слова "
                + "\n3 - Домашнее задание №4.1"
                + "\n4 - Домашнее задание №4.2"
        );
        switch (new BufferedReader(new InputStreamReader(System.in)).readLine()) {
            case "1":
                Canculator.canculate();
                break;
            case "2":
                Words.longestWord();
                break;
            case "3":
                homeWork41();
                break;
            case "4":
                homeWork42();
                break;
        }
    }

    public static void homeWork41() {
        int arr[] = new int[21];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (-10 + (Math.random() * 30));
            System.out.print(arr[i] + "/");
        }
        int indMaxMinus = 100;
        int indexMinPlus = 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                if (indMaxMinus == 100) indMaxMinus = i;
                else if (arr[i] > arr[indMaxMinus]) indMaxMinus = i;
            }
            if (arr[i] > 0) {
                if (indexMinPlus == 100) indexMinPlus = i;
                else if (arr[i] < arr[indexMinPlus]) indexMinPlus = i;
            }

        }
        int tempInt = arr[indexMinPlus];
        System.out.println();
        System.out.println(indexMinPlus + "/" + indMaxMinus);
        arr[indexMinPlus] = arr[indMaxMinus];
        arr[indMaxMinus] = tempInt;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "/");
        }
    }

    public static void homeWork42() {
        ArrayList<HomeWork42Sweets> sweetsList = new ArrayList<>();
        sweetsList.add(new HomeWork42Sweets(0, "Шоколадка", "Mars", 0.100, 45));
        sweetsList.add(new HomeWork42Sweets(1, "Шоколадка", "Киндер Сюрприз", 0.100, 75));
        sweetsList.add(new HomeWork42Sweets(2, "Конфеты", "Красный октябрь", 0.200, 60));
        sweetsList.add(new HomeWork42Sweets(3, "Конфеты", "Золотой ключ", 0.200, 65));
        sweetsList.add(new HomeWork42Sweets(4, "Зефир", "Зефир в шоколаде", 0.250, 90));
        sweetsList.add(new HomeWork42Sweets(5, "Пиво", "Балтика 9", 0.500, 85));
        sweetsList.add(new HomeWork42Sweets(6, "Печенье", "Коровка", 0.400, 70));


        //формируем корзину. первое число индекс товара, второе его количество
        int[][] basket = new int[2][(int) (1 + Math.random() * 10)];
        double sumPrise = 0;
        double sumWeight = 0;
        for (int i = 0; i < basket[0].length; i++) {
            basket[0][i] = (int) (0 + Math.random() * sweetsList.size());
            basket[1][i] = (int) (1 + Math.random() * 10);
            System.out.printf("%-10s\t %-20s" +
                            "\t%s%.2f" +
                            "\t%s%d" +
                            "\t%s%.2f" +
                            "\t%s%.2f%s\n",
                    sweetsList.get(basket[0][i]).getType(), sweetsList.get(basket[0][i]).getName()
                    , "Цена: ", sweetsList.get(basket[0][i]).getPrise()
                    , "  Кол-во: ", basket[1][i]
                    , "  Итого: ", (basket[1][i] * sweetsList.get(basket[0][i]).getPrise())
                    , "  Масса: ", (basket[1][i] * sweetsList.get(basket[0][i]).getWeight()), " kg"
            );
            sumPrise = sumPrise + (sweetsList.get(basket[0][i]).getPrise() * basket[1][i]);
            sumWeight = sumWeight + sweetsList.get(basket[0][i]).getWeight() * basket[1][i];
        }

        for (int i = 0; i < basket[0].length; i++) {

        }
        System.out.println("Итоговая стоимость: " + sumPrise);
        System.out.println("Итоговый вес: " + sumWeight + " kg");

    }
}
