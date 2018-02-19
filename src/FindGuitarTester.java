// Simulates a typical day for Rick;
//  -> Customer comes in and tells him what they like,
//  -> Rick runs a search on his inventory

import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0, Builder.FENDER, "Stratocaster",
                                            Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        inventory.addGuitar("", 0, Builder.FENDER, "Stratocaster",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        // Get the whole list of guitars that match the clients specs.
        List matchingGuitars = inventory.search(whatErinLikes);
        // Iterate over all the choices returned from the search tool.
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                System.out.println("We have a " +
                        guitar.getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getType() + " guitar:\n " +
                        guitar.getBackWood() + " back and sides,\n " +
                        guitar.getTopWood() + " top.\n You can have it for only $" +
                        guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars too the inventory.
    }
}
