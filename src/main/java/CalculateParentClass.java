import java.text.DecimalFormat;
import java.util.Scanner;

public abstract class CalculateParentClass implements CalculatorInterface {

    @Override
    public abstract String calculateIt(float number1, String sign, float number2) throws DivideZeroExeption;
}


