public class BaseTaxCalculator implements TaxCalculator {

    protected Item item;

    public BaseTaxCalculator(Item item) {
        this.item = item;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public float calc() {
        return 0;
    }
}