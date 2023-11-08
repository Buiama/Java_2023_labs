import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String rawText = "r buyeho frf./ve, khv /lkw,,. e.gge. e.et. te !!! btr ! ll";
        rawText = rawText.replaceAll("[\\s\\t]+", " ");

        Text text = new Text(rawText);

        Set<String> uniqueWords = new TreeSet<>();
        for (Sentence sentence : text.getSentences()) {
            for (Object component : sentence.getComponents()) {
                if (component instanceof Word) {
                    uniqueWords.add(component.toString());
                }
            }
        }
        System.out.println(text);
        uniqueWords.forEach(System.out::println);
    }
}
