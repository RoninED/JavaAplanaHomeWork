import javax.swing.*;
import java.text.DecimalFormat;

public class CalculateDivide extends CalculateParentClass   {
    @Override
    public void calculateIt (float number1, String sign, float number2) {

        if (number2 == 0) try {
            throw new DivideZeroExeption();
        } catch (DivideZeroExeption divideZeroExeption) {
            JOptionPane.showMessageDialog(null, "Wow wow it is Zero!!!");

        }


        DecimalFormat decimalFormat = new DecimalFormat();
        System.out.printf("%s%s%s=%s", new DecimalFormat().format(number1), sign, decimalFormat.format(number2), decimalFormat.format(number1 / number2));

    }
}
