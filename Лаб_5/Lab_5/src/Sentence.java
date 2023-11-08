public class Sentence {
    private final Word[] words;
    private final Punctuation[] punctuations;
    private boolean startsWithWord;

    public Sentence(String sentence) {
        String[] onlyWords = sentence.split("\\W+");
        this.words = new Word[onlyWords.length];
        for (int i = 0; i < onlyWords.length; i++) {
            words[i] = new Word(onlyWords[i]);
        }
        if (onlyWords.length>0 && !onlyWords[0].isEmpty())
            this.startsWithWord = true;
        String[] onlyPunctuation = sentence.split("\\w+");
        this.punctuations = new Punctuation[onlyPunctuation.length];
        for (int i = 0; i < onlyPunctuation.length; i++) {
            punctuations[i] = new Punctuation(onlyPunctuation[i]);
        }
    }

    public Word[] getWords() {
        return words;
    }

    @Override
    public String toString() {
        String sentence = "";
        if (punctuations.length == 0) return words[0].toString();
        if (words.length == 0) return punctuations[0].toString();
        if (startsWithWord && punctuations.length == words.length) {
            for (int i = 0; i < words.length; i++) {
                sentence += punctuations[i];
                sentence += words[i];
            }
            return sentence;
        }
        if (startsWithWord) {
            for (int i = 1; i < punctuations.length; i++) {
                sentence += words[i - 1];
                sentence += punctuations[i];
            }
            return sentence;
        }
        for (int i = 1; i < words.length; i++) {
            sentence += punctuations[i - 1];
            sentence += words[i];
        }
        return sentence;
    }
}
