import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Clothes[] clothes = {
                new Clothes("T-short", 21.01, "cotton", "blue", Size.M, Section.WOMEN),
                new Clothes("Trousers", 121, "silk", "red", Size.XS, Section.BABY),
                new Clothes("T-short", 684.32, "wool", "white", Size.XXXXL, Section.MEN),
                new Clothes("Skirt", 862.15, "leather", "purple", Size.L, Section.WOMEN),
                new Clothes("Dress", 115.52, "cotton", "black", Size.XL, Section.KIDS),
                new Clothes("Costume", 381.97, "silk", "lightblue", Size.S, Section.WOMEN),
                new Clothes("Scarf", 968.5, "wool", "pink", Size.XXL, Section.MEN),
                new Clothes("Jacket", 121, "leather", "orange", Size.XXXL, Section.MEN),
                new Clothes("T-short", 862.15, "cotton", "yellow", Size.XXXXXL, Section.MEN),
                new Clothes("T-short", 519.29, "cotton", "brown", Size.XXS, Section.BABY),
        };
        System.out.println("Initial array of clothing objects:");
        print(clothes);
        System.out.println("\nSorted by size:");
        Arrays.sort(clothes, Comparator.comparing(Clothes::getSize));
        print(clothes);
        System.out.println("\nSorted by price descending:");
        Arrays.sort(clothes, Comparator.comparingDouble(Clothes::getPrice).reversed());
        print(clothes);
    }

    public static void print(Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            clothe.print();
        }
    }
}
