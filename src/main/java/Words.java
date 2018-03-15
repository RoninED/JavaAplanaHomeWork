import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Words {
    public static void longestWord () throws IOException {
        ArrayList<String> words = new ArrayList<String>();
        while (true) {
            System.out.println("Добавьте новое слово или нажмите ENTER что бы найти самое длиное слово");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String word = reader.readLine();
            String longword = "";
            if (word.equals("")) {
                for (int i = 0; i < words.size(); i++) {
                    if (words.get(i).length() > longword.length()) longword = words.get(i);
                }
                System.out.println("Самое длиное слово: " + longword);
                break;
            } else {
                words.add(word);
                for (int i = 0; i < words.size(); i++) {
                }
            }

        }
    }
}
