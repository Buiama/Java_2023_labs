public class TextModified {
    private final SentenceModified[] sentences;
    public TextModified(String input) {
        input = input.replaceAll("[\\s\\t]+", " ");
        String[] inputText = input.split("[.!?]+");
        this.sentences = new SentenceModified[inputText.length];
        for(int i = 0; i< inputText.length; i++) {
            sentences[i] = new SentenceModified(inputText[i].trim());
        }
    }
    public SentenceModified[] getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        String text = "";
        for (SentenceModified sentence : sentences) {
            text +=sentence+"\n";
        }
        return text;
    }
}
