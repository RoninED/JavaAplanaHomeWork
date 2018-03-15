import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class homeWork1 {
    public static void main(String[] args) throws IOException {
            System.out.println("1 - Калькулятора \n2 - Поиск максимально длиного слова");
            if ("1".equals(new BufferedReader(new InputStreamReader(System.in)).readLine())) Canculator.canculate();
            else Words.longestWord();
    }
}
