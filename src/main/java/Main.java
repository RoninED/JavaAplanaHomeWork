import java.io.*;
import java.sql.SQLOutput;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, DivideZeroExeption {
        System.out.println("1 - Калькулятор"
                + "\n2 - Поиск максимально длиного слова "
                + "\n3 - Домашнее задание № 4.1. Поменять два числа в массиве"
                + "\n4 - Домашнее задание № 4.2. Чек сладостей"
                + "\n5 - Домашнее задание № 5. ООП Калькулятор"
                + "\n6 - Домашнее задание № 6. Работа с текстом из файла"
        );
        switch (new BufferedReader(new InputStreamReader(System.in)).readLine()) {
            case "1":
                Calculator.canculate();
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
            case "5":
                homeWork5();
                break;
            case "6":
                homeWork6();
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

    public static void homeWork5() throws DivideZeroExeption {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            float number1 = scanner.nextFloat();
            System.out.print("Выберите действие: ");
            String sign = scanner.next();
            System.out.print("Введите следующее число: ");
            float number2 = scanner.nextFloat();
            switch (sign) {
                case "+":
                    new CalculatePlus().calculateIt(number1, sign, number2);
                    break;
                case "-":
                    new CalculateMinus().calculateIt(number1, sign, number2);
                    break;
                case "*":
                    new CalculateMultiply().calculateIt(number1, sign, number2);
                    break;
                case "/":
                    new CalculateDivide().calculateIt(number1, sign, number2);
                    break;
            }
        }
    }

    public static void homeWork6() {
        try {
            FileReader fr = new FileReader("task6.txt");
            BufferedReader br = new BufferedReader(fr);
            String fileMessage = " ";
            String tempString =null;
            while ((tempString = br.readLine())!=null ){
               if (!tempString.equals("")| tempString.equals("\n"))fileMessage = (fileMessage + " " + tempString);
            }

            System.out.println("\nФайл содержит: " + fileMessage);
            br.close();
            fr.close();

            String[] messageArr = fileMessage.split(" ");
            System.out.print("\nСортировка по алфавиту: ");
            Arrays.sort(messageArr);
            for (int i = 0; i < messageArr.length; i++) {
                System.out.print(messageArr[i] + " ");
            }
            System.out.println();

            System.out.println("\nКоличество повторений:");
            ArrayList[] counter = new ArrayList[2];
            counter[0] = new ArrayList<String>();
            counter[1] = new ArrayList<Integer>();
            for (int i = 0; i < messageArr.length; i++) {
                boolean newWord = true;
                for (int j = 0; j < counter[0].size(); j++) {
                    if (counter[0].get(j).equals(messageArr[i])) {
                        newWord = false;
                        counter[1].set(j, (Integer) counter[1].get(j) + 1);
                    }
                }
                if (newWord == true) {
                    counter[0].add(messageArr[i]);
                    counter[1].add(1);
                }
            }
            for (int i = 0; i < counter[0].size(); i++) {
                System.out.println(counter[0].get(i) + " = " + counter[1].get(i));
            }

            System.out.print("\nCлово с максимальным количеством повторений: ");
            int maxCount = 0;
            int indexMax = 0;
            for (int i = 0; i < counter[1].size(); i++) {
                if (maxCount < (Integer) counter[1].get(i)) {
                    maxCount = (Integer) counter[1].get(i);
                    indexMax = i;
                }
            }
            System.out.println(counter [0].get(indexMax) + "\nПовторений = "+ counter [1].get(indexMax));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}

