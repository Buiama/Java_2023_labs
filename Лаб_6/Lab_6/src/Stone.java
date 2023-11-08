public abstract class Stone {
    private String name;
    private double pricePerCarat;
    private double weight;
    private double transparency;
    public Stone(String name, double pricePerCarat, double weight, double transparency) {
        this.name = name;
        this.pricePerCarat = pricePerCarat;
        this.weight = weight;
        this.transparency = transparency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return pricePerCarat * weight;
    }

    public double getPricePerCarat() {
        return pricePerCarat;
    }

    public void setPricePerCarat(double pricePerCarat) {
        this.pricePerCarat = pricePerCarat;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getTransparency() {
        return transparency;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    @Override
    public String toString() {
        return name + ": price per carat = " + pricePerCarat + "€; weight = "+ weight +" carats; " +
                "total price = " + getPrice() + "€; transparency = " + transparency;
    }
}
