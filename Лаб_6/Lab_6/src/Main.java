import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Stone> gems = new ArrayList<>();
        gems.add(new Alexandrite(20000,1.5,0.2));
        gems.add(new Aquamarine(1100,3,0.2));
        gems.add(new Diamond(15800,1.9,0.1));
        gems.add(new Diamond(4040,3,0.18));
        gems.add(new Malachite(3,7,0.9));
        gems.add(new Opal(6500,2,0.4));
        gems.add(new Opal(7,5,0.85));
        gems.add(new Quartz(3,2.5,0.9));
        gems.add(new Malachite(3,7,0.9));

        System.out.println("Your list of gems:");
        print(gems);

        System.out.println("\nPrecious stones from the list:");
        printPrecious(gems);

        System.out.println("\nSemiprecious stones from the list:");
        printSemiprecious(gems);

        Necklace necklace = new Necklace();
        necklace.addGem(new Aquamarine(1100,1.7,0.2));
        ArrayList<Stone> gemsForNecklace = findToNecklace(gems, 0.05, 0.4);
        necklace.addGems(gemsForNecklace);
        necklace.addGem(new Alexandrite(1100,2.5,0.2));

        doOperationsWithNecklace(necklace);

        System.out.println("\n!Necklace from array!");

        Necklace necklaceFromArray = new Necklace(findToNecklace(gems, 0.35, 0.99));
        doOperationsWithNecklace(necklaceFromArray);
    }

    public static ArrayList<Stone> findToNecklace(ArrayList<Stone> gems,
                                                  double minTransparency, double maxTransparency) {
        ArrayList<Stone> fits = new ArrayList<>();
        for (Stone gem : gems) {
            if(gem.getTransparency()>=minTransparency && gem.getTransparency()<=maxTransparency){
                fits.add(gem);
            }
        }
        return fits;
    }

    public static void print(ArrayList<Stone> gems) {
        for (Stone gem : gems) System.out.println(gem);
    }

    public static void printPrecious(ArrayList<Stone> gems) {
        for (Stone gem : gems) {
            if(gem instanceof Precious) System.out.println(gem);
        }
    }

    public static void printSemiprecious(ArrayList<Stone> gems) {
        for (Stone gem : gems) {
            if(gem instanceof Semiprecious) System.out.println(gem);
        }
    }

    public static void doOperationsWithNecklace(Necklace necklace) {
        System.out.println("\nList of gems from the necklace:");
        print(necklace.getNecklace());
        System.out.println("\nTotal price: "+necklace.getTotalPrice());
        System.out.println("Total weight: "+necklace.getTotalWeight());

        necklace.sortByValue();
        System.out.println("\nStones in necklace sorted by price per carat:");
        print(necklace.getNecklace());
    }
}
