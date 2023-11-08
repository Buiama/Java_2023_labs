import java.util.ArrayList;
import java.util.Comparator;

public class Necklace {
    private final ArrayList<Stone> necklace;
    public Necklace(ArrayList<Stone> necklace) {
        this.necklace = necklace;
    }

    public Necklace() {
        this.necklace = new ArrayList<>();
    }

    public ArrayList<Stone> getNecklace() {
        return necklace;
    }

    public void addGem(Stone stone) {
        necklace.add(stone);
    }

    public void addGems(ArrayList<Stone> gems) {
        necklace.addAll(gems);
    }

    public double getTotalWeight() {
        return necklace.stream().mapToDouble(Stone::getWeight).sum();
    }

    public double getTotalPrice() {
        return necklace.stream().mapToDouble(Stone::getPrice).sum();
    }

    public void sortByValue() {
        necklace.sort(Comparator.comparingDouble(Stone::getPricePerCarat)
                .thenComparingDouble(Stone::getPrice).reversed());
    }

    @Override
    public String toString() {
        return necklace.toString();
    }
}
