import java.util.*;
public class Receipt {

    private List<Item> items;

    public Receipt() {
        items = new ArrayList<>();
    }

    public Receipt addItem(Item item) {
        items.add(item);
        return this;
    }

    public void print() {
        float sTax=0, grandTotal=0;
        for (Item item: items) {
            TaxCalculator calc = new BaseTaxCalculator(item);
            if (item.cat == Category.OTHER)
                calc = new SalesTaxCalculator(calc);
            if (item.isImported)
                calc = new ImportTaxCalculator(calc);
            calc = new Rounder(calc);
            float salesTax = calc.calc();
            System.out.println(item.name + " " + (item.basePrice + salesTax));
            sTax += salesTax;
            grandTotal += item.basePrice;
        }
        grandTotal += sTax;
        System.out.println("Sales Tax: "+ sTax + "  Total: "+ grandTotal);
    }
}