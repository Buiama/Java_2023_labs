public class Word {
    private final Letter[] letters;
    public Word(String word) {
        this.letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++) {
            this.letters[i] = new Letter(word.charAt(i));
        }
    }

    @Override
    public String toString() {
        String word = "";
        for (Letter l : letters) {
            word +=l;
        }
        return word;
    }
}
