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

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocaster",
                                            Type.ELECTRIC, Wood.ALDER, Wood.ALDER);



        // Get the whole list of guitars that match the clients specs.
        List matchingGuitars = inventory.search(whatErinLikes);
        // Iterate over all the choices returned from the search tool.
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Iterator i = matchingGuitars.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar)i.next();
                GuitarSpec spec = guitar.getSpec();
                System.out.println("We have a " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n " +
                        spec.getBackWood() + " back and sides,\n " +
                        spec.getTopWood() + " top.\n You can have it for only $" +
                        guitar.getPrice() + "!\n ----");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars too the inventory.
        inventory.addGuitar("", 0, Builder.FENDER, "Stratocaster",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}
