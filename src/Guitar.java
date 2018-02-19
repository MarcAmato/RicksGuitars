public class Guitar {

    // All the properties from the class diagram for the Guitar class.
    private String serialNumber;
    public double price;
    GuitarSpec spec;

    // (UML class diagrams dont show the Guitar constructor)
    // Set all the initial properties for a new guitar.
    public Guitar(String serialNumber, double price, GuitarSpec spec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.spec = spec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(float newPrice) {
        this.price = newPrice;
    }
    public GuitarSpec getSpec() {
        return spec;
    }
}
