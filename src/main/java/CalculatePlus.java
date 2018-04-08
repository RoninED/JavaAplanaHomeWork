import java.text.DecimalFormat;

public class CalculatePlus extends CalculateParentClass {
    @Override
    public String calculateIt(float number1, String sign, float number2) {
        DecimalFormat decimalFormat = new DecimalFormat();
        return decimalFormat.format(number1 + number2);
    }
}
