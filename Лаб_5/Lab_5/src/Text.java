public class Text {
    private final Sentence[] sentences;
    public Text(String input) {
        input = input.replaceAll("[\\s\\t]+", " ");
        String[] inputText = input.split("[.!?]+");
        this.sentences = new Sentence[inputText.length];
        for(int i = 0; i< inputText.length; i++) {
            sentences[i] = new Sentence(inputText[i].trim());
        }
    }

    public Sentence[] getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        String text = "";
        for (Sentence sentence : sentences) {
            text +=sentence+"\n";
        }
        return text;
    }
}
