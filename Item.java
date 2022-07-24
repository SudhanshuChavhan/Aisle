public class Item {
    public final String name;
    public final Category cat;
    public final boolean isImported;
    public final float basePrice;

    public Item(String name, Category cat, boolean isImported, float basePrice) {
            this.name = name;
            this.cat = cat;
            this.isImported = isImported;
            this.basePrice = basePrice;
        }
}