public class Letter {
    private final char character;
    public Letter(char character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return Character.toString(character);
    }
}
