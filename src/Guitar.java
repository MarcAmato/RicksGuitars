public class Guitar {

    // All the properties from the class diagram for the Guitar class.
    private String serialNumber;
    public double price;
    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood, topWood;

    // (UML class diagrams dont show the Guitar constructor)
    // Set all the initial properties for a new guitar.
    public Guitar(String serialNumber, double price,
                  Builder builder, String model, Type type,
                  Wood backWood, Wood topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
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
    public Builder getBuilder() {
        return builder;
    }
    public String getModel() {
        return model;
    }
    public Type getType() {
        return type;
    }
    public Wood getBackWood() {
        return backWood;
    }
    public Wood getTopWood() {
        return topWood;
    }
}