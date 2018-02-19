import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Inventory {

    private List guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    // Create a new Guitar instance and add it to the inventory.
    public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type,
                          Wood backWood, Wood topWood) {
        Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        guitars.add(guitar);
    }
    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;
    }

    // Compare each property of the Guitar object it's passed in to each Guitar object in inventory.
    public List search(Guitar searchGuitar) {
        List matchingGuitars = new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext();) {
            Guitar guitar = (Guitar)i.next();
            // Ignore serial number since that's unique
            // Ignore price since that's unique
            Builder builder = searchGuitar.getBuilder();
            if (searchGuitar.getBuilder() != guitar.getBuilder())
                continue;
            String model = searchGuitar.getModel();
            if ((model != null) && (!model.equals("")) && (!model.equals(guitar.getModel())))
                continue;
            if (searchGuitar.getType() != guitar.getType())
                continue;
            if (searchGuitar.getBackWood() != guitar.getBackWood())
                continue;
            if (searchGuitar.getTopWood() != guitar.getTopWood())
                continue;
            matchingGuitars.add(guitar);
        }
        return matchingGuitars;
    }
}
