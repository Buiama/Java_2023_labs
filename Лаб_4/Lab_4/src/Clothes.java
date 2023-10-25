public class Clothes {
    private String name;
    private double price;
    private String material;
    private String color;
    private Size size;
    private Section section;

    public Clothes(String name, double price, String material,
                   String color, Size size, Section section) {
        this.name = name;
        this.price = price;
        this.material = material;
        this.color = color;
        this.size = size;
        this.section = section;
    }

    public void print() {
        System.out.println("Name: "+name+"; Price: "+price+
                "; Material: "+material+"; Color: "+color+
                "; Size: "+size+"; Section: "+section);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}
