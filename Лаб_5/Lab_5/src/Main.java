import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter text: ");
        String input = in.nextLine();

        Text inputText = new Text(input);
        System.out.println("\nYour entered text:");
        System.out.println(inputText);

        Set<String> uniqueWords = new TreeSet<>();
        for (Sentence sentence : inputText.getSentences()) {
            for (Word word : sentence.getWords()) {
                if(!word.toString().isEmpty()) uniqueWords.add(word.toString());
            }
        }
        System.out.print("In alphabet order:");
        System.out.println(uniqueWords);

        System.out.println("\nModified mode (spaces are not punctuation)");
        TextModified inputTextModified = new TextModified(input);

        System.out.println("\nYour entered text:");
        System.out.println(inputTextModified);

        Set<String> uniqueWordsModified = new TreeSet<>();
        for (SentenceModified sentence : inputTextModified.getSentences()) {
            for (Object object : sentence.getObjects()) {
                if(object instanceof Word)
                    uniqueWordsModified.add(object.toString());
            }
        }
        System.out.print("In alphabet order:");
        System.out.println(uniqueWordsModified);
    }
}
//r buyeho, r, r frf./ve 	khvlkw			khvlkw. e.gge. e.et. te !!! btr ! ll
