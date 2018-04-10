import javax.swing.*;
import java.text.DecimalFormat;

public class CalculateDivide extends CalculateParentClass   {
    @Override
    public String calculateIt (float number1, String sign, float number2) throws DivideZeroExeption {

        if (number2 == 0) throw new DivideZeroExeption();

        DecimalFormat decimalFormat = new DecimalFormat();
        return decimalFormat.format(number1 / number2);
    }
}
