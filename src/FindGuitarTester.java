// Simulates a typical day for Rick;
//  -> Customer comes in and tells him what they like,
//  -> Rick runs a search on his inventory

public class FindGuitarTester {

    public static void main(String[] args) {
        // set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar("", 0.0, Builder.FENDER, "Stratocaster",
                                            Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        Guitar guitar = inventory.search(whatErinLikes);
        if (guitar != null) {
            System.out.println("Erin, you might like this " +
                guitar.getBuilder() + " " + guitar.getModel() + " " +
                guitar.getType() + " guitar:\n " +
                guitar.getBackWood() + " back and sides,\n " +
                guitar.getTopWood() + " top.\nYou can have it for only $" +
                guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Add guitars too the inventory.
    }
}
