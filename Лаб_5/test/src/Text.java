class Text {
    private Sentence[] sentences;

    public Text(String text) {
        String[] rawSentences = text.split("[.!?]");
        sentences = new Sentence[rawSentences.length];
        for (int i = 0; i < rawSentences.length; i++) {
            sentences[i] = new Sentence(rawSentences[i]);
        }
    }

    public Sentence[] getSentences() {
        return sentences;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence sentence : sentences) {
            sb.append(sentence.toString()).append(" ");
        }
        return sb.toString().trim();
    }
}