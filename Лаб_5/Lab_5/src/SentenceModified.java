import java.util.ArrayList;

public class SentenceModified {
    private final ArrayList<Object> objects;

    public SentenceModified(String sentence) {
        objects = new ArrayList<>();
        String word = "";
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetterOrDigit(sentence.charAt(i))) word += sentence.charAt(i);
            else {
                if (!word.isEmpty()) objects.add(new Word(word));
                if (!Character.isSpaceChar(sentence.charAt(i)))
                    objects.add(new Punctuation(Character.toString(sentence.charAt(i))));
                word = "";
            }
        }
        if (!word.isEmpty()) objects.add(new Word(word));
    }

    public ArrayList<Object> getObjects(){
        return objects;
    }

    @Override
    public String toString() {
        String sentence = "";
        for (Object s : objects) {
            sentence+=s+" ";
        }
        return sentence;
    }
}
