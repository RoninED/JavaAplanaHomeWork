import java.text.DecimalFormat;

public class CalculateMultiply extends CalculateParentClass {
    @Override
    public String calculateIt(float number1, String sign, float number2) {
        DecimalFormat decimalFormat = new DecimalFormat();
//        System.out.printf("%s%s%s=%s", new DecimalFormat().format(number1), sign, decimalFormat.format(number2), decimalFormat.format(number1 * number2));
        return decimalFormat.format(number1 * number2);
    }
}
