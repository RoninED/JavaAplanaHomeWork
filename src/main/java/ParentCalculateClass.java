import java.text.DecimalFormat;
import java.util.Scanner;

public class ParentCalculateClass implements CalculatorInterface{

    @Override
    public void calculateIt() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите первое число: ");
            float number1 = scanner.nextFloat();
            System.out.print("Выберите действие: ");
            String sign = scanner.next();
            System.out.print("Введите следующее число: ");
            DecimalFormat decimalFormat = new DecimalFormat();
            float number2 = scanner.nextFloat();
            switch (sign) {
                case "+":
                    System.out.printf("%s%s%s=%s", new DecimalFormat().format(number1), sign, decimalFormat.format(number2), decimalFormat.format(number1 + number2));
                    break;
                case "-":
                    System.out.printf("%s%s%s=%s", decimalFormat.format(number1), sign, decimalFormat.format(number2), decimalFormat.format(number1 - number2));
                    break;
                case "*":
                    System.out.printf("%s%s%s=%s", decimalFormat.format(number1), sign, decimalFormat.format(number2), decimalFormat.format(number1 * number2));
                    break;
                case "/":
                    System.out.printf("%s%s%s=%s", decimalFormat.format(number1), sign, decimalFormat.format(number2), decimalFormat.format(number1 / number2));
                    break;
            }
        }
    }
}
