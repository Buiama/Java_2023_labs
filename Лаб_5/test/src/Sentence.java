class Sentence {
    private Object[] components;

    public Sentence(String sentence) {
        String[] parts = sentence.split("(?<=\\W)");
        this.components = new Object[parts.length];
        for (int i = 0; i < parts.length; i++) {
            if (parts[i].matches("\\W+")) {
                components[i] = new Punctuation(parts[i]);
            } else {
                components[i] = new Word(parts[i]);
            }
        }
    }
    public Object[] getComponents() {
        return components;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Object component : components) {
            if (component instanceof Word) {
                sb.append(((Word) component).toString());
            } else if (component instanceof Punctuation) {
                sb.append(((Punctuation) component).toString());
            }
        }
        return sb.toString();
    }
}