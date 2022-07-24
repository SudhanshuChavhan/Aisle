public class Rounder implements TaxCalculator {
    private TaxCalculator calculator;

    public Rounder(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public Item getItem() {
        return calculator.getItem();
    }

    @Override
    public float calc() {
        int val = 2 + (int)(calculator.calc() * 100);
        int remainder = val % 5;
        return ((float)(val - remainder)) / 100f;
    }
}