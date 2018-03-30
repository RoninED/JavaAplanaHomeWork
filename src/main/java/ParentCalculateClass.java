import java.text.DecimalFormat;
import java.util.Scanner;

public class ParentCalculateClass implements CalculatorInterface {

    @Override
    public void calculateIt(float number1, String sign, float number2) {
        DecimalFormat decimalFormat = new DecimalFormat();
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


    @Override
    public void calculateIt(float number1, String sign, float number2, String sign2, float number3) {
        DecimalFormat decimalFormat = new DecimalFormat();
        float firstResualt = 0;

        if ((sign2.equals("*") & (sign.equals("-") | sign.equals("+"))) | (sign2.equals("/") & (sign.equals("-") | sign.equals("+")))) {

            switch (sign2) {
                case "+":
                    firstResualt = number2 + number3;
                    break;
                case "-":
                    firstResualt = number2 - number3;
                    break;
                case "*":
                    firstResualt = number2 * number3;
                    break;
                case "/":
                    firstResualt = number2 / number3;
                    break;
            }
            switch (sign) {
                case "+":
                    System.out.printf("%s%s%s%s%s=%s", new DecimalFormat().format(number1), sign, decimalFormat.format(number2), sign2, decimalFormat.format(number3), decimalFormat.format(number1 + firstResualt));
                    break;
                case "-":
                    System.out.printf("%s%s%s%s%s=%s", decimalFormat.format(number1), sign, decimalFormat.format(number2), sign2, decimalFormat.format(number3), decimalFormat.format(number1 - firstResualt));
                    break;
                case "*":
                    System.out.printf("%s%s%s%s%s=%s", decimalFormat.format(number1), sign, decimalFormat.format(number2), sign2, decimalFormat.format(number3), decimalFormat.format(number1 * firstResualt));
                    break;
                case "/":
                    System.out.printf("%s%s%s%s%s=%s", decimalFormat.format(number1), sign, decimalFormat.format(number2), sign2, decimalFormat.format(number3), decimalFormat.format(number1 / firstResualt));
                    break;
            }
        } else {
                switch (sign) {
                case "+":
                    firstResualt = number1 + number2;
                    break;
                case "-":
                    firstResualt = number1 - number2;
                    break;
                case "*":
                    firstResualt = number1 * number2;
                    break;
                case "/":
                    firstResualt = number1 / number2;
                    break;
            }
            switch (sign2) {
                case "+":
                    System.out.printf("%s%s%s%s%s=%s", new DecimalFormat().format(number1), sign, decimalFormat.format(number2), sign2, decimalFormat.format(number3), decimalFormat.format(firstResualt + number1));
                    break;
                case "-":
                    System.out.printf("%s%s%s%s%s=%s", decimalFormat.format(number1), sign, decimalFormat.format(number2), sign2, decimalFormat.format(number3), decimalFormat.format(firstResualt - number1));
                    break;
                case "*":
                    System.out.printf("%s%s%s%s%s=%s", decimalFormat.format(number1), sign, decimalFormat.format(number2), sign2, decimalFormat.format(number3), decimalFormat.format(firstResualt * number1));
                    break;
                case "/":
                    System.out.printf("%s%s%s%s%s=%s", decimalFormat.format(number1), sign, decimalFormat.format(number2), sign2, decimalFormat.format(number3), decimalFormat.format(firstResualt / number1));
                    break;
            }

        }
    }
}


